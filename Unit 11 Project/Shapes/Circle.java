package Shapes;

import java.util.InputMismatchException;

public class Circle extends Shape{

    // instance variables
    private double diameter;
    private double radius;

    /**
     * A constructor that sets a single parameter to get the diameter of a circle 
     * @param diameterNum
     * @throws InputMismatchException
     * @throws InvalidShapeArgument
     */
    public Circle(double diameterNum) throws InputMismatchException, InvalidShapeArgument{
        setDiameter(diameterNum);
        // This is used to get the name of the class so that I can print the name of the object with its calculated values
        shapeName = this.getClass().getSimpleName();
    }

    /**
     * This method sets the diameter if the input is within range of the program
     * @param diameterNum
     * @throws InvalidShapeArgument
     */
    private void setDiameter(double diameterNum) throws InvalidShapeArgument{
        if (diameterNum <= 0) throw new InvalidShapeArgument();
        else
            diameter = diameterNum;
            // Sets the radius when diameter is a valid number
            radius = diameter/2;
    }

    /**
     * This method is overrided from the {@code Shape} class to figure out the calculated area for the specified shape {@code Square}
     * @return the calculated area
     */
    @Override
    public double calculateArea() {
        return 3.14*Math.pow(radius, 2);
    }

    /**
     * This method is overrided from the {@code Shape} class to figure out the calculated perimeter for the specified shape {@code Square}
     * @return the calculated perimeter
     */
    @Override
    public double calculatePerimeter() {
        return Math.PI*radius*2;
    }
    
}
