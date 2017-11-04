package gangOfFourPatterns;

public class Storage implements StorageDevice{

	@Override
	public void store(String type, int size, String filename) {
		
	      if(type.equals("movie")){
	         System.out.println("Store movie: " + filename);			
	      } 
	      else if(type.equals("document")){
	         StorageAdapter adapt = new StorageAdapter(type);
	         adapt.store(type, size, filename);
	      }
	      else{
	         System.out.println("Invalid");
	      }
	   }   
	}


