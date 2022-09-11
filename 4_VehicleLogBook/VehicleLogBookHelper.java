
/**
 *
 * @author 27825
 */
public class VehicleLogBookHelper {
    
    public static final String CSV_FILE_NAME = "VehicleLogBook_v1.csv";
    
    public static void capture() {

        try {
            System.out.println("Adding an entry to the Vehicle LogBook");
            VehicleLogBookPojo pojo = VehicleLogBookCapture.capture();
            saveVehicleLogBookPojo(pojo);

        } catch (Exception ex) {
            System.out.println("Än error occured while capturing data");
        }
    }

    private static void saveVehicleLogBookPojo(VehicleLogBookPojo pojo) {

        if (null == pojo) {
            System.err.println("Pojo is null");
            return;
        }

        boolean csvExists = FileUtilities.exists(CSV_FILE_NAME);
        String header = pojo.makeHeader();
        String body = pojo.makeBody();

        try {
            if (csvExists) {
                CsvUtilities.appendCsvFile(CSV_FILE_NAME, body);
            } else {
                CsvUtilities.writeCsvFile(CSV_FILE_NAME, header, body);
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
