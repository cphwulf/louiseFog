package business.persistence;

import business.entities.Order;
import business.exceptions.UserException;
import business.entities.User;

import java.io.StringReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public class UserMapper
{
    private Database database;
    private List<User> allUsers;

    public UserMapper(Database database)
    {
        this.database = database;
        allUsers = new ArrayList<>();

    }

    public void createUser(User user) throws UserException
    {
        try (Connection connection = database.connect())
        {
            String sql = "INSERT INTO users (email, password, role ) VALUES (?, ?, ?)";

            try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
            {
                ps.setString(2, user.getEmail());
                ps.setString(5, user.getPassword());
                ps.setString(6,user.getRole());
                ps.executeUpdate();
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                int id = ids.getInt(1);
                user.setId(id);
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

    public User login(String email, String password) throws UserException
    {
        try (Connection connection = database.connect())
        {
            String sql = "SELECT id, email, role FROM users WHERE email=? AND password=?";

            try (PreparedStatement ps = connection.prepareStatement(sql))
            {
                ps.setString(1, email);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if (rs.next())
                {
                    String role = rs.getString("role");
                    int id = rs.getInt("id");

                    User user = new User(email,password,role);
                    user.setId(id);
                    return user;
                } else
                {
                    throw new UserException("Could not validate user");
                }
            }
            catch (SQLException ex)
            {
                throw new UserException(ex.getMessage());
            }
        }
        catch (SQLException ex)
        {
            throw new UserException("Connection to database could not be established");
        }
    }

    public List<User> getAllUsers() {
        if (allUsers.size()==0) {
            try {
                this.getAllUsersFromDB();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return allUsers;
    }

    private void getAllUsersFromDB() throws SQLException {
        try (Connection connection = database.connect())
        {
            String sql = "SELECT * FROM users";

            try (PreparedStatement ps = connection.prepareStatement(sql))
            {

                ResultSet resultSet = ps.executeQuery();
                while (resultSet.next()){
                    int userid = resultSet.getInt("id");
                    String email = resultSet.getString("email");
                    String password = resultSet.getString("password");
                    String role = resultSet.getString("role");
                    User user = new User(email,password,role);
                    user.setId(userid);
                    allUsers.add(user);
                }
            }
            catch (SQLException ex)
            {
                throw new SQLException();
            }
        }
    }

    public User getNameFromId(int id) {
        User retValUser = null;
        if (allUsers.size()==0) {
            try {
                this.getAllUsersFromDB();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        for (User user: allUsers ) {
            if (user.getId()==id) {
                retValUser = user;
                return retValUser;
            }

        }
        return  retValUser;
    }
}
