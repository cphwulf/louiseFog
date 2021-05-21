package business.persistence;

import business.entities.Order;
import business.entities.User;
import business.exceptions.UserException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {
    private Database database;

    public OrderMapper(Database database)
    {
        this.database = database;
    }

    public void createOrder(Order order) throws UserException
    {
        try (Connection connection = database.connect())
        {
            String sql = "INSERT INTO orders (total_amount, customer_id, carport_length, carport_width, status) VALUES (?,?, ?, ?, ?)";
            try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
            {
                ps.setDouble(1, order.getPrisTotal());
                ps.setInt(2, order.getKunde_Id());
                ps.setInt(3, order.getLength());
                ps.setInt(4,order.getWidth());
                ps.setString(5, order.getStatus());
                ps.executeUpdate();
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                int id = ids.getInt(1);
                order.setOrdreId(id);
            }
            catch (SQLException ex)
            {
                throw new UserException(ex.getMessage());
            }
        }
        catch (SQLException ex)
        {
            throw new UserException(ex.getMessage());
        }
    }

    public List<Order> getOrderByCustomerId(int id) throws UserException {
        List<Order> orders = new ArrayList<>();
        try (Connection connection = database.connect())
        {
            String sql = "SELECT * FROM ordre WHERE Kunde_kunde_Id = ?";

            try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
            {

                ps.setInt(1, id);
                ResultSet resultSet = ps.executeQuery();
                while (resultSet.next()){
                    int orderId = resultSet.getInt("ordre_Id");
                    double pris = resultSet.getDouble("prisTotal");
                    int length = resultSet.getInt("length");
                    int width = resultSet.getInt("width");
                    boolean shed = resultSet.getBoolean("shed");
                    String status = resultSet.getString("status");

                    Order order = new Order(orderId,id,length, width, shed, pris, status);
                    orders.add(order);

                }
                return orders;
            }
            catch (SQLException ex)
            {
                throw new UserException(ex.getMessage());
            }
        }
        catch (SQLException | UserException ex)
        {
            throw new UserException(ex.getMessage());
        }


    }

    public List<Order> getAllOrders() throws UserException {
        List<Order> orders = new ArrayList<>();
        try (Connection connection = database.connect())
        {
            String sql = "SELECT * FROM orders";

            try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
            {

                ResultSet resultSet = ps.executeQuery();
                while (resultSet.next()){
                    int orderId = resultSet.getInt("id");
                    int kundeId = resultSet.getInt("customer_id");
                    double pris = resultSet.getDouble("total_amount");
                    int length = resultSet.getInt("shed_length");
                    int width = resultSet.getInt("shed_width");
                    //boolean shed = resultSet.getBoolean("shed");
                    boolean shed = false;
                    String status = resultSet.getString("status");

                    Order order = new Order(kundeId,length, width, shed);
                    order.setOrdreId(orderId);
                    order.setShed(shed);
                    order.setStatus(status);
                    orders.add(order);

                }
                return orders;
            }
            catch (SQLException ex)
            {
                throw new UserException(ex.getMessage());
            }
        }
        catch (SQLException | UserException ex)
        {
            throw new UserException(ex.getMessage());
        }

    }

    public Order getOrderByOrderId(int id) throws SQLException {
        Order order = null;
        try (Connection connection = database.connect())
        {
            String sql = "SELECT * FROM orders where id=?";

            try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
            {
                ps.setInt(1,id);
                ResultSet resultSet = ps.executeQuery();
                while (resultSet.next()){
                    int orderId = resultSet.getInt("id");
                    int kundeId = resultSet.getInt("customer_id");
                    double pris = resultSet.getDouble("total_amount");
                    int length = resultSet.getInt("carport_width");
                    int width = resultSet.getInt("carport_length");
                    //boolean shed = resultSet.getBoolean("shed");
                    boolean shed = false;
                    String status = resultSet.getString("status");
                    order = new Order(orderId, kundeId,length, width, shed, pris, status);
                }
                return order;
            }
            catch (SQLException ex)
            {
                throw new SQLException();
            }
        }
    }

}
