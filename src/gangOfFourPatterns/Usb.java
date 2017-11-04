package gangOfFourPatterns;

public class Usb implements NewStorageDevice{

	@Override
	public void storeMovie(int size, String fileName) {
		// TODO Auto-generated method stub
	      System.out.println("Storing movie"+ fileName);		
	}

	@Override
	public void storeDocument(int size, String fileName) {
		// TODO Auto-generated method stub
		
	}

}
