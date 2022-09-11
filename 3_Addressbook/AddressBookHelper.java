import java.io.IOException;

/**
 *
 * @author root
 */
public class AddressBookHelper {

    public static final String CSV_FILE_NAME = "AddressBook_v1.csv";

    public static void captureAddressBook() {

        boolean failed = false;
        String errorMessage = "";
        AddressBookPojo pojo = null;
        
        try {
            pojo = AddressBookCapture.capture();
        } catch (IOException ex) {
            failed = true;
            errorMessage = "Failed to capture AddressBook";
            pojo = null;
        }
        
        if(pojo != null && pojo.getName()!=null){
            saveAddressBookPojo( pojo);
        }
        
        if(failed){
            System.out.println(errorMessage);
        }
    }

    private static void saveAddressBookPojo(AddressBookPojo pojo) {

        if(null == pojo){
            System.err.println("Pojo is null");
            return;
        }
        
        boolean csvExists = FileUtilities.exists(CSV_FILE_NAME);
        String header = pojo.makeHeader();
        String body = pojo.makeBody();
        

        try {
            if (csvExists) {
                CsvUtilities.appendCsvFile(CSV_FILE_NAME, body);
                System.out.println("\nAppended file : " + CSV_FILE_NAME);
            } else {
                CsvUtilities.writeCsvFile(CSV_FILE_NAME, header, body);
                System.out.println("\nWrote file : " + CSV_FILE_NAME);
            }
        } catch (Exception ex) {
            if (csvExists) {
                System.out.println("Failed to append file error is : " + ex.getMessage());
            } else {
                System.out.println("Failed to write new file error is : " + ex.getMessage());                
            }
        }
    }
}
