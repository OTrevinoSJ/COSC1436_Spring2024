public class Car {

    // class fields
    private String model;
    private String brand;
    private String color;
    private int cost;

    // Constructor to construct the object
    Car(String model, String brand, String color, int cost) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.cost = cost;
    }

    // Getters & Setters for class fields
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    

    

}
