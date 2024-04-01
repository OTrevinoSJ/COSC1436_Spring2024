import java.util.*;

public class Lab3 {

    static int NUMBER_SIZE = 9;
    static int row;
    static int column;
    static Scanner kb;
    static int[][] array;

    public static void main(String[] args) {
        generate2dArray();
        displayResults();
    }

    /**
     * This function generates a 2D Array based on the user input
     * row - user defined (input)
     * column - user defined (input)
     */
    public static void generate2dArray(){
        kb = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        row = kb.nextInt();
        
        System.out.print("Enter the number of columns: ");
        column = kb.nextInt();
        System.out.println();

        array = new int[row][column];
        
        System.out.println("Generated 2D Array: ");
        populate2dArray();
        print2dArray(array);
    }

    public static void displayResults() {
        System.out.println("Sum of all elements: " + calculateSum());
        System.out.println("Maximum value: " + findMax2dArray());
        System.out.println("Minimum value: " + findMin2dArray() + "\n");
        
        System.out.println("Transposed 2D Array: ");
        print2dArray(transpose2dArray());
    }

    /***
     * This function handles the printing of the elements at each index of the 2d array
     */
    public static void print2dArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    /*
     * This function helps populate the generated 2d array
     */
    private static void populate2dArray(){
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * NUMBER_SIZE);
            }
        }
    }

    /*
     * This function accumulates all the elements of the matrix
     */
    private static int calculateSum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) sum += array[i][j];
        }
        return sum;
    }

    /*
     * This function helps find the Min of the 2d Array
     */
    private static int findMin2dArray() {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    /*
     * This function helps find the max of of the 2d Array
     */
    private static int findMax2dArray() {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    /*
     * This function transposes the array, meaning it swaps the rows and columns, for example, {row = 3 | column = 4} to {row = 4 | column = 3}
     */
    private static int[][] transpose2dArray() {
        swapRowAndColumn(); // swapping of row and column
        int x = array.length; // length of original array
        int y = array[0].length; // length of the inside array/s

        // Creation of a new array with new row and column
        int[][] newArr = new int[row][column];

        // Outer loop iterates the amount of elements the array contains
        for (int i = 0; i < x; i++) { // 3
            // Inner loop iterates whatever the length of the inner element/s are
            for (int j = 0; j < y; j++) {
                newArr[j][i] = array[i][j]; // Here is where most of the magic happens, notice how i j are switched. 
            }
        }
        return newArr;
    }

    /*
     * Swapping of row & column variables
     */
    private static void swapRowAndColumn() {
        int tmp = row;
        row = column;
        column = tmp;
    }

    

}