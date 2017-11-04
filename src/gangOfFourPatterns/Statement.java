package gangOfFourPatterns;

public class Statement implements Expression {
	
	   private String statement;

	   public Statement(String statement){
	      this.statement = statement; 
	   }

	   @Override
	   public boolean interpret(String info) {
	   
	      if(info.contains(statement)){
	         return true;
	      }
	      return false;
	   }
	}