package gangOfFourPatterns;

public class FlavourFactory extends AbstractFactory{

	@Override
	public Flavour getFlavour(String flavour) {
		// TODO Auto-generated method stub
		if (flavour.equals("chocolate")){
			return new Chocolate();
		}else if(flavour.equals("vanilla")){
			return new Vanilla();
		}
		return null;
	}

	@Override
	public Desert getDesert(String desert) {
		// TODO Auto-generated method stub
		return null;
	}

}
