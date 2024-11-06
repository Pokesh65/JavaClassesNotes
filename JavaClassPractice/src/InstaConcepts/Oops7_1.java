package InstaConcepts;


	//	Java is an object-oriented programming language.
	//
	//	Everything in Java is associated with classes and objects, along with its 
	//	attributes and methods. For example: in real life, a car is an object. The
	//	car has attributes, such as weight and color, and methods, such as drive
	//	and brake.
	//
	//	A Class is like an object constructor, or a "blueprint" for creating 
	//	objects.


// Class Creation
class Car{
	  static long f=220330022223333l;
	  int Price=40000;
	  String valu="50";
	  int value=Integer.parseInt(valu); //parseInt convert String to Integer
	  
	  
	
}
 
// Java Constructors Class
 
	// 	Java constructors or constructors in Java is a terminology used to 
	// 	construct something in our programs. A constructor in Java is a special 
	// 	method that is used to initialize objects. The constructor is called 
	// when an object of a class is created. It can be used to set initial values 
	// 	for object attributes.
 
 
class ForConst{
	
//	a Constructor method name must have a same name as a class name 
	
	public ForConst() {
		// TODO Auto-generated constructor stub
		System.out.println("from Constructor Class ");
	}

//	Parameterized Constructor
	
	public ForConst(String name) {
		 
		// TODO Auto-generated constructor stub
		System.out.println("Parameterized Constructor from Constructor Class "+name);
	}
		 
}

public class Oops7_1 {
// Instance variable 
			//	The instance variable is declared inside the class but not inside the methods
		 int instvari=1000;
		 	// it can't to be reinitialize the variable in instance variable
		// instvari=50;
		 	// but we can reinitialize inside the methods
		 public void methods(){
			 instvari=500;
			 System.out.println("Instance variable "+instvari);
		 }

//	Class Variable Static
		 private static int cvs=10000;
		 
//	Final Class variable 
		 private final String Svalue="Malliii";
		 // final value can't be changed or modified once it;s created 
		
	public void FinalMethod() {
		 // final value can't be changed or modified once it;s created 
//		 Svalue="Pokesh";
		
	}
	
// Getter Setter Methods
	
	private int getset=555;
	
	// Getter
	// get method used to call certain variable or methods
	public int getGetset() {
		return getset;
	}

	// Setter
	// set methods used to set value for certain variables or methods
	public void setGetset(int gset) {
		//this is used for calling variables or methods within the class 
		this.getset = gset;
	}
	
	
//	Instance Methods
		// the instance emthod is non static methods in java
	public void insmthod() {
		System.out.println("Instance Methods In java");
	}
	
// Class method (Static)
		// Class method is Static methods
	public static void classmethod() {
		System.out.println("Class Methods In Java Static");
	}
	
// method With parameter 
	
	public void MethodWP(String n,String m) {
		
		System.out.println("Method In Param "+n+" "+m);
	}
	
// method Overloading 
		// methods with different parameter and different Arguments data types
	public void MethodWP(int a,int b) {
		int c =a+b;
		System.out.println("Methods with Different Data Types "+c);
		
	}

// method Overloading with Different Parameters
	public void MethodWP(String m) {
		
		System.out.println("Hello Im "+m);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
//	Class Declaration
		Car cv=new Car();
		System.out.println(cv.Price);
		System.out.println(cv.value);
		
// Constructor 
		// A Constructor can be called when declaring Object and class reference
		ForConst Fc=new ForConst();
		
//	Parameterized Constructor
//		we need pass argument while creating class reference in Parameterized Constructor
		ForConst Pc=new ForConst("Pokesh");
		
// instance variable 
		Oops7_1 in=new Oops7_1();
		in.methods();
		
//	Class Variable (Static)
		System.out.println("Class variable "+cvs);
		
//	Final Class variable
		Oops7_1 op=new Oops7_1();
		System.out.println("Final Variable "+op.Svalue);

// Getter Methods
		//calling getter methods here 
		System.out.println(op.getGetset());
		
// Setter methods assigining new value  
		op.setGetset(5555555);
		System.out.println("Calling get method after set "+op.getGetset());
		
//	Instance methods declaration 
//		calling instance method we need to use object 
		Oops7_1 o1=new Oops7_1();
		o1.insmthod();
		
// Class method (Static)
		classmethod();
		
// method With parameter 
		o1.MethodWP("Pokesh","Kalai");
		
// method Overloading with different Arguments type
		o1.MethodWP(10,50);
		
// method Overloading with Different Parameters
		o1.MethodWP("Malli Pokes");
		
		

	}

}
