package gangOfFourPatterns;

public class OrStatement implements Expression {
	 
	   private Expression firstExpression;
	   private Expression secondExpression;

	   public OrStatement(Expression expr1, Expression expr2) { 
	      this.firstExpression = expr1;
	      this.secondExpression = expr2;
	   }

	   @Override
	   public boolean interpret(String context) {		
	      return firstExpression.interpret(context) || secondExpression.interpret(context);
	   }
	}