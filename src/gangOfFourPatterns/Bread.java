package gangOfFourPatterns;

public class Bread implements HotDogPart {

	@Override
	public void accept(HotDogVisitor hotDogVisitor) {
		// TODO Auto-generated method stub
		hotDogVisitor.visit(this);
	}

}
