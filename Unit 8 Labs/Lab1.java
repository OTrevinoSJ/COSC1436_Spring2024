import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {
    
    static ArrayList<String> filteredWords;
    static Scanner kb;
    static File file;
    static FileReader fr;
    static BufferedReader br;
    static int len;

    /***
     * This is the main method where all houseKeeping, detailLoops, and endingTask are housed.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // Setting up the program
        setUp();

        // Created a mainline loop that will go through each line in the file and assign it to (word) to pass to other function
        String word;
        while ((word = br.readLine()) != null) {
            populatingArray(word);
        }

        // Ending the program
        finishingUp();


    }

    /***
     * This method is the houseKeeping method it job it to assign variables of objects and get the program ready.
     * This method also prompts the user via system input for the requested user length.
     */
    public static void setUp(){

        kb = new Scanner(System.in);

        // Used Try-Catch to catching any IOErrors
        try {

         // Created A File Object to handle any file/directory related processes 
         file = new File("words_alpha.txt");
         fr = new FileReader(file);

         // Here I decorated FileReader with BufferedReader to use more efficient methods
         br = new BufferedReader(fr);
         filteredWords = new ArrayList<>();
 
         // Prompt the user to enter a valid length
         System.out.print("Enter the length of words to filter by: ");
         len = kb.nextInt();

         // Checking user input
         checkUserLength();

        } catch (IOException e) {
            // Prints the incoming error message to the console
            e.printStackTrace();
        }
    }

    /***
     * This method is in charge of checking the length of the incoming words and comparing it to the user requested length.
     * @param word - Word from file
     */ 
    public static void populatingArray(String word){
        if (word.length() == len) {
            filteredWords.add(word);
        }
    }

    /***
     * A Method to take care of closing opened files, and display the list of filtered words.
     * @throws IOException
     */
    public static void finishingUp() throws IOException {
        fr.close();
        br.close();
        printArrayList();
    }

    /*
     * This method checks the user input and loops them until they entered a valid input
     */
    private static void checkUserLength(){
        while (len <= -1) {
            System.out.print("Please enter a valid length (len >= 1): ");
            len = kb.nextInt();
        }
    }

    /*
     * This method is used to print the words inside the array to the console.
     */
    private static void printArrayList(){
        System.out.print(String.format("Words with length %d are: \n", len));
        for (String word : filteredWords) {
            System.out.println(word);
        }
    }


}
