package Utils;

public class CText implements ConsoleColorUtil {


    public static String cText(String text, String color){
        return color + text + ANSI_RESET;
    }
}
