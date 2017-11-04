package gangOfFourPatterns;

public class Student extends Observer{
	   public Student(Midterm midterm){
		      this.midterm = midterm;
		      this.midterm.add(this);
		   }

		   @Override
		   public void update() {
		      System.out.println( "Have to study for the midterm" ); 
		   }
		}

