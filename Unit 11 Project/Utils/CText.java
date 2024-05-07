package Utils;

public class CText implements ConsoleColorUtil {

    /**
     * This method helps by creating an easy standard of text with the addition of a color
     * I did this because the System.out.print() line statements started to look ridiculous
     * @param text
     * @param color
     * @return
     */
    public static String cText(String text, String color){
        return color + text + ANSI_RESET;
    }
}
