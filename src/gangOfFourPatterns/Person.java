package gangOfFourPatterns;

public final class Person {
	
	    private static volatile Person instance = null;

	    private Person() {}

	    public static Person getInstance() {
	        if (instance == null) {
	            synchronized(Person.class) {
	                if (instance == null) {
	                    instance = new Person();
	                }
	            }
	        }
	        return instance;
	    }
	    public void talk(){
	        System.out.println("Hey how are you?");
	     }
	

}
