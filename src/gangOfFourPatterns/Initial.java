package gangOfFourPatterns;

public class Initial {
	  private String state;

	   public void setState(String state){
	      this.state = state;
	   }

	   public String getState(){
	      return state;
	   }

	   public Saved saveState(){
	      return new Saved(state);
	   }

	   public void getSavedState(Saved save){
	      state = save.getState();
	   }
}
