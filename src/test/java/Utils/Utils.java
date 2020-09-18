package Utils;

public class Utils {

    public static String getColor(String rgb) {
        //rgba,232, 74, 80, 1)
        rgb = rgb.replace('(', ',');
        String[] colorParts = rgb.split(",");

        int redNumber = Integer.parseInt(colorParts[1].trim());
        int greenNumber = Integer.parseInt(colorParts[2].trim());
        if(redNumber > greenNumber)
            return "Rojo";
        else
            return "Verde";
    }
}
