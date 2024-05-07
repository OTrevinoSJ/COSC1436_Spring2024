package Shapes;

import java.util.InputMismatchException;

public class Ellipse extends Shape {

    private double axisOne;
    private double axisTwo;

    /**
     * This constructs the ellipse shape instance by supplying the constructor with two inputs
     * @param axes1
     * @param axis2
     * @throws InputMismatchException
     * @throws InvalidShapeArgument
     */
    public Ellipse(double axes1, double axis2) throws InputMismatchException, InvalidShapeArgument{
        setAxes(axis2, axis2);
        shapeName = this.getClass().getSimpleName();
    }

    /**
     * This method sets both axes of the shape and also checking for invalid arguments
     * @param axis1
     * @param axis2
     * @throws InvalidShapeArgument
     */
    public void setAxes(double axis1, double axis2) throws InvalidShapeArgument {
        if (axis1 <= 0 || axis2 <= 0) throw new InvalidShapeArgument();
        else {
            axisOne = axis1;
            axisTwo = axis2;
        }

    }

    /**
     * This method calculates the area of the ellipse
     * @return the area
     */
    @Override
    public double calculateArea() {
        return 3.14*axisOne*axisTwo;
    }

    /**
     * This method calculates the perimeter of the ellipse
     * @return the perimeter
     */
    @Override
    public double calculatePerimeter() {
        double a = axisOne;
        double b = axisTwo;
        double h = Math.pow(a - b, 2)/Math.pow(a + b, 2);
        double calc = 2 * 3.14 * Math.sqrt((a * a + b * b) / (2 * 1.0)) ;
        return calc;
    }
    
}
