package gangOfFourPatterns;

import java.util.ArrayList;
import java.util.List;

public class User {
private List<Action> actionList=new ArrayList<Action>();
public void doAction(Action action){
   actionList.add(action);		
 }

 public void executeAction(){
 
    for (Action action : actionList) {
       action.perform();
    }
    actionList.clear();
 }
}
