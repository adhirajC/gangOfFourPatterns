package gangOfFourPatterns;

public class Algorithm {
	 private Strategy strategy;

	   public Algorithm(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public String executeStrategy(int arg0, int arg1){
	      return strategy.doOperation(arg0, arg1);
}
}
