/**
 *
 * @author Nico Michael
 */
public final class MarsRover extends MotorizedVehicle {
    
    public MarsRover(String manufacturer,String model){
        super("Rover",manufacturer,model);
    }
    
    @Override    
    public void setSpeedIncreaseFactor(double speedIncreaseFactor) {
        System.out.println("setting speedIncreaseFactor in MarsRover class to "+speedIncreaseFactor);
        super.setSpeedIncreaseFactor( speedIncreaseFactor);
    }

    @Override
    public void setSpeedDecreaseFactor(double speedDecreaseFactor) {
        System.out.println("setting speedDecreaseFactor in MarsRover class to "+speedDecreaseFactor);
        super.setSpeedDecreaseFactor(speedDecreaseFactor);
    }
    
}
