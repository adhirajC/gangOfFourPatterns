package gangOfFourPatterns;

public class TeachingAssistant extends Observer{
	   public TeachingAssistant(Midterm midterm){
		      this.midterm = midterm;
		      this.midterm.add(this);
		   }

		   @Override
		   public void update() {
		      System.out.println( "Have to proctor the midterm" ); 
		   }
		}
