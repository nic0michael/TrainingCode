/**
* This program will test the FileUtilities and CsvUtilities library classes
*/
public class FileIO {

    public static void main(String[] args) {
        System.out.println();
        String text="Hello World!";
        String fileName="HelloWorld.txt";
        
        try {
            FileUtilities.writeFile(fileName, text);
            System.out.println("Wrote file : "+fileName);
        } catch (Exception ex) {
            System.out.println("Failed to write file error is : "+ex.getMessage());
        }        
        
        try {
            FileUtilities.appendFile(fileName, "\n"+text);
            System.out.println("\nAppended file : "+fileName);
        } catch (Exception ex) {
            System.out.println("Failed to append file error is : "+ex.getMessage());
        }  
      
        try {
            String message =FileUtilities.readFile(fileName);
            System.out.println("\nRead file :  "+fileName);
            System.out.println("Text : \n"+message);
        } catch (Exception ex) {
            System.out.println("Failed to read file error is : "+ex.getMessage());
        }  
      
        String csvFileName ="AddressBook.csv"; 
        String header="name,phone,mobile";
        String body="Joe Soap,012 345 6789,098 765 4321";
        
        try {
            CsvUtilities.writeCsvFile(csvFileName, header, body);
            System.out.println("\nWrote file : "+csvFileName);
        } catch (Exception ex) {
            System.out.println("Failed to write file error is : "+ex.getMessage());
        }        
        body="Jane Doe,011 234 5678,061 234 5678";
        
        try {
            CsvUtilities.appendCsvFile(csvFileName,  body);
            System.out.println("\nAppended file : "+csvFileName);
        } catch (Exception ex) {
            System.out.println("Failed to write file error is : "+ex.getMessage());
        }
        
    }
}
