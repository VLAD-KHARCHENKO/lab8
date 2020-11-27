

public class Model {
    private  int id;
    private String brand;
    private String types;
    private   float diagonal;
    private int price;

    public Model(int id, String brand, String types, float diagonal, int price) {
        this.id = id;
        this.brand = brand;
        this.types = types;
        this.diagonal = diagonal;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}