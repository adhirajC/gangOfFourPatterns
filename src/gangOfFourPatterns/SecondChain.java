package gangOfFourPatterns;

public class SecondChain extends AbstractChain{
	
	public SecondChain(int location){
		this.location=location;
	}
	@Override
	protected void talk(String findme) {
		// TODO Auto-generated method stub
	      System.out.println("Second chain says: " + findme);

	}

}
