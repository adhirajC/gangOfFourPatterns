package gangOfFourPatterns;

public class Paper extends Money{

	public Paper(){
	     type = "Paper";
	   }
	@Override
	void used() {
		// TODO Auto-generated method stu
			   System.out.println("I get used in denominations of 5,10,20,50 and 100");
			   
	}

}
