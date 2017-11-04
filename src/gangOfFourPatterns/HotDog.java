package gangOfFourPatterns;

public class HotDog implements HotDogPart{
	 HotDogPart[] parts;

	   public HotDog(){
	      parts = new HotDogPart[] {new Bread(), new Sausage(), new Mustard()};		
	   } 
	 @Override
	   public void accept(HotDogVisitor visitor) {
	      for (int i = 0; i < parts.length; i++) {
	         parts[i].accept(visitor);
	      }
	      visitor.visit(this);
	   }
}
