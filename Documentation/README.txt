ReadMe

How To Run:
Run from main method in gangOf4
Attachments:
UML Class Diagram is also attached as ClassDiagram.jpg
Background
-this project consists of 23 design patterns, split between Behavioural,
Structural and creational patterns.
The project starts with creational patterns, which is allows one to create
objects and not require to explicitly instantiate objects
Creational patterns:

Abstract factory pattern:basically a super factory which creates other factoires,
it is the best way to create objects as it does not require classes to be specified and
you can just create different factories to deal with different parts of an object.
For example, we have two factories flavour factory and desert factory that
operate independant of each other but inherit their functions from the superclass
AbstractFactory, this allows for several different functions to be done without explicit
specification related to one another.
Therefore first 2 outputs are from the desert factory and the last 2 from the flavour factory

Builder Pattern:basically allows for several objects to create a object which is the summation of the objects
For example, we have a shopping list that encompasses drinks(beer and soft drinks), we simplify this even more
to the objects that create a beer(for this example, we just state that beer is stored in glasses but the example can be made bigger
by stating that beer is made of hops, water, etc) and a soft drink. All these simple objects are then summed to make the shoppinglist
 
 Factory Method Pattern:One of the most basic and widely used patterns, basically have an interface that the factory in charge of creating the objects
 will use(in this case BuildingFactory), then we can specify different type of objects that are examples of initial interface such as Condos, Houses, etc.
 
 Prototype Pattern: a very helpful pattern for when creation is necessary, but expensive, we just cache the object and then fetch and duplicate objects when we need to
 so for example, we have the cloneable class that is Money which is inherited by Paper and Coin, this then allows us to create the class MoneyCache which lets us return the clone of whatever object we cached,
 very useful for expensive database object creation.
 
 Singleton Pattern: basically a pattern that makes sure that only 1 instance is created, I utilized the lazy initializing which basically takes care of race conditions so that if its called from multiple sources
 at the same time, it can make sure only 1 instance is created, which in this case is the class person and the instance's action is to show the message "hey how are you"
 
 Now we go to structural patterns which are concerned with creating objects which add upon functionalities
 Adapter Pattern: basically allows for specific functionalities to be handled by specific objects according to the functionalities' characteristics. So for example, we have 2 functions(storing a resume and storing a movie), for this example, we will
 say that a floppy disc cant store a movie and a USB cant store a resume. Therefore we have a class called Storage(which inherits the StorageDevice interface), it is in charge of making sure that the proper object is choosen according to the functionality needed
 So USB stores a movie and Floppy Disc stores a document which for this example is resume.
 
 Bridge Pattern: Bridge is used to decouple abstraction and its implementation so they can be used independantly, for this example a Lion and a Sheep both come under the Animal abstract class, can make sounds but make ones specific to their
 objects, such as a lion doing a roar and a sheep doing a "ba-ba", however both are bridged by the MakeSound interface.
 
 Composite Pattern: Required to treat several instances of an object to be treated as a single object, utilizing this pattern also allows us to create a tree like structure, for example in our example,
 a heirarchy is created with the General at top, then his lieutenant and then cadet under him. However, they are all instances of the Officer class and can be treated as just an instance of that class.
 
 Decorator Pattern: Requires to add functionalities to each object without altering the object itself, for example, we output normal veggies which output "this is a vegetable" and then we have the decorator version which makes the vegetable celery and it outputs
 "this is a vegetable" and adds the additional "this is celery" part
 
 Facade Pattern: Basically hides the complexities of the system so we can have a class in the middle to mediate between the details of the system(which is the class vehicle and its subclasses) and just call specific methods like drive on a bicycle, drive on a car, etc,
 acts as an intermediary between the system and the user by adding the element which is the VehicleMaker class
 
 FlyWeight Pattern: very lightweight as one can increase performance and decrease memory usage, for here basically using the vehicle super class from the previous example, we just added a VehicleFactory that gernerates the classes according to the info giving which for this example was a toyota car.
 
 Proxy Pattern: to decrease memory usage, proxy image of an object is created to decrease loading the original image, so for example, we are using a ProxyBicycle to load up the image we want to utilize which is a bicycle(and it prints out the exact copy of the string of the original image).
 
 Now we go to Behavioural Patterns, which are patterns that are in charge of communications between objects 
 Command Pattern: So basically a command is wrapped into an object and passed into another object which looks at which object can handle this command, it then selects the appropriate object
 and sends it to them for executing the command. For our example, we are utilizing the class user that passes allows for a user to post and delete commands, according to the what is choosen by the intermediate object
 
 Interpreter pattern: basically used to evaluate language grammar and used for SQL parsing, etc, we just utilize a class called Statement which has subclasses AndStatements and OrStatements, if a sentence check contains the trigger which we are looking for which in this example, could have been grass or leaf, then a true will be outputed
 
 Iterator Pattern: allows to retrieve all the elements in the proper order without finding out whats under the hood, so we have a Food repository and by implementing an Iterator, we can just look into all the objects(which in this example is chicken, fish, oranges, cheese)
 
 Mediator Pattern: makes communication between classes easier, so for this one, we utilized Conversation and the user is just the mediator, so our example had "user adhiraj said hey my name is adhiraj"
 
 Memento Pattern:It basically controls the state of the object(so we the Saved class that stores the state of a class, the Initial class that is in charge of storing its variables, etc in the Saved class and finally the Maintenance class is in charge of restoring objects from the saved state), in the example, we saw that it is a successful test of saving the proper variables to the saved state and also we can successfully retrieve them too.
 
 Observer Pattern: basically a notification system that allows for all the descendants of a certain class to be notified whenever that certain class is changed, for example, if midterm is scheduled, then the teaching assistant has to proctor the exam and the student has to study for the exam as they get notified as soon as the state of the midterm class(Observable) class is called.
 
 State pattern:basically class's actions change according to state so we have an instrument and according to the state change, it stops or starts, the initialState and endState are in charge of this
 
 Strategy Pattern:basically a pattern which has various strategies which can be altered during run time, for simplicity we only utilized one algorithm which says Hello and another which says Goodbye(sayGoodbye class), they can be altered during run time, its a simple design pattern with tons of flexiblity
 
 Template Method Pattern:Basically shows the templates and ways to execute its methods, methods can be overrided accordingly, for now we had 2 classes, sweat shirt and t shirts and they were inherited from the Shirt abstact class, then methods in both classes were tested to successful results
 
 Visitor Pattern:basically as visitor varies, so does the algorithm, so the visitor object comes in and then completes the operation needed, so for this example we have a hot dog, which is made from sausages, bread and mustard, we then have a class called HotDogPartVisitor which basically has methods that go to Bread, Sausage, Mustard and HotDog as a visitor and does the operation it requires(which is just printing out I have *insert object*)
 
 
 
