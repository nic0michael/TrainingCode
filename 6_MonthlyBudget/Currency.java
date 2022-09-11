
/**
 *
 * @author 27825
 */
public enum Currency {
    
    USD("$"), 
    EURO("€"), 
    GBP("£"), 
    ZAR("R");
    

    private String symbol;
    
    private Currency(String symbol){
        this.symbol=symbol;
    }
    
    public String getSymbol(){
        return symbol;
    }
}
