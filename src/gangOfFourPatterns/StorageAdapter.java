package gangOfFourPatterns;

public class StorageAdapter implements StorageDevice{
	NewStorageDevice advancedStorage;

public StorageAdapter (String type){
	 if(type.equals("movie")){
		 advancedStorage=new Usb();
	 }else if (type.equals("document")){
         advancedStorage = new FloppyDisc();
}
}
	@Override
	public void store(String type, int size, String filename) {
		// TODO Auto-generated method stubt
	      if(type.equals("movie")){
	    	advancedStorage.storeMovie(size, filename);
	       }
	       else if(type.equals("document")){
		    	  //advancedStorage=new FloppyDisc();
			         advancedStorage.storeDocument(size, filename);

	       }
	}

}
