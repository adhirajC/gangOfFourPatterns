package gangOfFourPatterns;

public interface HotDogVisitor {
	public void visit(HotDog hotdog);
	public void visit(Bread bread);
	public void visit(Sausage sausage);
	public void visit(Mustard mustard);
}
