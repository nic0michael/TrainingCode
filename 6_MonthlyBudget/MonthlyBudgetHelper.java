
/**
 *
 * @author 27825
 */
public class MonthlyBudgetHelper {

    public static final String CSV_FILE_NAME = "MonthlyBudget_v1.csv";
    public static final boolean IS_EXPENCE = true;
    public static final boolean IS_INCOME = false;

    public static void capture() {
        String currency = Currency.USD.getSymbol();
        MonthlyBudgetPojo pojo = null;
        boolean yesNo = false;

        try {
            System.out.println("Add Income to Budget");
            pojo = MonthlyBudgetCapture.capture(IS_INCOME, currency);
            saveMonthlyBudgetPojo(pojo);

            do {
                System.out.println("Do you want to enter another (expense) entry to the Monthly Budget");

                yesNo = StringUtilities.yesNo("Enter Y(es) N(o)", "Invalid value not Y or yes or N or no");

                if (yesNo) {
                    System.out.println("add and expense to Budget");
                    pojo = MonthlyBudgetCapture.capture(IS_EXPENCE, currency);
                    saveMonthlyBudgetPojo(pojo);
                }
            } while (yesNo);

        } catch (Exception ex) {
            System.out.println("Än error occured whilecapturing");
        }
    }

    private static void saveMonthlyBudgetPojo(MonthlyBudgetPojo pojo) {

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
