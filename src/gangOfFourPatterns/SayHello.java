package gangOfFourPatterns;

public class SayHello implements Strategy{
	 @Override
	   public String doOperation(int arg0, int arg1) {
	      if (arg0>arg1){
	    	  return "Hello!";
	      }
	      return "not saying hello!";
	   }
}
