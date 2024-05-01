package Shapes;

import Utils.ConsoleColorUtil;

public class InvalidShapeArgument extends Exception{

    /**
     * A constructor that sets a message and a cause message
     */
    public InvalidShapeArgument(){
        super("You can't use that as a valid argument for that shape!", new Throwable(ConsoleColorUtil.ANSI_RED + "You must have entered an invalid value for the one of the shapes" + ConsoleColorUtil.ANSI_RESET));
    }

    /**
     * This method will print the cause
     * P.S. There might already be a method that does this but I created this method just to change the name of the method.
     */
    public void printErrorMessge(){
        System.out.println(this.getCause());
    }


}
