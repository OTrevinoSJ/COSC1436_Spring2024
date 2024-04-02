import java.util.Scanner;

public class Lab2 {

    static int SIZE = 5;
    static int NUMBER_SIZES = 100;
    static int totalComparisons;
    static int totatlSwaps;
    static int[] arr;
    
    public static void main(String[] args) {
        
        arr = new int[SIZE];

        System.out.println("---------------------------------------------");
        // Generates the array
        generateArray();
        
        // Sorts the array
        sortArray();
        
        // Prints final Sorted Array and totals of comparisons and swaps
        displaySortedArray();
        System.out.println("---------------------------------------------");
        
    }

    public static void generateArray(){

        // Populating the array with random values
        int i = 0;
        while (i < SIZE) {
            arr[i] = (int) (Math.random() * NUMBER_SIZES);
            i++;
        }

        System.out.print("Orignal Array: ");
        printArray();
        System.out.println();
    }

    public static void sortArray(){

        // Created a comparisons variable to use keep track of the amount of passes to refine the bubble sort
        int comparisons = arr.length - 1;

        // The two variables are in charge of keeping count of the amount of comparisons and swaps
        int comparesCount = 0;
        int swaps = 0;

        // Here is the algorithms for the bubble sort
        int i = 0;
        String didSwap = "YES";
        while (didSwap.equals("YES")) {
            didSwap = "NO";
            int j = 0;
            while (j < comparisons) {
                if (arr[j] > arr[j + 1]) {
                    // The swap algorithm
                    swap(j);
                    swaps++;
                    didSwap = "YES";
                }
                comparesCount++;
                j++;
            }
            // Decrease comparisons after each pass
            comparisons--;

            // Prints the array after the modifications
            printChangedArray(comparesCount, swaps, i+1);
            i++;

            // Keeping track of totals
            totalComparisons += comparesCount;
            totatlSwaps += swaps;

            // resets
            swaps = 0;
            comparesCount = 0;
        }
        
        
    }

    /***
    * This function handles the ending of the program to display the final sorted arrray
    */
    public static void displaySortedArray(){
        System.out.print("Sorted Array: ");
        printArray();
        System.out.println();
        calculateComparisonsAndSwaps();
    }

    /*
     * This function serves the purpose of swapping the elements at a given index
     */
    private static void swap(int j){
        int tmp = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = tmp;
    }

    /*
     * This function handles the printing of the array during iteration and also call apon another helper function to display 
     * swaps and comparisons
     */
    private static void printChangedArray(int comparesCount, int swaps, int count){
        System.out.print(String.format("Pass %d: ", count));
        printArray();
        printComparisonsAndSwaps(comparesCount, swaps);
        System.out.println();
    }


    /*
     * This function handles the print of comparisons and swaps.
     */
    private static void printComparisonsAndSwaps(int compares, int swaps){
        System.out.print(String.format("(Comparisons: %d, Swaps: %d)", compares, swaps));
    }


    /*
     * This functions is in charge of printing the final totals of comparisons and swaps.
     */
    private static void calculateComparisonsAndSwaps(){
        System.out.println(String.format("Total Comparisons: %d Total Swaps: %d", totalComparisons, totatlSwaps));
    }

    /*
     * This method helps display the array to the console
     */
    private static void printArray(){
        // A simple loop to print the elements of the array to the console
        int i = 0;
        System.out.print("[");
        for (; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[i]+"] ");
    }
}