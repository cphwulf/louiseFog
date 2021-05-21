package business.services;

import business.entities.Carport;
import business.entities.Order;
import business.entities.User;
import business.exceptions.UserException;
import business.persistence.CarportMapper;
import business.persistence.Database;
import business.persistence.OrderMapper;
import business.persistence.OrderMapperI;
import business.persistence.UserMapper;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public class OrderFacade {
=======
public class OrderFacade implements OrderMapperI {
>>>>>>> merge1
    OrderMapper orderMapper;
    //double pris; //Ændres til udregning af prisen

    public OrderFacade(Database database /*double pris*/)
    {
        orderMapper = new OrderMapper(database);
        //this.pris = pris;
    }

<<<<<<< HEAD
    public Order createOrder(int kundeId, int length, int width, boolean shed) {

=======
    @Override
    public Order getOrderById(int id) {
        Order order = null;

        return order;
    }

    @Override
    public List<Order> getAllOrders() throws UserException {
        List<Order> allOrders = new ArrayList<>();
        //Order order = new Order(pris, kunde_kunde_Id, carport_carport_Id, "Active");
        //orderMapper.createOrder(order);
        return allOrders;
    }

    @Override
    public Order createOrder() throws UserException {
>>>>>>> merge1
        //Order order = new Order(pris, kunde_kunde_Id, carport_carport_Id, "Active");
        //orderMapper.createOrder(order);
        Order order = new Order(kundeId, length, width, shed);
        try {
            orderMapper.createOrder(order);
        } catch (UserException e) {
            e.printStackTrace();
        }
        return order;
    }

    public List<Order> listOrderByCustomerId(int id) throws UserException {
        List<Order> orderList = new ArrayList<>();
        orderList = orderMapper.getOrderByCustomerId(id);


        return orderList;
    }

    public List<Order> listAllOrders() throws UserException {
        List<Order> orderList = new ArrayList<>();
        orderList = orderMapper.getAllOrders();

        return orderList;
    }

}
