package InstaConcepts;

//	Singleton Class & Singleton Pattern

	//	In Java, Singleton is a design pattern that ensures that a class 
	//	can only have one object.To create a singleton class, a class must 
	//	implement the following properties:

	//	Create a (private) constructor of the class to restrict object creation
	//	outside of the class.Create a private attribute of the class type that 
	//	refers to the single object.Create a public static method that allows 
	//	us to create and access the object we created. Inside the method, 
	//	we will create a condition that restricts us from creating more than one object.

class Singleton{
	//	Singletons can be used while working with databases. They can be used 
	//	to create a connection pool to access the database while reusing the 
	//	same connection for all the clients. For example,
	private static Singleton Instance;
	
	private Singleton() {
		System.out.println("Singleton Pattern Created");
	}
	
	public static Singleton getInstance(){
		if(Instance==null) {
			// create object if it's not already created
			
			Instance=new Singleton();
			
		}
		// returns the singleton object
		return Instance;
		
	}
	
}

//	Builder Method Design Pattern in Java

	//	in builder we can pass only 2 and 4 and 1 and 3 where the methods have 
	//	parameter length of five it should not show error

	//	in every setter it returns the object of the class

	//	Method Chaining: In java, Method Chaining is used to invoke multiple 
	//	methods on the same object which occurs as a single statement. 
	//	Method-chaining is implemented by a series of methods that return 
	//	the this reference for a class instance.

	//	Implementation: As return values of methods in a chain is this reference,
	//	this implementation allows us to invoke methods in chain by having the next
	//	method invocation on the return value of the previous method in the chain.
 class Phone {
//	initialize the variable here
	private String PhoneModel;
	private String Os;
	private int Ram;
	private String Processor;
	private int Battery;
	

	public Phone(String phoneModel, String os, int ram, String processor, int battery) {
		super();
		PhoneModel = phoneModel;
		Os = os;
		Ram = ram;
		Processor = processor;
		Battery = battery;
	}



	@Override
	public String toString() {
		return "Phone Details :\n PhoneModel=" + PhoneModel + "\n Os=" + Os + "\n Ram=" + Ram + "\n Processor=" + Processor
				+ "\n Battery=" + Battery ;
	}



}
 
//	Builder Patter Creation
class PhoneBuilder{
	//	initialize the variable here
	private String PhoneModel;
	private String Os;
	private int Ram;
	private String Processor;
	private int Battery;
	
	// Make sure it should return an PhoneBuilder Object here
	public PhoneBuilder setPhoneModel(String phoneModel) {
		PhoneModel = phoneModel;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		Os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		Ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		Processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		Battery = battery;
		return this;
	}
	
	//	this methods will get all the Phone Object Over here
	public Phone getPhone(){
		return new Phone(PhoneModel, Os, Ram, Processor, Battery);	
	}
	
}


public class Oops7_6_sglt_bldr_fm_pattern {

	public static void main(String[] args) {
		 
//	Singleton Class & Singleton patter
		//	if your allowing to create only one instance of a class mean singleton
		
	//	Singleton slt=new Singleton();
		Singleton slt;
		slt=Singleton.getInstance();
		
		//	it's not allow to create another instance of a class and new instance
		// 	we are allow to create only one instance
		//	it will not show another instance value
		Singleton slt1=Singleton.getInstance();
//		slt=Singleton.getInstance();
		 
		

//	Builder Method Design Pattern in Java
		//	using Builder pattern we can pass any parameter in anySequence 
		//	and we can pass less parameters also here this will not show error
		//	this will show null in unpassed parameter
		Phone PB=new PhoneBuilder().setBattery(5000).setOs("Android").setProcessor("Snap Dragon").setRam(16).getPhone();
		System.out.println(PB);
		

		
	}

}
