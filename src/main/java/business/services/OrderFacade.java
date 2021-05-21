package business.services;

import business.entities.Order;
import business.entities.User;
import business.exceptions.UserException;
import business.persistence.Database;
import business.persistence.OrderMapper;
import business.persistence.OrderMapperI;
import business.persistence.UserMapper;

import java.util.ArrayList;
import java.util.List;

public class OrderFacade implements OrderMapperI {
    OrderMapper orderMapper;
    double pris; //Ændres til udregning af prisen

    public OrderFacade(Database database, double pris)
    {
        orderMapper = new OrderMapper(database);
        this.pris = pris;
    }

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
        //Order order = new Order(pris, kunde_kunde_Id, carport_carport_Id, "Active");
        //orderMapper.createOrder(order);
        Order order = null;
        return order;
    }
}
