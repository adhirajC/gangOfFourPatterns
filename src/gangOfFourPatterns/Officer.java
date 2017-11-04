package gangOfFourPatterns;

import java.util.ArrayList;
import java.util.List;

public class Officer {
	   private String name;
	   private List<Officer> juniors;
	   private String type;
	   // constructor
	   public Officer(String name, String type) {
	      this.name = name;
	      this.type=type;
	      juniors = new ArrayList<Officer>();
	   }
	   public List<Officer> getJuniors(){
	     return juniors;
	   }
	   public void add(Officer e) {
	      juniors.add(e);
	   }

	   public void remove(Officer e) {
	      juniors.remove(e);
	   }

	  

	   public String getString(){
	      return ("Officer is a"+type+"whose name is"+name);
	   }   
	}