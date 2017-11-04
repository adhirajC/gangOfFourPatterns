package gangOfFourPatterns;

public class Mustard implements HotDogPart{

	@Override
	public void accept(HotDogVisitor hotDogVisitor) {
		// TODO Auto-generated method stub
		hotDogVisitor.visit(this);
	}

}
