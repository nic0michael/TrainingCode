public class PlayWithEnums {
     public static void main(String[] args) {
         
         String currentAccount = AccountTypes.CURRENT_ACCOUNT.name();
         System.out.println("My Check Account is an account of type : " +currentAccount);
         
         String yourAccountType = getAccountType(AccountTypes.VEHICLE_FINANCE);
         System.out.println("Your Account is an account of type : "+yourAccountType);
     }
     
     public static String getAccountType(AccountTypes accountTypes){
         return accountTypes.name();
     }
}