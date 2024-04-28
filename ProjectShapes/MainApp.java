import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.stream.ImageInputStream;

import Shapes.InvalidShapeArgument;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;

/**
 * This is my main application class
 */
public class MainApp {

    private static int NUM_OF_SHAPES = 2;

    /**
     * This method accepts user demensions as input and attempts to apply to the shape, if not an exception will handle it accordingly
     * @param args
     */
    public static void main(String[] args) {
        
        // A scanner that allows the user to enter input into the program
        Scanner kb = new Scanner(System.in);
        Shape[] shapes = setDemensions(kb);

        try {
            displayCalculations(shapes);
        } catch (Exception e) {
            System.out.println("You messed Up");
        }
    }

    private static Shape[] setDemensions(Scanner kb) throws NullPointerException {
    
        // Declarations
        Shape[] shapes = new Shape[NUM_OF_SHAPES];
        double length;
        double width;
        boolean failed = false;
        int index = 0;

        //
        Square square;
        do {
            try {
                System.out.print("Enter a side length for square: ");
                length = kb.nextDouble();
                square = new Square(length);
                shapes[index] = square;
                failed = false;
                index++;
                System.out.println();
            } catch (InputMismatchException e) {
                failed = true;
                System.out.println("Try entering an number value");
                kb.next();
            } catch (InvalidShapeArgument e) {
                failed = true;
                e.printErrorMessge();
            }
        } while (failed);

        do {
            try {
                System.out.println("Enter a length and width for the rectangle: ");
                System.out.print("Length: ");
                length = kb.nextDouble();
                System.out.print("Width: ");
                width = kb.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                shapes[index] = rectangle;
                index++;
                failed = false;
                System.out.println();
            } catch (InputMismatchException e) {
                failed = true;
                System.out.println("Try entering an number value");
            } catch (InvalidShapeArgument e) {
                failed = true;
                e.printErrorMessge();
            }
        }while (failed);

        return shapes;

    }

    private static void displayCalculations(Shape[] shapes){
        if (shapes != null) {
            for (Shape shape : shapes) {
                System.out.println("The shape " + shape);
                System.out.println(shape.calculateArea());
                System.out.println(shape.calculatePerimeter());
            }
        }
    }

}