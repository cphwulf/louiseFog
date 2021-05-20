package business.persistence;

import business.entities.Order;
import business.exceptions.UserException;

import javax.xml.crypto.Data;
import java.util.List;

public class OrderMapperSimpleImpl implements OrderMapperI{
    Database db;
    private List<Order> allOrders;

    public OrderMapperSimpleImpl(Database db) {
        this.db = db;
    }

    @Override
    public Order getOrderById(int id) {
        Order order = null;

    }

    @Override
    public List<Order> getAllOrders() throws UserException {
        if (allOrders==null) {
            initOrder();
        }
        return null;
    }

    private void initOrder() {
    }

    @Override
    public Order createOrder() throws UserException {
        return null;
    }
}
