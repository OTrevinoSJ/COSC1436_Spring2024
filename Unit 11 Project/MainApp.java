import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Shapes.Circle;
import Shapes.Ellipse;
import Shapes.Hexagon;
import Shapes.InvalidShapeArgument;
import Shapes.Octogon;
import Shapes.Pentagon;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;
import Utils.CText;

import Utils.ConsoleColorUtil;

/**
 * This is my main application class
 */
public class MainApp implements ConsoleColorUtil{

    // A constant variable that needs to be forcfully updated by me when adding a new class
    // reason being, static arrays!
    private static int NUM_OF_SHAPES = 7;

    /**
     * This method accepts user demensions as input and attempts to apply to the shape, if not an exception will handle it accordingly
     * @param args
     */
    public static void main(String[] args) {

        // A scanner that allows the user to enter input into the program
        Scanner kb = new Scanner(System.in);
        
        // Title
        printTitle();
        
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
        
        // This data type gets reassigned multiple times throughout this program
        Shape shape;

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
                System.out.println();
                try {
                    switch (i) {
                        // Inside of each case contains a method that is capable of throwing an exception, if the exception is thrown the var i will not increase, essentially staying at the same set of statements until input is valid or within range of the program.
                        case 0:
                            System.out.print("Enter a side length for square: ");
                            length = kb.nextDouble();
                            shape = new Square(length);
                            index = addShapeToList(shapes, shape, index);
                            i++;
                            break;
                        case 1:
                            System.out.println("Enter a length and width for the rectangle: ");
                            System.out.print("Length: ");
                            length = kb.nextDouble();
                            System.out.print("Width: ");
                            width = kb.nextDouble();
                            shape = new Rectangle(length, width);
                            index = addShapeToList(shapes, shape,index);
                            i++;
                            break;
                        case 2:
                            System.out.println("Enter the diameter for the circle");
                            System.out.print("Diameter: ");
                            diameter = kb.nextDouble();
                            shape = new Circle(diameter);
                            index = addShapeToList(shapes, shape, index);
                            i++;
                            break;
                        case 3:
                            System.out.print("Enter the side length for the pentagon: ");
                            length = kb.nextDouble();
                            shape = new Pentagon(length);
                            index = addShapeToList(shapes, shape, index);
                            i++;
                            break;
                        case 4:
                            System.out.print("Enter the side length for the hexagon: ");
                            length = kb.nextDouble();
                            shape = new Hexagon(length);
                            index = addShapeToList(shapes, shape, index);
                            i++;
                            break;
                        case 5:
                            System.out.print("Enter the side length for the octogon: ");
                            length = kb.nextDouble();
                            shape = new Octogon(length);
                            index = addShapeToList(shapes, shape, index);
                            System.out.println();
                            i++;
                        case 6:
                            double axisOne, axisTwo;
                            System.out.println("Enter the axes of the ellipse: ");
                            System.out.print("Enter Axis (" + CText.cText("1", ANSI_GREEN) + "): ");
                            length = kb.nextDouble();
                            axisOne = length;
                            System.out.print("Enter Axis (" + CText.cText("2", ANSI_GREEN) + "): ");
                            width = kb.nextDouble();
                            axisTwo = width;
                            shape = new Ellipse(axisOne, axisTwo);
                            index = addShapeToList(shapes, shape, index);
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
                } catch (InputMismatchException e) {

                    // Updates failed to true to keep user at that current input for the current shape
                    failed = true;

                    // output to the user about the failed attempt
                    System.out.println(CText.cText("Try entering an number value", ANSI_RED));

                    // reset the scanner
                    kb.nextLine();
                } catch (InvalidShapeArgument e) {

                    // same as previous exception
                    failed = true;

                    // prints custom error message
                    e.printErrorMessge();

                    // reset the scanner
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
        System.out.println(CText.cText("\n=========Area & Perimeter Calculations=========", ANSI_YELLOW));
        for (Shape shape : shapes) {

            // Prints Shape Name
            System.out.println("The shape " + CText.cText(shape.toString(), ANSI_CYAN));

            // Prints shape's area
            System.out.printf("Area: " + CText.cText("%.2f\n", ANSI_BLUE), shape.calculateArea());

            // Small logic to differentiate circle called perimeter and rename it to circumference
            if (shape instanceof Circle) {
                System.out.printf("Circumference: " + CText.cText("%.2f\n", ANSI_BLUE), shape.calculatePerimeter());
            } else {
                System.out.printf("Perimeter: " + CText.cText("%.2f\n", ANSI_BLUE), shape.calculatePerimeter());
            }

            // Decoration (Aesthetic)
            System.out.println();
        }
    }

    /*
     * This function helps add shapes to the array and returns a new index for the subsequent addition of new shapes further down the program
     */
    private static int addShapeToList(Shape[] list, Shape obj, int index) {
        // Addes a shape to the current index
        list[index] = obj;
        index++;
        // returns the new index back to the calling method
        return index;
    }

    /*
     * This method is used to print the application title
     */
    private static void printTitle() {
        try {

            // File with the ascii art for the title
            File file = new File("assets/title.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            // Decoration (Aesthetic)
            System.out.println(CText.cText("====================================================================================", ANSI_BLUE));

            // Reads each line from the file then prints to the file
            // Hence, copies data from a storage device on a file and copies it to computer memory
            while ((line = br.readLine()) != null) {
                System.out.println(CText.cText(line, ANSI_CYAN));
            }

            // Decoration (Aesthetic)
            System.out.println(CText.cText("====================================================================================", ANSI_BLUE));

        } catch (IOException e) {
            // This is the backup in case file fails to read for whatever reason
            // Decoration (Aesthetic)
            System.out.println(CText.cText("---------------------Shapes Calculator---------------------", ANSI_PURPLE));
        }
    }
}
