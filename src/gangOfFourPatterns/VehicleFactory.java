package gangOfFourPatterns;

import java.util.HashMap;

public class VehicleFactory {
	   private static final HashMap<String, Vehicle> vehicleMap = new HashMap();

	   public static Vehicle getVehicle(String type) {
	      Car car = (Car)vehicleMap.get(type);

	      if(car == null) {
	        car = new Car (type);
	         vehicleMap.put(type, car);
	         System.out.println("Type of car is : " + type);
	      }
	      return car;
	   }
}
