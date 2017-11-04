package gangOfFourPatterns;

public class FirstChain extends AbstractChain{

	public FirstChain(int location){
		this.location=location;
	}
	@Override
	protected void talk(String findme) {
		// TODO Auto-generated method stub
	      System.out.println("First chain says: " + findme);

	}

}
