package gangOfFourPatterns;

public abstract class AbstractChain {
	 public static int FIRST = 1;
	   public static int SECOND = 2;

	   protected int location;

	   //next element in chain or responsibility
	   protected AbstractChain nextChain;

	   public void setNextChain(AbstractChain nextChain){
	      this.nextChain = nextChain;
	   }

	   public void getMessage(int location, String findme){
	      if(this.location <= location){
	         talk(findme);
	      }
	      if(nextChain !=null){
	         nextChain.getMessage(location, findme);
	      }
	   }

	   abstract protected void talk(String findme);
}
