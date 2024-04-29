package Shapes;

public abstract class Shape implements CalculableArea, CalculablePerimeter{
    
    // These variables can be accessable by any child classes that extend to this base class
    protected double width;
    protected double length;
    protected double area;
    protected double perimeter;
    protected String shapeName;

    /**
     * Gets the width of the shape
     * @return the width of the shape
     */
    public double getHeight() {
        return width;
    }

    /**
     * Gets the Length of the shape
     * @return the length of the shape
     */
    public double getLength() {
        return length;
    }

    /**
     * Gets the area of the shape
     * @return the area of the shape
     */
    public double getArea() {
        return area;
    }

    /**
     * Gets the permiter of the shape
     * @return the parimeter of the shape
     */
    public double getPerimeter() {
        return perimeter;
    }

    /**
     * Overrided the toString method to get the simple name of the class
     */
    @Override
    public String toString() {
        return shapeName;
    }

    
}
