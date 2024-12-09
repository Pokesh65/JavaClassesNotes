package InstaConcepts;

//	Method Overriding in Java

		//If subclass (child class) has the same method as declared in the parent 
		//class, it is known as method overriding in Java.
		
		//In other words, If a subclass provides the specific implementation of 
		//the method that has been declared by one of its parent class, it is 
		//known as method overriding.	

		//Multiple class can have same methods name is known as methods overriding
	class dog{
		void sound() {
			System.out.println("barg");
		}
	}
	class cow extends dog{
		
		void sound() {
			System.out.println("mawwwww");
		}
		
	}

//	Abstract class 

	//	In Java, abstract class is declared with the abstract keyword. It may have
	//	both abstract and non-abstract methods(methods with bodies). An abstract 
	//	is a Java modifier applicable for classes and methods in Java but not for 
	//	Variables. In this article, we will learn the use of abstract classes in 
	//	Java.

	abstract class absclass{
	//	We can't give body to the abstract class over here in abstract method
		abstract void animal(String name,int age);
		
		
	}
	
	//but we can instantiate the supclass of the abstract class
	class absclass1 extends absclass{
		
		@Override
		void animal(String name, int age) {
			// TODO Auto-generated method stub
			System.out.println("This Animal Name Is "+name+" and age is "+age);
			
		}
	}


//	Interface 
	// interface is not a class, every methods inside the interface is 
	// public abstract by default
	// interface is also abstract method
	// we can't give body to any method inside the interface 
	// we can't instantiate the interface as well because it's abstract
	interface interClass1{
	//	we can only define the methods over here not a body
	//	and properties
		
//	Default Methods In Interface
		void run();
		void Swim();
		
		//	all the variable inside interface must be static or final
		int age =40;
		static String name="Pokesh";
	}
	
	//	To connect interface to interface we use extends 
	interface interClass2 extends interClass1{
		void walk();

//	Static Methods In InterFace
		//	static in interface we can give body to interface in static methods
		static void sgooo() {	
			System.out.println("Im Gooooinggggg In Interfaace 2");
	}
		
	}
	
	//	To connect interface to class we implements
	// 	when we say implements it becomes compulsory for you define all methods 
	//  inside the interface to this class 
	class interFaceC implements interClass2{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Hey Im Running over Here");
			
		}

		@Override
		public void Swim() {
			// TODO Auto-generated method stub
			System.out.println("Hey Im Swimming In The Pool Here");
			
		}

		@Override
		public void walk() {
			// TODO Auto-generated method stub
			System.out.println("Hello Im Walking Here");
			
		}
		
	}
	
	
	interface interClass3{
		void fly();
	}
	
//	Multiple Inheritance with InterFace 
	//	we can implements many interface in single class that is call 
	//	multiple inheritance here, and we can access them here
	class AllInterFace implements interClass1,interClass2,interClass3{

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("Fly");
			
		}

		@Override
		public void walk() {
			// TODO Auto-generated method stub
			System.out.println("Walk");
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Run");
		}

		@Override
		public void Swim() {
			// TODO Auto-generated method stub
			System.out.println("Swim");
			
		}
		
	}


	public class Oops7_4 {
		
		public static void main(String[] args) {
			
// Method Overriding in Java
			dog c=new cow();
			dog d=new dog();
			c.sound();
			d.sound();
			
			
//	Abstract class 
	//		we can't instantiate the abstract class but
	//		but we can instantiate the supclass of the abstract class
	//		absclass a1=new absclass()
			
	//		but we can instantiate the supclass of the abstract class
			absclass1 ac=new absclass1() ;
			ac.animal("Lion", 5);
		
			
//	Interface
		//	we can't instantiate the abstract class but
//			interClass1 int1=new interClass1();
		//	but we can create obj for supclass of interface
			interClass1 obj;
		
			interFaceC intc=new interFaceC();
			intc.run();
			intc.Swim();
			intc.walk();
			
			
		//	i can directly use the interface variable since it's static
		//	we can't change the value because iit's final
//			interClass1.age=30;
			System.out.println(interClass1.age);
			System.out.println(interClass1.name);
			
//	Static Methods in interface 
		//	we can give body and access them without creating object for them
			interClass2.sgooo();
			
//	Multiple Inheritance with InterFace 
			AllInterFace Ai=new AllInterFace();
			Ai.fly();
			Ai.run();
			Ai.Swim();
			Ai.walk();
			
			
			
			
		}
	
	}
