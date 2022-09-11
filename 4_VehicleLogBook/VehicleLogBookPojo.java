
/**
 *
 * @author 27825
 */
public class VehicleLogBookPojo {

    String date;
    String customer;
    boolean isPrivate;
    int tripStart;
    int tripEnd;
    int distance;
    double fuelCost;
    double oilCost;
    double garageCost;
    double tollPaid;
    String whereTollPaid;
    
    
    public String makeHeader(){
        String header ="";
        header +="date";
        header +=",";
        header +="customer";
        header +=",";
        header +="isPrivate";
        header +=",";
        header +="tripStart";
        header +=",";
        header +="tripEnd";
        header +=",";
        header +="distance";
        header +=",";
        header +="fuelCost";
        header +=",";
        header +="oilCost";
        header +=",";
        header +="garageCost";
        header +=",";
        header +="tollPaid";
        header +=",";
        header +="whereTollPaid";
        
        return header;
    }
    
    public String makeBody() {  
        String body ="";
        body += date;
        body += ",";
        body += customer;
        body += ",";
        body += isPrivate;
        body += ",";
        body += tripStart;
        body += ",";
        body += tripEnd;
        body += ",";
        body += distance;
        body += ",";
        body += fuelCost;
        body += ",";
        body += oilCost;
        body += ",";
        body += garageCost;
        body += ",";
        body += tollPaid;
        body += ",";
        body += whereTollPaid;
        
        return body;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public int getTripStart() {
        return tripStart;
    }

    public void setTripStart(int tripStart) {
        this.tripStart = tripStart;
    }

    public int getTripEnd() {
        return tripEnd;
    }

    public void setTripEnd(int tripEnd) {
        this.tripEnd = tripEnd;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public double getOilCost() {
        return oilCost;
    }

    public void setOilCost(double oilCost) {
        this.oilCost = oilCost;
    }

    public double getGarageCost() {
        return garageCost;
    }

    public void setGarageCost(double garageCost) {
        this.garageCost = garageCost;
    }

    public double getTollPaid() {
        return tollPaid;
    }

    public void setTollPaid(double tollPaid) {
        this.tollPaid = tollPaid;
    }

    public String getWhereTollPaid() {
        return whereTollPaid;
    }

    public void setWhereTollPaid(String whereTollPaid) {
        this.whereTollPaid = whereTollPaid;
    }

}
