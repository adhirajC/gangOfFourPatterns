package gangOfFourPatterns;

public class CeleryVegetableDecorator extends FoodDecorator{
	   public CeleryVegetableDecorator(Food decoratedFood) {
		      super(decoratedFood);		
		   }

		   @Override
		   public void eat() {
		      decoratedFood.eat();	       
		      setSound(decoratedFood);
		   }

		   private void setSound(Food decoratedFood){
		      System.out.println("and is celery");
		   }
}
