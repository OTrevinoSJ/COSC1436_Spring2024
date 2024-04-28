package Shapes;

import java.util.InputMismatchException;

public class Square extends Shape {

    // The square only needs one variable because the sides are all the same
    private double side;

    /**
     * A constructor that takes a single parameter as the side length for the square
     * @param sideNum
     * @throws InvalidShapeArgument 
     */
    public Square(double sideNum) throws InputMismatchException, InvalidShapeArgument {
        // Created a method that handles values accordingly
        setSide(sideNum);
        shapeName = this.getClass().getSimpleName();
    }

    /**
     * This method sets the side of the square and assigns the values to the instance variables also checked to see if {@code num} is valid 
     * @param num
     * @throws InvalidShapeArgument 
     */
    public void setSide(double num) throws InvalidShapeArgument {
        if (num <= 0) throw new InvalidShapeArgument();
        else {
            side = num;
            width = num;
            length = num;
        }
    }

    /**
     * This method is overrided from the {@code Shape} class to figure out the calculated area for the specified shape {@code Square}
     * @return the calculated area
     */
    @Override
    public double calculateArea() {
        area = side*side;
        return area;
    }

    /**
     * This method is overrided from the {@code Shape} class to figure out the calculated perimeter for the specified shape {@code Square}
     * @return the calculated perimeter
     */
    @Override
    public double calculatePerimeter() {
        perimeter = 4*side;
        return perimeter;
    }
    
    
    
}
