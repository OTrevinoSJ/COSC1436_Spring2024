public class Apple {

    // (Bonus) static variable
    static int amountOfApples = 0;

    // An enum to determine what fruit sizes are available
    private FruitSize DEFAULT_SIZE = FruitSize.MEDIUM;

    // class instance fields
    private int size;
    private String color;

    /**
     * A constructor to create an instance of the apple class
     * @param size
     * @param color
     */
    public Apple(int size, String color) {
        setSize(size);
        this.color = color;
        amountOfApples += 1;
    }

    /**
     * A method to retrieve the size attribute
     * @return
     */
    public int getSize() {
        return this.size;
    }

    /**
     * A method to retrieve the color attribute
     */
    public String getColor() {
        return this.color;
    }

    /**
     * A method that takes input size and determines if the size is valid for the apple object, if not, logic will handle it accordingly
     * @param size
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

    /**
     * A method to set the color of the apple object
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

}