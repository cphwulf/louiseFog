package business.entities;

import java.util.List;

public class Order {

    int ordreId;
    double prisTotal;
    int kundeId;
    String kundeMail;
    int length;
    int width;
    boolean shed;
    String status;


    public Order(int kunde_Id,int length, int width, boolean shed) {

        this.kundeId = kunde_Id;
        this.length = length;
        this.width = width;
        this.shed = shed;
        this.status = "Created";
    }

    public Order(int orderId, int kundeid, int length, int width, boolean shed, double pris, String status) {
        this.ordreId = orderId;
        this.kundeId = kundeid;
        this.length = length;
        this.width = width;
        this.shed = shed;
        this.prisTotal = pris;
        this.status = status;
    }

    public int getOrdreId() {
        return ordreId;
    }

    public int getKundeId() {
        return kundeId;
    }

    public String getKundeMail() {
        return kundeMail;
    }

    public void setKundeMail(String kundeMail) {
        this.kundeMail = kundeMail;
    }

    public void setOrdreId(int ordreId) {
        this.ordreId = ordreId;
    }

    public double getPrisTotal() {
        return prisTotal;
    }

    public int getKunde_Id() {
        return kundeId;
    }

    public String getStatus() {
        return status;
    }

    public void setPrisTotal(double prisTotal) {
        this.prisTotal = prisTotal;
    }

    public void setKunde_Id(int kunde_Id) {
        this.kundeId = kunde_Id;
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
    @Override
    public String toString() {
        return "Order{" +
                "ordreId=" + ordreId +
                ", prisTotal=" + prisTotal +
                ", kunde_Id=" + kundeId +
                ", length=" + length +
                ", width=" + width +
                ", shed=" + shed +
                ", status='" + status + '\'' +
                '}';
    }
}

