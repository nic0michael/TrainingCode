import java.io.*;

/**
*	This is a Library of utilities to read and write to and from files
*/
public class FileUtilities {    
    public static String readFile(String fileName)  throws Exception {
        FileInputStream in = null;
        boolean failed = false;
        String errorMessage = "";
        String text = "";

        try {
            in = new FileInputStream(fileName);
            int ch;
            while ((ch = in.read()) != -1) {
                text +=(char)ch;
            }
        } catch (FileNotFoundException ex) {
            failed = true;
            errorMessage += "FileNotfound ";
            
        } catch (IOException ex) {
            failed = true;
            errorMessage += "failed to read file ";
            
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    failed = true;
                    errorMessage += "failed to close file ";
                }
            }
        }        
        if (failed) {
            throw new Exception(errorMessage);
        }

        return text;
    }

    public static void writeFile(String fileName, String text) throws Exception {
        FileOutputStream out = null;
        boolean failed = false;
        String errorMessage = "";

        try {
            out = new FileOutputStream(fileName);
            byte[] message = text.getBytes();
            out.write(message);

        } catch (FileNotFoundException ex) {
            failed = true;
            errorMessage += "FileNotfound ";
            
        } catch (IOException ex) {
            failed = true;
            errorMessage += "failed to write file ";
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    failed = true;
                    errorMessage += "failed to close file ";
                }
            }
        }
        if (failed) {
            throw new Exception(errorMessage);
        }
    }
    
    public static void appendFile(String fileName, String text)  throws Exception {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        boolean failed = false;
        String errorMessage = "";
        
        try {
            fileWriter = new FileWriter(fileName, true);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println(text);
        
        } catch (FileNotFoundException ex) {
            failed = true;
            errorMessage += "FileNotfound ";
            
        } catch (IOException ex) {
            failed = true;
            errorMessage += "failed to write file ";
        } finally {
            if (fileWriter != null) {                
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    failed = true;
                    errorMessage += "failed to close file ";
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
        }
        
        
        if (failed) {
            throw new Exception(errorMessage);
        }
    }
}
