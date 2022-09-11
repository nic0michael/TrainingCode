/**
 *
 * @author Nico Michael
 */
public class VehicleTest {

    public static void main(String[] args) {
        System.out.println("MotorizedVehicle Telemetry Demo");
        MotorizedVehicle lamborghini =new Motorcar("Lamborghini", "Aventador SVJ Roadster");
        
        lamborghini.setSpeedIncreaseFactor(37.5);
        lamborghini.setSpeedDecreaseFactor(25.5);
        
        lamborghini.startEngine();
        lamborghini.accelerate(5);        
        lamborghini.turnRight(30);        
        lamborghini.goForwards(20);        
        lamborghini.decelerate(3);    
        lamborghini.accelerate(2);
        lamborghini.decelerate(7);
        lamborghini.stopEngine();
        
        MotorizedVehicle marsRover =new MarsRover("NASA MARS Rover", "Opportunity");
        
        marsRover.setSpeedIncreaseFactor(1.5);
        marsRover.setSpeedDecreaseFactor(2.5);
        
        marsRover.startEngine();
        marsRover.accelerate(12);        
        marsRover.turnRight(15.5);        
        marsRover.goForwards(9.5);        
        marsRover.decelerate(3);    
        marsRover.accelerate(2);
        marsRover.decelerate(7);
        marsRover.stopEngine();
    }
}
