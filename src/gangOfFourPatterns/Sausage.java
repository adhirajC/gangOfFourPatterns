package gangOfFourPatterns;

public class Sausage implements HotDogPart{

	@Override
	public void accept(HotDogVisitor hotDogVisitor) {
		// TODO Auto-generated method stub
		hotDogVisitor.visit(this);
	}

}
