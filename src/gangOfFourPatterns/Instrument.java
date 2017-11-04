package gangOfFourPatterns;

public class Instrument {
	   private State state;

	   public Instrument(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
	}