package gangOfFourPatterns;

public class EndState implements State{
		   public String toString(){
		      return "State just stopped";
		   }

		@Override
		public void execute(Instrument instrument) {
			// TODO Auto-generated method stub
			    System.out.println("Instrument just stopped");
		      instrument.setState(this);	
		}
		}

