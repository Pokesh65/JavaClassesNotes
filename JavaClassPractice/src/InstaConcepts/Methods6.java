package InstaConcepts;

import java.util.Arrays;

//Abstract Methods
		//	in object oriented programming, abstraction is defined as hiding the unnecessary 
		//	details (implementation) from the user and to focus on essential details (functionality).
		//	It increases the efficiency and thus reduces complexity.
		//	In Java, abstraction can be achieved using abstract classes and methods.
		
//Abstract class
		//  A class is declared abstract using the abstract keyword. It can have zero or more 
		//	abstract and non-abstract methods. We need to extend the abstract class and implement 
		//	its methods. It cannot be instantiated.
		
//Abstract Method
		//	A method declared using the abstract keyword within an abstract class and does not have a 
		//	definition (implementation) is called an abstract method.
		
		//	When we need just the method declaration in a super class, it can be achieved by declaring
		//	the methods as abstracts.
		
		//	Abstract method is also called subclass responsibility as it doesn't have the implementation 
		//	in the super class. Therefore a subclass must override it to provide the method definition.
abstract class AbsOne{
	
		// 	Abstract methods doesn't have body
		//	if we want to pass give body for the method we need to extend the abstract class
		//	to the main class then we need to override the abstract method name in main class 
		//  then we give body for that
	abstract void absmethod(String name,int age);
	
	
}



// Final Methods Can't be Override by subclass 
class Finalclas extends Methods6{
		//this will show Error Here cause final methods can't be override by subclasses
//		public void FinalMethods() {
//			System.out.println("Im From Another Class");
//		}
	 
		
}

//Final Class if a class can be final then we can't inherite that class to any other class
final class a{
	public void aclassmethods() {
		System.out.println("Im From a Class methods");
	}
}


//this show us error because final class can't be inherit
//class b extends a{
//	@Override
//	public void aclassmethods() {
//		// TODO Auto-generated method stub
//		super.aclassmethods();
//	}
//}


public class Methods6 extends AbsOne {
	
//	Method declaration
		//	A method is a block of code which only runs when it is called.
		//	You can pass data, known as parameters, into a method.
		//	Methods are used to perform certain actions, and they are also known as functions.
		//	Why use methods? To reuse code: define the code once, and use it many times.
			
		//	myMethod(): is the name of the method
		
	public int Addition(int a,int b) {
		return a+b;
	}
	
//	Method OverLoading
		//	in Java, Method Overloading allows different methods to have the same name, but different
		//	signatures where the signature can differ by the number of input parameters or type of 
		//	input parameters, or a mixture of both.
	
		//	Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, 
		//	or Early binding. In Method overloading compared to the parent argument, the child argument
		//	will get the highest priority.
		
	public String Addition(int a,int b,int c) {
		int puls=a+b+c;
		Integer val=puls;
		String vals=val.toString();
		return vals;
	}
	
//	Variable Arguments
		//	Variable Arguments (Varargs) in Java is a method that takes a variable number of 
		//	arguments. Variable Arguments in Java simplifies the creation of methods that need 
		//	to take a variable number of arguments.
	
		//	The parameter int ... a is the key part of this method. The ... is the syntax for varargs,
		//	which means that this method can accept zero or more int arguments.
	public int sum(int...num) {
		int asum=Arrays.stream(num).sum();
		 for(int a:num) {
			 System.out.println("Your Variable value is : "+a);
			 
		 }
		System.out.println(asum);
		 return asum;
	}

//	Recursive Methods
	
		//	In Java, Recursion is a process in which a function calls itself directly or 
		//	indirectly is called recursion and the corresponding function is called a recursive
		//	function. Using a recursive algorithm, certain problems can be solved quite easily. 
		//	A few Java recursion examples are Towers of Hanoi (TOH), Inorder/Preorder/Postorder 
		//	Tree Traversals, DFS of Graph, etc.
	
	public int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
//	Methods With Default Value;
		//In Java, default parameters are a powerful feature that allows developers to
		//define default values for method parameters. This can be useful when a method 
		//has a large number of parameters, and some of them are not always required.

//	public void greed(String na="world"){
//		System.out.println(na);
//	}
	
	
// Void Methods
	public void  welcomeH(String name,int age,String city) {
		//	void: means that this method does not have a return value. You will learn more about 
		//	return values later in this chapter
		System.out.println("hello "+name+" your age "+age+" and your Location is "+city);
		
	}
	
	public void  welcomeH(String name,int age) {
		 welcomeH( name, age,"Porur");
	}
	
//	Static Method
		//	Static vs. Public
		//	You will often see Java programs that have either static or public attributes and methods.
		//	In the example above, we created a static method, which means that it can be accessed 
		//	without creating an object of the class, unlike public, which can only be accessed by 
		//	objects:
	
	public static void staticMethods() {
		//	static: means that the method belongs to the Main class and not an object of the Main 
		//	class. You will learn more about objects and how to access methods through objects 
		//	later in this tutorial.
		System.out.println("Hello your Calling Static methods : "+(4+6));
	}
	
//Instance Methods
		//	non static methods is also called as instance methods
		public void Instance() {
			System.out.println("im instance method"
					+ "you can only access me by creating a class");
			
		}

// Abstract Method
		@Override
		void absmethod(String name, int age) {
			System.out.println("welcome "+name+" confirm your age "+age);
			
		}
		
		
// Final Variable
	
		//	The final keyword in Java is used to indicate that something cannot 
		//	be modified. It can be applied to variables, methods, and classes, each 
		//	with a specific purpose.
		
		// can't change the value once it's declared can't modified in final
		// When a variable is declared with the final keyword, its value can’t 
		// be changed, essentially, a constant. This also means that you must 
		// initialize a final variable.
		static final int fvalue=3;
		
// Final Methods
		// Definition: A method declared as final cannot be overridden by subclasses. 
		// This prevents subclasses from modifying its behavior.Usage: Ensures that the 
		// implementation of the method remains unchanged.
		final void FinalMethods() {
			System.out.println("Welcome Final Methods In Methods6 Class :");
		}
		
// Synchronized Methods 
//		the Synchronized method is inly run one thread at a time if it's running a one thread 
//		it will not interfier with another thread here and it also thread safe
		
		
		

	public static void main(String[] args) {
		
//Public Method call Creating Object For Main class
		Methods6 ad=new Methods6();
		int value=ad.Addition(20, 50);
		System.out.println("The Public methods Call value : "+value);
		
//	Method OverLoading
		String svalue=ad.Addition(10, 10, 10);
		System.out.println("String methods : "+svalue);
		
// 	Variable Arguments
//		When calling this method, you can pass n number of integer arguments (including zero).
//		These arguments will be automatically grouped into an array inside the method.
		ad.sum(10,20,30,40,50); 
		System.out.println(ad.sum()); //it will print the return type value

//	Recursive Methods
		int Rm=ad.factorial(5);
		System.out.println("Recursive methods :"+Rm);
	
//  Methods With Default Value;
		ad.welcomeH("Pokesh",23,"tvm");
		ad.welcomeH("Pokesh",20);

//	Static Method
		staticMethods(); //Hello your Calling Static methods : 10
		
//	Instance methods
		Methods6 Ic=new Methods6();
		Ic.Instance(); //in instance method you can only access me by creating a class
		
//	Abstract Method
		Ic.absmethod("Pokesh",23);
		
// Final variable 
		//if we try to change the value it will show the error here because it's final
		//fvalue=10;
		
// Final Methods
		Finalclas Fc=new Finalclas();
		Fc.FinalMethods(); 
		
		
		
	}
}
