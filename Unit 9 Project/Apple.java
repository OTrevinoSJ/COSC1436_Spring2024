public class Apple {

    // (Bonus) static variable
    static int amountOfApples = 0;

    // class fields
    private FruitSize size;
    private String color;
    private String age;

    // Constructor to construct the object
    public Apple(FruitSize size, String color, String age) {
        this.size = size;
        this.color = color;
        this.age = age;
        amountOfApples += 1;
    }

    // Getters & Setters for class fields
    public FruitSize getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }

    public String getAge() {
        return this.age;
    }

    public void setSize(FruitSize size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(String age) {
        this.age = age;
    }


}