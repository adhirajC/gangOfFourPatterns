package gangOfFourPatterns;

public class FoodDecorator implements Food{
	protected Food decoratedFood;
	 public FoodDecorator(Food decoratedFood){
	      this.decoratedFood = decoratedFood;
	   }
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		decoratedFood.eat();
	}

}
