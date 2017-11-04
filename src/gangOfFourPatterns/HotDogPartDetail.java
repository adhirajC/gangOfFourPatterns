package gangOfFourPatterns;

public class HotDogPartDetail implements HotDogVisitor{

	@Override
	public void visit(HotDog hotdog) {
		// TODO Auto-generated method stub
	      System.out.println("I have a hot dog");

	}

	@Override
	public void visit(Bread bread) {
		// TODO Auto-generated method stub
	      System.out.println("I have bread");

	}

	@Override
	public void visit(Sausage sausage) {
		// TODO Auto-generated method stub
	      System.out.println("I have sausage");

	}

	@Override
	public void visit(Mustard mustard) {
		// TODO Auto-generated method stub
	      System.out.println("I have mustard");

	}

}
