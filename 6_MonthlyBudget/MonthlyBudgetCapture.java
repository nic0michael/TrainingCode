
/**
 *
 * @author 27825
 */
public class MonthlyBudgetCapture {

    public static MonthlyBudgetPojo capture(boolean isExpense,String currency) throws Exception {
        MonthlyBudgetPojo pojo = new MonthlyBudgetPojo();

        String description = StringUtilities.getStringFromUser("Enter description", "failed to get description");
        double amount = StringUtilities.getDoubleFromUser("Enter Amount", "Failed to enter Amount");
      
        pojo.setDescription(description);
        pojo.setAmount(amount);
        pojo.setCurrency(currency);
        pojo.setIsExpense(isExpense);
        if(isExpense){
            pojo.setTotal(amount * -1);
        } else{
            pojo.setTotal(amount);
        }
        return pojo;
    }
}
