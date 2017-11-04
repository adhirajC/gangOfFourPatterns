package gangOfFourPatterns;

public class GangOfFourPattern {
	public static void main(String[] args) {

		//Abstract
		System.out.println("Example of Abstract Factory Method");
		AbstractFactory desertFactory=FactoryMaker.getFactory("desert");
		Desert cupCakeDesert=desertFactory.getDesert("cupcake");
		cupCakeDesert.make();
		Desert iceCreamDesert=desertFactory.getDesert("IceCream");
		iceCreamDesert.make();
		AbstractFactory flavourFactory = FactoryMaker.getFactory("flavour");
		Flavour chocolateFlavour = flavourFactory.getFlavour("chocolate");
		chocolateFlavour.taste();
		Flavour vanillaFlavour = flavourFactory.getFlavour("vanilla");
		vanillaFlavour.taste();
		//Builder
		System.out.println("Example of Builder Pattern");
		ShopBuilder buildShop=new ShopBuilder();
		Shop shopping=buildShop.buildShop();
		System.out.println("Drinks bought:");
		shopping.showItems();
		System.out.println("sum of drinks is"+shopping.getCost());
		//Factory
		System.out.println("Example of Factory Pattern");
		BuildingFactory buildingFactory = new BuildingFactory();
	     Building condo = buildingFactory.getBuilding("condo");
	     condo.live();
	     Building house = buildingFactory.getBuilding("house");
	     house.live();
	     System.out.println("Example of Prototype Pattern");
		//Prototype
MoneyCache.getCache();
Money money1=(Money) MoneyCache.getMoney("100");
System.out.println("Money: " + money1.getType());		
Money money2=(Money) MoneyCache.getMoney("200");
System.out.println("Money: " + money2.getType());		
		//Singleton
System.out.println("Example of Singleton Pattern");
		 Person person = Person.getInstance();
		 person.talk();
		//Adapter
		 System.out.println("Example of Adapter Pattern");
		Storage storage=new Storage();
		storage.store("movie",600,"titanic");
		storage.store("document", 4, "resume");
		//Bridge
		System.out.println("Example of Bridge Pattern");
		  Animal lion = new Mammal(new Lion());
	      Animal sheep = new Mammal(new Sheep());
	      lion.soundMaker();
	      sheep.soundMaker();

		//Composite
	      System.out.println("Example of Composite Pattern");
		 Officer general = new Officer("Reggie","General");
		 Officer lieutenant=new Officer("Jerry","Lieutenant");
		 Officer cadet=new Officer("Raj","Cadet");
		 general.add(lieutenant);
		 lieutenant.add(cadet);
	      System.out.println(general.getString());
	      for (Officer head:general.getJuniors()){
	    	  System.out.println(head.getString());
	    	  for (Officer officer : head.getJuniors()) {
	              System.out.println(officer.getString());
	           }
	      }

//Decorator Pattern
	      System.out.println("Example of Decorator Pattern");
	      Food vegetable = new Vegetable();

	      Food celery = new CeleryVegetableDecorator(new Vegetable());

	      System.out.println("normal veggie");
	      vegetable.eat();

	      System.out.println("celery veggie");
	      celery.eat();
//facade pattern
	      System.out.println("Example of Factory Pattern");

	      VehicleMaker vehicleMaker = new VehicleMaker();

	      vehicleMaker.driveMotorcycle();
//flyweight pattern
	      System.out.println("Example of Flyweight Pattern");

	      Car car = (Car)VehicleFactory.getVehicle("toyota");
	      car.drive();
//proxy image
	      System.out.println("Example of Proxy Pattern");

	      Vehicle bike=new ProxyBicycle("suzuki");
	      bike.drive();
	   
//command 
	      System.out.println("Example of Command Pattern");

	Post comment=new Post();
	writePost writePost=new writePost(comment);
	deletePost deletePost=new deletePost(comment);
	
	User user=new User();
	user.doAction(writePost);
	user.doAction(deletePost);
	user.executeAction();
//interpreter
    System.out.println("Example of Interpreter Pattern");

	Expression isTrue=new OrStatement(new Statement("Grass"),new Statement("Leaf"));
	System.out.println("Grass is green?" + isTrue.interpret("Grass"));
//iterator
    System.out.println("Example of Iterator Pattern");

	 Fridge fridge = new Fridge();
	for(Iterator iterator = fridge.getIterator(); iterator.hasNext();){
        String food = (String)iterator.next();
        System.out.println("Food is" + food);
     }
//Mediator
    System.out.println("Example of Mediator Pattern");

	Speaker adhiraj=new Speaker("Adhiraj");
	adhiraj.speak("Hey my name is adhiraj");
//Memento
    System.out.println("Example of Memento Pattern");

	Initial initial = new Initial();
    Maintenance maintenance = new Maintenance();
    initial.setState("saved");
    maintenance.addSave(initial.saveState());
    initial.getSavedState(maintenance.getSave(0));
    System.out.println("state is" + initial.getState());
//Observer
    System.out.println("Example of Observer Pattern");

    Midterm midterm = new Midterm();
    new TeachingAssistant(midterm);
    new Student(midterm);
    midterm.setState("scheduled");
//State
    System.out.println("Example of State Pattern");

    Instrument instr = new Instrument();
   InitialState initialState = new InitialState();
    initialState.execute(instr);

    System.out.println(instr.getState().toString());

    EndState endState = new EndState();
    endState.execute(instr);

    System.out.println(instr.getState().toString());
	
//Strategy
    System.out.println("Example of Strategy Pattern");

    Algorithm alg = new Algorithm(new SayHello());		
    
    System.out.println("Algorithm says:"+alg.executeStrategy(10, 5));
//Template
    System.out.println("Example of Template Pattern");

    Shirt shirt=new TeeShirt();
    shirt.create();
    System.out.println();
    shirt=new SweatShirt();
    shirt.create();
 //Visitor
    System.out.println("Example of Visitor Pattern");

    HotDog hotdog=new HotDog();
    hotdog.accept(new HotDogPartDetail());
}
}
