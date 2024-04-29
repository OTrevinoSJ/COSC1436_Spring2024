package Shapes;

import java.util.InputMismatchException;

public class Pentagon extends Shape {

    // The pentagon only needs one variable
    private double side;

    /**
     * A constructor that uses only one parameter to get the side length
     * @param sideNum
     * @throws InvalidShapeArgument 
     */
    public Pentagon(double sideNum) throws InputMismatchException, InvalidShapeArgument {
        // Created a method that handles values accordingly
        setSide(sideNum);
        // This is used to get the name of the class so that I can print the name of the object with its calculated values
        shapeName = this.getClass().getSimpleName();
    }

    /**
     * This method is used to set the value of the side but checks to see if side is a within range of the shape
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
        double calcMid = Math.sqrt(5*(5+(2*(Math.sqrt(5)))));
        return .25*calcMid*Math.pow(side, 2);
    }

    /**
     * This method is overrided from the {@code Shape} class to figure out the calculated perimeter for the specified shape {@code Square}
     * @return the calculated perimeter
     */
    @Override
    public double calculatePerimeter() {
        return 5*side;
    }
    

    
    
}
