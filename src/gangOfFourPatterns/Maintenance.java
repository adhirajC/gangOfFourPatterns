package gangOfFourPatterns;

import java.util.ArrayList;
import java.util.List;

public class Maintenance {
	   private List<Saved> savedList = new ArrayList<Saved>();

	   public void addSave(Saved state){
	      savedList.add(state);
	   }

	   public Saved getSave(int index){
	      return savedList.get(index);
	   }
	}

