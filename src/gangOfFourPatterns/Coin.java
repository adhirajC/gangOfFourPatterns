package gangOfFourPatterns;

public class Coin extends Money{

	public Coin(){
	     type = "Coin";
	   }
	
	@Override
	void used() {
		// TODO Auto-generated method stub
		  
System.out.println("I get used in denominations of 0.05,0.10,0.25,0.50,1.00 and 2.00");
		   
	}

}
