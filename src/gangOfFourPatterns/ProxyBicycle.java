package gangOfFourPatterns;

public class ProxyBicycle implements Vehicle{
private Bicycle realBike;
private String type;
	public ProxyBicycle(String type){
		this.type=type;
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		if (realBike==null){
			realBike=new Bicycle(type);
		}
		realBike.drive();
	}

}
