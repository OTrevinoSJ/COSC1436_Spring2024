import java.util.InputMismatchException;
import java.util.Scanner;

import Shapes.Circle;
import Shapes.InvalidShapeArgument;
import Shapes.Pentagon;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;

/**
 * This is my main application class
 */
public class MainAppCopy {

    private static int NUM_OF_SHAPES = 4;

    /**
     * This method accepts user demensions as input and attempts to apply to the shape, if not an exception will handle it accordingly
     * @param args
     */
    public static void main(String[] args) {
        
        // A scanner that allows the user to enter input into the program
        Scanner kb = new Scanner(System.in);
        // A method that gets all input demensions from the user and adds a shape to the array list to then return back to the main calling program
        Shape[] shapes = setDemensions(kb);

        // A method that prints the calculated results
        displayCalculations(shapes);

        // Closing of the scanner
        kb.close();
        System.exit(0);
        
    }

    private static Shape[] setDemensions(Scanner kb) throws NullPointerException {
    
        // Declarations
        Shape[] shapes = new Shape[NUM_OF_SHAPES];
        double length;
        double width;
        double diameter;
        boolean failed = false;
        int index = 0;

        // Shapes that need to be instantiated
        Square square;
        Rectangle rectangle;
        Circle circle;
        Pentagon pentagon;

        // This was my first implementation of this program
        // do {
        //     try {
        //         System.out.print("Enter a side length for square: ");
        //         length = kb.nextDouble();
        //         square = new Square(length);
        //         index = addShapeToList(shapes, square, index);
        //         failed = false;
        //         System.out.println();
        //     } catch (InputMismatchException e) {
        //         failed = true;
        //         System.out.println("Try entering an number value");
        //         kb.next();
        //     } catch (InvalidShapeArgument e) {
        //         failed = true;
        //         e.printErrorMessge();
        //     }
        // } while (failed);
        // ... and so on, and so on (bad design, made a new one read explaination below)

        // Before this implementation, I was making multiple do-while loops with each set of statements listed inside the switch-case below. I felt that there could be a better way to rewrite the repeated uses of the do-while loops, so I thought of putting them inside a while loop, this allowed me to only write one do-while loop structure and each iteration will be a new set of unique statements for the different shapes

        // P.S. If there was a better way to go about this I would be interested in knowing.
        int i = 0;
        while (i < NUM_OF_SHAPES) {
            do {
                try {
                    switch (i) {
                        // Inside of each case contains a method that is capable of throwing an exception, if the exception is thrown the var i will not increase, essentially staying at the same set of statements until input is valid or within range of the program.
                        case 0:
                            System.out.print("Enter a side length for square: ");
                            length = kb.nextDouble();
                            square = new Square(length);
                            index = addShapeToList(shapes, square, index);
                            i++;
                            break;
                        case 1:
                            System.out.println("Enter a length and width for the rectangle: ");
                            System.out.print("Length: ");
                            length = kb.nextDouble();
                            System.out.print("Width: ");
                            width = kb.nextDouble();
                            rectangle = new Rectangle(length, width);
                            index = addShapeToList(shapes, rectangle,index);
                            i++;
                            break;
                        case 2:
                            System.out.println("Enter the diameter for the circle");
                            System.out.print("Diameter: ");
                            diameter = kb.nextDouble();
                            circle = new Circle(diameter);
                            index = addShapeToList(shapes, circle, index);
                            i++;
                            break;
                        case 3:
                            System.out.print("Enter the side length for the pentagon: ");
                            length = kb.nextDouble();
                            pentagon = new Pentagon(length);
                            index = addShapeToList(shapes, pentagon, index);
                            i++;
                            break;
                        default:
                            break;
                    }
                    // Used failed as a flag for the do-while loop
                    failed = false;

                    // resets
                    length = 0;
                    width = 0;
                    diameter = 0;
                    
                    // clearing of the scanner in case any unnecessary values were inputted after a successful was given
                    kb.nextLine();

                    System.out.println();
                } catch (InputMismatchException e) {
                    failed = true;
                    System.out.println("Try entering an number value");
                    kb.nextLine();
                } catch (InvalidShapeArgument e) {
                    failed = true;
                    e.printErrorMessge();
                    kb.nextLine();
                }

            } while (failed);
        }

        // I returned shapes array to main calling program to print the results in a seperate method
        return shapes;

    }

    /*
     * This helps display the results of every objects inside the array
     */
    private static void displayCalculations(Shape[] shapes){
        System.out.println("=========Area & Perimeter Calculations=========");
        for (Shape shape : shapes) {
            System.out.println("The shape " + shape);
            System.out.println("Area: ".concat(String.valueOf(shape.calculateArea())));
            if (shape instanceof Circle) {
                System.out.println("Circumference: ".concat(String.valueOf(shape.calculatePerimeter())));
            } else {
                System.out.println("Perimeter: ".concat(String.valueOf(shape.calculatePerimeter())));
            }
            System.out.println();
        }
    }

    /*
     * This function helps add shapes to the array and returns a new index for the subsequent addition of new shapes further down the program
     */
    private static int addShapeToList(Shape[] list, Shape obj, int index) {
        list[index] = obj;
        index++;
        return index;
    }
}
