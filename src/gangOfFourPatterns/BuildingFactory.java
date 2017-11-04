package gangOfFourPatterns;

public class BuildingFactory {
	public Building getBuilding (String building){
	      if(building!= null){
	      if (building.equals("condo")){
	      		return new Condo();}
	      else if(building.equals("house")){
	    	  	return new House();
	      }else if(building.equals("mansion")){
	    	  return new Mansion();
	      }}
	     
	      return null;
	   }
}

