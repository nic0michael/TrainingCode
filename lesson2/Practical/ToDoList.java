import java.io.*;

/**
 *
 * @author Nico Michael
 */
public class ToDoList {

    public static void main(String[] args) {
        System.out.println("Hello there");
        String fileName = "ToDoList.txt";

        try {
            String textToWrite = getOneLineFronTheUser();
            writeToFile(fileName, textToWrite);
        } catch (Exception ex) {
            System.out.println("Failed to write to file: " + fileName);
            System.out.println("The error was: " + ex.getMessage());
        }
    }

    private static String getOneLineFronTheUser() throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        System.out.println("\nPlease enter one line to save in your To Do List\n");
        String textRead = reader.readLine();
        return textRead;
    }

    private static void writeToFile(String fileName, String textToWrite) throws Exception {
        if(FileUtilities.exists(fileName)){
            FileUtilities.appendFile(fileName,"\n"+textToWrite);
        } else{
            FileUtilities.writeFile(fileName, "\n"+textToWrite);
        }
        System.out.println("saved: "+fileName);
    }
}