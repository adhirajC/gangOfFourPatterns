package gangOfFourPatterns;

public class Car implements Vehicle{
	private String type;
public Car(String type){
	this.type=type;
}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("I am driving on 4 wheels");
	}

}
