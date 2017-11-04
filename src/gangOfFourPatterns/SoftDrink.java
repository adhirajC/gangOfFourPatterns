package gangOfFourPatterns;

public abstract class SoftDrink implements Drink{
	   @Override
	   public Wrap wrapper(){
		   return new Plastic();
	   }
	   @Override
	   public abstract float price();
}
