package Shapes;

import Utils.ConsoleColorUtil;

public class InvalidShapeArgument extends Exception{
    
    InvalidShapeArgument(){
        super("You can't use that as a valid argument for that shape!", new Throwable(ConsoleColorUtil.ANSI_RED + "You must have entered an invalid value for the one of the shapes" + ConsoleColorUtil.ANSI_RESET));
    }

    public void printErrorMessge(){
        System.out.println(this.getCause());
    }


}
