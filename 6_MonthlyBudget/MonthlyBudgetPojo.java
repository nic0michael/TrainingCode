
/**
 *
 * @author 27825
 */
public class MonthlyBudgetPojo {
    private String description;
    private double amount; 
    private double total; 
    private String currency;
    private boolean isExpense;
    
    
    public String makeHeader(){
        String header ="";
        header +="description";
        header +=",";
        header +="amount";
        header +=",";
        header +="total";
        header +=",";
        header +="currency";
        header +=",";
        header +="isExpense";
        
        return header;
    }
    
    public String makeBody() {  
        String body ="";
        body += description;
        body += ",";
        body += amount;
        body += ",";
        body += total;
        body += ",";
        body += currency;
        body += ",";
        body += isExpense;
        
        return body;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isIsExpense() {
        return isExpense;
    }

    public void setIsExpense(boolean isExpense) {
        this.isExpense = isExpense;
    }

    
}
