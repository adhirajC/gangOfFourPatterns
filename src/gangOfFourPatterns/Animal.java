package gangOfFourPatterns;

public abstract class Animal {
	   protected MakeSound makeSound;
	   
	   protected Animal(MakeSound makeSound){
	      this.makeSound = makeSound;
	   }
	   public abstract void soundMaker();	
	}
