/**
 *
 * @author 27825
 */
public class VehicleLogBookCapture {
    
    public static VehicleLogBookPojo capture() throws Exception {
        VehicleLogBookPojo pojo = new VehicleLogBookPojo();
         
        String date = StringUtilities.getStringFromUser("Enter date", "Failed to get date");
        boolean isPrivate = StringUtilities.yesNo("Is this a private trip Y(es) N(o)", "Invalid value for private trip not Y or yes or N or no");
        String customer = StringUtilities.getStringFromUser("Enter customer", "Failed to get ccustomer");
        int tripStart = StringUtilities.getIntFromUser("Enter trip start reading", "failed to get trip start reading");
        int tripEnd = StringUtilities.getIntFromUser("Enter trip end reading", "failed to get trip end reading");
        double fuelCost = StringUtilities.getDoubleFromUser("Enter fuel Cost", "Failed to enter fuel Cost");
        double oilCost = StringUtilities.getDoubleFromUser("Enter oil Cost", "Failed to enter oil Cost");
        double garage = StringUtilities.getDoubleFromUser("Enter garage Cost", "Failed to enter garage Cost");
        double tollPaid = StringUtilities.getDoubleFromUser("Enter toll paid", "Failed to enter toll paid");
        String whereTollPaid = StringUtilities.getStringFromUser("Enter where was toll paid", "Failed to get where was toll paid");

        int distance =tripEnd - tripStart;
        pojo.setDate(date);
        pojo.setIsPrivate(isPrivate);
        pojo.setCustomer(customer);
        pojo.setDistance(distance);
        pojo.setTripEnd(tripEnd);
        pojo.setTripStart(tripStart);
        pojo.setFuelCost(fuelCost);
        pojo.setOilCost(oilCost);
        pojo.setGarageCost(garage);
        pojo.setTollPaid(tollPaid);
        pojo.setWhereTollPaid(whereTollPaid);
        
        return pojo;
    }
}
