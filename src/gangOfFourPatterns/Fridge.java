package gangOfFourPatterns;

public class Fridge implements Container {
	   public String fridge[] = {"chicken" , "fish" ,"oranges" , "cheese"};

	   @Override
	   public Iterator getIterator() {
	      return new FoodIterator();
	   }

	   private class FoodIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < fridge.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return fridge[index++];
	         }
	         return null;
	      }		
	   }
	}