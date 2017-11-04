package gangOfFourPatterns;

public class SayGoodbye implements Strategy{
	 @Override
	   public String doOperation(int arg0, int arg1) {
	      if (arg0<arg1){
	    	  return "Goodbye!";
	      }
	      return "not saying goodbye!";
	   }
}


