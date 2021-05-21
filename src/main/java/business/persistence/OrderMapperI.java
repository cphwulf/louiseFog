package business.persistence;

import business.entities.Order;
import business.exceptions.UserException;

import java.util.List;

public interface OrderMapperI {
    Order getOrderById(int id);
    List<Order> getAllOrders() throws UserException;
    Order createOrder() throws UserException;
    Order createOrder(int kundeId, int length, int width, boolean shed);
}
