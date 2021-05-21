package business.entities;

import java.util.List;

public class Order {
    int ordreId;
    double prisTotal;
    int kunde_Id;
    int length;
    int width;
    boolean shed;
    String status;


    public Order(int kunde_kunde_Id,int length, int width, boolean shed) {
        kunde_Id = kunde_kunde_Id;
        this.length = length;
        this.width = width;
        this.shed = shed;
        this.status = "Created";
    }

    public Order(int orderId, int kundeid, int length, int width, boolean shed, double pris, String status) {
        this.kunde_Id = kundeid;
        this.ordreId = orderId;
        this.length = length;
        this.width = width;
        this.shed = shed;
        this.prisTotal = pris;
        this.status = status;
    }

    public void setOrdreId(int ordreId) {
        this.ordreId = ordreId;
    }

    public double getPrisTotal() {
        return prisTotal;
    }

    public int getKunde_Id() {
        return kunde_Id;
    }

    public String getStatus() {
        return status;
    }

    public void setPrisTotal(double prisTotal) {
        this.prisTotal = prisTotal;
    }

    public void setKunde_Id(int kunde_Id) {
        this.kunde_Id = kunde_Id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isShed() {
        return shed;
    }

    public void setShed(boolean shed) {
        this.shed = shed;
    }
}

