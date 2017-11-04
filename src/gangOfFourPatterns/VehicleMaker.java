package gangOfFourPatterns;

public class VehicleMaker {
	  
	   private Vehicle motorcycle;
	  

	   public VehicleMaker() {
	      motorcycle = new Motorcycle();
	  
	   }

	   public void driveMotorcycle(){
	      motorcycle.drive();
	   }
}
