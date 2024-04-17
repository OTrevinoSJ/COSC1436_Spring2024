public class Car {

    // class fields
    private String model;
    private String brand;
    private String color;
    private int cost;

    /**
     * 
     * @param model model of the vehicle
     * @param brand brand of the vehicle
     * @param color color of the vehicle
     * @param cost cost of the vehicle
     */
    Car(String model, String brand, String color, int cost) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.cost = cost;
    }

    /**
     * A method to retrieve the model of the vehicle
     * @return the model of the vehicle
     */
    public String getModel() {
        return model;
    }

    /**
     * A method to retrieve the brand of the vehicle
     * @return the brand of the vehicle
     */
    public String getBrand() {
        return brand;
    }

    /**
     * A method to retrieve the color property of the vehicle
     * @return the color of the vehicle
     */
    public String getColor() {
        return color;
    }

    /**
     * A method to retrieve the cost of the vehicle
     * @return the cost of the vehicle
     */
    public int getCost() {
        return cost;
    }

    /**
     * A method to set the model for the vehicle
     * @param model model of the vehicle
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * A method to set the brand for the vehicle
     * @param brand brand of the vehicle
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * A method to set the color of the vehicle
     * @param color color of the vehicle
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * A method to set the cost of the vehicle
     * @param cost cost of the vehicle
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    

    

}
