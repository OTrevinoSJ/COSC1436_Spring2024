package Shapes;

import java.util.InputMismatchException;

public class Hexagon extends Shape {

    private double side;

    public Hexagon(double sideNum) throws InputMismatchException, InvalidShapeArgument{
        setSide(sideNum);
        shapeName = this.getClass().getSimpleName();
    }

    public void setSide(double sideLength) throws InvalidShapeArgument{
        if (sideLength <= 0) throw new InvalidShapeArgument();
        else {
            side = sideLength;
            length = sideLength;
            width = sideLength;
        }
    }

    @Override
    public double calculateArea() {
        double a = Math.pow(side, 2);
        return (3*Math.sqrt(3)/2)*a;
    }

    @Override
    public double calculatePerimeter() {
        return side*6;
    }
    
}
