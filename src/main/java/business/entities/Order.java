package business.entities;

import java.util.List;

public class Order {
    double prisTotal;
    int kunde_Id;
    int carport_length;
    int carport_width;
    List<OrderItems> orderItemsList;
    String status;


    public Order(int kunde_Id) {
        this.kunde_Id = kunde_Id;
        this.status = "Oprettet";
    }

    public double getPrisTotal() {
        return prisTotal;
    }

    public int getKunde_Id() {
        return kunde_Id;
    }

    public List<OrderItems> getOrderItemsList() {
        return orderItemsList;
    }

    public String getStatus() {
        return status;
    }
    public void addOrderItem(OrderItems orderItems) {
        orderItemsList.add(orderItems);
    }

    public void setPrisTotal(double prisTotal) {
        this.prisTotal = prisTotal;
    }

    public void setKunde_Id(int kunde_Id) {
        this.kunde_Id = kunde_Id;
    }

    public void setCarport_length(int carport_length) {
        this.carport_length = carport_length;
    }

    public void setCarport_width(int carport_width) {
        this.carport_width = carport_width;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCarport_length() {
        return carport_length;
    }

    public int getCarport_width() {
        return carport_width;
    }

}

