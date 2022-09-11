
import java.io.*;

/**
 *
 * @author 27825
 */
public class StringUtilities {

    public static boolean isEmpty(String text) {
        boolean isEmpty = false;
        isEmpty = null == text || text.length() < 1;

        return isEmpty;
    }

    public static boolean yesNo(String displayMessage, String errorMessage) throws Exception {
        boolean isYes = false;        

        try {
            boolean hasFailed = false;
            
            String yesNo = getStringFromUser(displayMessage, errorMessage);
            yesNo = yesNo.toUpperCase();
            yesNo = yesNo.substring(0,1);

            switch (yesNo) {
                case "Y":
                    isYes = true;
                    break;

                case "N":
                    isYes = false;
                    break;

                default:
                    hasFailed = true;

            }
            if (hasFailed) {
                throw new Exception(errorMessage);
            }

        } catch (Exception ex) {
            System.out.println(errorMessage);
            throw new Exception(errorMessage);
        }

        return isYes;
    }

    public static int getIntFromUser(String displayMessage, String errorMessage) throws Exception {
        int value;
        
        try {
            String textRead = getStringFromUser(displayMessage, errorMessage);
            value = Integer.parseInt(textRead);
        } catch (Exception ex) {
            System.out.println(errorMessage);
            throw new Exception(errorMessage);
        }

        return value;
    }

    public static long getLongFromUser(String displayMessage, String errorMessage) throws Exception {
        long value;

        try {
            String textRead = getStringFromUser(displayMessage, errorMessage);
            value = Long.parseLong(textRead);
        } catch (Exception ex) {
            System.out.println(errorMessage);
            throw new Exception(errorMessage);
        }
        return value;
    }

    public static double getDoubleFromUser(String displayMessage, String errorMessage) throws Exception {
        double value;

        try {
            String textRead = getStringFromUser(displayMessage, errorMessage);
            value = Double.parseDouble(textRead);
        } catch (Exception ex) {
            System.out.println(errorMessage);
            throw new Exception(errorMessage);
        }
        return value;
    }

    public static String getStringFromUser(String displayMessage, String errorMessage) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        System.out.println(displayMessage);
        String textRead = reader.readLine();
        return textRead;
    }
}
