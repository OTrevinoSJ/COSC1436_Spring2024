package Shapes;

import java.util.InputMismatchException;

public class Rhombus extends Shape{

    private double sideLen;
    private double diagOne;
    private double diagTwo;

    /**
     * This constucts the Rhombus object with needed parameters for the instance to be instantiated
     * @param p
     * @param q
     * @throws InputMismatchException
     * @throws InvalidShapeArgument
     */
    public Rhombus(double p, double q) throws InputMismatchException, InvalidShapeArgument {
        setDiagonals(p, q);
        shapeName = this.getClass().getSimpleName();
    }

    /**
     * This method sets the diagonals for p and q and also checks to see if either of them are negative
     * @param p
     * @param q
     * @throws InvalidShapeArgument
     */
    public void setDiagonals(double p, double q) throws InvalidShapeArgument{
        if (p <= 0 || q <= 0) throw new InvalidShapeArgument();
        diagOne = p;
        diagTwo = q;
        sideLen = Math.sqrt(Math.pow(p, 2) + Math.pow(q, 2))/2;
    }

    /**
     * This method calculates the area of a rhombus
     */
    @Override
    public double calculateArea() {
        return diagOne*diagTwo/2;
    }

    /**
     * This method calculate the perimeter of a rhombus
     */
    @Override
    public double calculatePerimeter() {
        return 4*sideLen;
    }
    
}
