package gangOfFourPatterns;

public abstract class Beer implements Drink{
	 	
	   @Override
	   public Wrap wrapper(){
		   return new Glass();
	   }
	   
	   @Override
	   public abstract float price();
}
