import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MotorizedVehicle {
    private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private String vehicleType;
    private String manufacturer;
    private String model;
    private double fuel = 45.5;
    private double odometerKM;
    private double speedKPH;
    private double direction;
    private String operation;
    private double engineTemperature;
    private int engineRPM;
    private double speedIncreaseFactor=3;
    private double speedDecreaseFactor=1.5;
    
    private MotorizedVehicle(){}
    
    public MotorizedVehicle(String vehicleType,String manufacturer,String model){
        System.out.println("\n\nTransmitting "+manufacturer+" "+model+" telemetry");
        this.vehicleType=vehicleType;
        this.manufacturer=manufacturer;
        this.model=model;
    }

    protected final void startEngine() {
        operation = "Engine Started";
        engineRPM = 1200;
        engineTemperature = 25;
        odometerKM=20000;
        System.out.println(getStatus());
    }

    protected final void stopEngine() {
        operation = "Engine Stopped";
        speedKPH = 0;
        engineRPM = 0;
 //       engineTemperature = 25;
        System.out.println(getStatus());
    }

    protected final void accelerate(int timeSeconds) {
        operation = "Accelerated for "+timeSeconds+" seconds";
        double speedIncrease=speedIncreaseFactor*timeSeconds;
        speedKPH += speedIncrease;
        if(speedKPH>350){
            operation+= " engine throttled down to 350 K/h";
            speedKPH=350;
        }
        engineRPM += (speedIncreaseFactor*speedIncrease);
        engineTemperature += 10;
        double distance =(speedKPH*timeSeconds)/3600;
        fuel-=(distance/5);
        odometerKM+=distance;
        System.out.println(getStatus());
    }

    protected final void decelerate(int time) {
        operation = "Decelerated for "+time+" seconds";
        double speedDecrease=speedDecreaseFactor*time;
        speedKPH -= speedDecrease;
        engineRPM -= (speedDecreaseFactor*speedDecrease);
        engineTemperature -= 10;
        if (speedKPH == 0 || engineRPM == 0) {
            speedKPH = 0;
            engineRPM = 0;
            engineTemperature = 25;

        }
        System.out.println(getStatus());
    }

    protected final void turnLeft(double angle) {
        operation = "Turned left "+angle+" degrees";
        if (angle <= 360) {
            direction -= angle;
            if (direction < 0) {
                direction = 360 + direction;
            }
        } else {
            System.out.println("invalid angle " + angle);
        }
        System.out.println(getStatus());
    }

    protected final void turnRight(double angle) {
        operation = "Turned right "+angle+" degrees";
        if (angle <= 360) {
            direction += angle;
            if (direction > 360) {
                direction = direction - 360;
            }
        } else {
            System.out.println("invalid angle " + angle);
        }
        System.out.println(getStatus());
    }
    
    protected final void goForwards(double minutes){
        operation = "Drove forwards for "+minutes+" minutes";
        double distance =(speedKPH*minutes)/60;
        odometerKM+=distance;
        fuel-=(distance/5);
        System.out.println(getStatus());
    }

    protected final String getStatus(){
        String status="\n######################\n ";
        status+=getTimeStampString();
        status+="\n ";
        status+=operation;
        status+="\n ";
        status+=manufacturer;
        status+=" ";
        status+=model;
        status+="\n odometer ";
        status+=String.format("%,.2f", odometerKM);
        status+="km\n direction ";
        status+=direction;
        status+=" degrees \n speed ";
        status+=String.format("%,.2f", speedKPH);
        status+=" km/h\n Engine Revs ";
        status+=engineRPM;
        status+=" RPM\n Engine temperature ";
        status+=String.format("%,.2f", engineTemperature);
        status+=" deg C\n Fuel level ";
        status+=String.format("%,.2f", fuel);
        status+=" Litres\n";
        status+="######################\n";
        
           
        
        return status;
        
    }

    protected void setSpeedIncreaseFactor(double speedIncreaseFactor) {
        this.speedIncreaseFactor = speedIncreaseFactor;
    }

    protected void setSpeedDecreaseFactor(double speedDecreaseFactor) {
        this.speedDecreaseFactor = speedDecreaseFactor;
    }
    
    private final String getTimeStampString(){        
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String timeStampString =sdf3.format(timestamp);
        return timeStampString;
    }

}
