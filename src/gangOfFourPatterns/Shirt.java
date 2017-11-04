package gangOfFourPatterns;

public abstract class Shirt {
	 abstract void initialize();
	   abstract void startProduction();
	   abstract void endProduction();

	   //template method
	   public final void create(){

	      //initialize the game
	      initialize();

	      //start game
	      startProduction();

	      //end game
	      endProduction();
	   }
}
