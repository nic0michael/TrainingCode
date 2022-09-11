/**
 *
 * @author Nico Michael
 */
public class Motorcar extends MotorizedVehicle {
    
    public Motorcar(String manufacturer,String model){
        super("Motorcar",manufacturer,model);
    }
    
    @Override    
    public void setSpeedIncreaseFactor(double speedIncreaseFactor) {
        System.out.println("setting speedIncreaseFactor in Motorcar class to "+speedIncreaseFactor);
        super.setSpeedIncreaseFactor( speedIncreaseFactor);
    }

    @Override
    public void setSpeedDecreaseFactor(double speedDecreaseFactor) {
        System.out.println("setting speedDecreaseFactor in Motorcar class to "+speedDecreaseFactor);
        super.setSpeedDecreaseFactor(speedDecreaseFactor);
    }
    
    
}
