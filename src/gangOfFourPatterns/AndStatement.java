package gangOfFourPatterns;

public class AndStatement implements Expression {
	 
	   private Expression expressionFirst;
	   private Expression expressionSecond;

	   public AndStatement(Expression expr1, Expression expr2) { 
	      this.expressionFirst = expr1;
	      this.expressionSecond = expr2;
	   }

	   @Override
	   public boolean interpret(String context) {		
	      return expressionFirst.interpret(context) && expressionSecond.interpret(context);
	   }
	}