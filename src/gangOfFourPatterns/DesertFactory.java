package gangOfFourPatterns;

public class DesertFactory extends AbstractFactory{

	@Override
	public Flavour getFlavour(String flavour) {
	return null;
	}

	@Override
	public Desert getDesert(String desert) {
		 if(desert.equals("cupcake")){
	         return new CupCake();
	         
	      }else if(desert.equals("IceCream")){
	         return new IceCream();
	      }
	      return null;
	}

}
