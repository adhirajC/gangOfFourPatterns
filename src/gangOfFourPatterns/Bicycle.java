package gangOfFourPatterns;

public class Bicycle implements Vehicle{
private String type;
	public Bicycle(String type){
	this.type=type;
}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("I am on a bicycle!!");
	}

}
