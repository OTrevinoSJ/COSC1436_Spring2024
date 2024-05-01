package Shapes;

import java.util.InputMismatchException;

public class Rectangle extends Shape{

    /**
     * A constructor that takes two parameters {@code length} and {@code width}
     * @param length
     * @param width
     * @throws InvalidShapeArgument 
     */
    public Rectangle(double length, double width) throws InputMismatchException, InvalidShapeArgument {
        setLength(length);
        setWidth(width);
        shapeName = this.getClass().getSimpleName();
    }

    /**
     * This method accepts user length and checks to see if valid, if not then an exception will be thrown
     * @param userLength
     * @throws InvalidShapeArgument
     */
    public void setLength(double userLength) throws InvalidShapeArgument, InputMismatchException {
        if (userLength <= 0) throw new InvalidShapeArgument();
        else {
            length = userLength;
        }
    }

    /**
     * This method accepts user width and checks to see if valid, if not then an exception will be thrown
     * @param userWidth
     * @throws InvalidShapeArgument
     * @throws InputMismatchException
     */
    public void setWidth(double userWidth) throws InvalidShapeArgument, InputMismatchException{
        if (userWidth <= 0) throw new InvalidShapeArgument();
        else {
            width = userWidth;
        }
    }

    /**
     * This method is overrided from the {@code Shape} class to figure out the calculated area for the specified shape {@code Rectangle}
     * @return the calculated area
     */
    @Override
    public double calculateArea() {
        area = length*width;
        return area;
    }

    /**
     * This method is overrided from the {@code Shape} class to figure out the calculated perimeter for the specified shape {@code Rectangle}
     * @return the calculated perimeter
     */
    @Override
    public double calculatePerimeter() {
        perimeter = 2*length + 2*width;
        return perimeter;
    }

    
}
