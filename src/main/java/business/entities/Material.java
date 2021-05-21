package business.entities;

public class Material {
    //Sæt længder ind på materialer
    int matid;
    String matName; //spær, stolpe, rem,
    String matWH;//95x200
    String description;
    String unit;
    double pricePerUnit;

    public int getMatid() {
        return matid;
    }

    public String getMatName() {
        return matName;
    }

    public String getMatWH() {
        return matWH;
    }

    public String getDescription() {
        return description;
    }

    public String getUnit() {
        return unit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}


