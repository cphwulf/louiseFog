package business.entities;

public class OrderItems {
    Material material;
    int quantity;
    int length;

    public OrderItems(Material material, int quantity, int length) {
        this.material = material;
        this.quantity = quantity;
        this.length = length;
    }

    public Material getMaterial() {
        return material;
    }

    public int getQuantity() {
        return quantity;
    }
}
