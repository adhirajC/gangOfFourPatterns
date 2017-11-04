package gangOfFourPatterns;

public class InitialState implements State{
	
		   public String toString(){
		      return "Instrument started";
		   }

		@Override
		public void execute(Instrument instrument) {
			// TODO Auto-generated method stub
			 System.out.println("Turned on the instrument");
		      instrument.setState(this);	
		}
}
