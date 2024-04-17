public class MainProgram {
    
    
    /** 
     * @param args arguments provided from the console
     */
    /*
     * This is my main program
     */
    public static void main(String[] args) {

        // Create a tangable instance of Opal class that obtains their base class attributes and methods from Apple
        Opal opalApple = new Opal(5, "bright yellow");

        // Created a tangable instance of Jake class that obtains their base class attributes and methods from GameCharacter class
        Jake jake = new Jake("Jake", 100, 165, 270);

        // Create a tagable instance of the tesla class that obtains their attributes and methods from Car class
        Tesla tesla = new Tesla("Tesla X", "Tesla", "White", 67000, 50);
        
    }
}
