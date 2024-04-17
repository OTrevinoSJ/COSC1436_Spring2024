public class Apple {

    // (Bonus) static variable
    static int amountOfApples = 0;

    private FruitSize DEFAULT_SIZE = FruitSize.MEDIUM;

    // class instance fields
    private int size;
    private String color;

    // Constructor to construct the object
    public Apple(int size, String color) {
        setSize(size);
        this.color = color;
        amountOfApples += 1;
    }

    // Getters & Setters for class fields
    public int getSize() {
        return this.size;
    }

    /*
     * This function gets the color of the apple
     */
    public String getColor() {
        return this.color;
    }

    /*
     * This function changes the value of size if the size is lower or higher than the ranges that are given by the enum class
     */
    public void setSize(int size) {
        int min = FruitSize.SMALL.getNumberSize() - 1;
        int max = FruitSize.LARGE.getNumberSize();
        if (size <= min || size  > max) {
            this.size = DEFAULT_SIZE.getNumberSize();
        } else {
            this.size = size;
        }
    }

    // This method set the color of the apple
    public void setColor(String color) {
        this.color = color;
    }

}