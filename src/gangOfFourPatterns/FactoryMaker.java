package gangOfFourPatterns;

public class FactoryMaker {
	public static AbstractFactory getFactory(String option){
		   
	      if(option.equals("desert")){
	         return new DesertFactory();
	         
	      }else if(option.equalsIgnoreCase("flavour")){
	         return new FlavourFactory();
	      }
	      
	      return null;
	   }
}
