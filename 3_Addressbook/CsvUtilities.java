
public class CsvUtilities {
    
    public static void writeCsvFile(String csvFileName, String header,String body)  throws Exception {
        String content = header;
        content += "\n";
        content += body;
        content += "\n";
        FileUtilities.writeFile(csvFileName, content);
        
    }
    
    public static void appendCsvFile(String csvFileName, String body)  throws Exception {
        String content =body;
        FileUtilities.appendFile(csvFileName, content);
        
    }
}
