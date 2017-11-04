package gangOfFourPatterns;

import java.util.ArrayList;
import java.util.List;

public class Midterm {
	 private List<Observer> observers = new ArrayList<Observer>();
	   private String state;

	   public String getState() {
	      return state;
	   }

	   public void setState(String state) {
	      this.state = state;
	      notifyAllObservers();
	   }

	   public void add(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   } 
}
