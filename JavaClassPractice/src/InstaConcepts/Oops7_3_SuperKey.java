package InstaConcepts;

//	1. Use of super with Variables
		//	This scenario occurs when a derived class and base class have the same 
		//	data members. In that case, there is a possibility of ambiguity r the JVM. 
		//	
		//	We can understand it more clearly using the following example:
		//super keyword in java example 

		//Base class vehicle 
		class Vehicle {
			int maxSpeed = 120;
		}
		
		//sub class Car extending vehicle 
		class Car1 extends Vehicle {
			int maxSpeed = 180;
		
			void display() {
				// print maxSpeed of base class (vehicle)
				System.out.println("Maximum Speed: " + super.maxSpeed +" "+maxSpeed);
			}
		}


//	2. Use of super with Methods
		//	This is used when we want to call the parent class method. So whenever a
		//	parent and child class have the same-named methods then to resolve ambiguity
		//	we use the super keyword.

		//superclass Person 
		class Person { 
		 void message() 
		 { 
		     System.out.println("This is person class\n"); 
		 } 
		} 
		//Subclass Student 
		class Student extends Person { 
		 void message() 
		 { 
		     System.out.println("This is student class"); 
		 } 
		 // Note that display() is 
		 // only in Student class 
		 void display1() 
		 { 
		     // will invoke or call current 
		     // class message() method 
		     message(); 
		
		     // will invoke or call parent 
		     // class message() method 
		     super.message(); 
		 } 
		} 
		
		
//	3. Use of super with constructors
	//	The super keyword can also be used to access the parent class constructor.
	//	One more important thing is that ‘super’ can call both parametric as well 
	//	as non-parametric constructors depending on the situation. 
		
		
		// superclass Person 
		class Person1 { 
		    Person1() 
		    { 
		        System.out.println("Person class Constructor"); 
		    } 
		} 
		  
		// subclass Student extending the Person class 
		class Student12 extends Person1 { 
		    Student12() 
		    { 
		    	super(); 
		        // invoke or call parent class constructor 
		        System.out.println("Student class Constructor"); 
		        
		    } 
		} 
		

public class Oops7_3_SuperKey {

	public static void main(String[] args) {
		
		
//	1. Use of super with Variables
		Car1 small = new Car1(); 
        small.display(); 
        
//  2. Use of super with Methods
    	
    		Student st = new Student(); 
    		// calling display() of Student
    		st.display1();
    		
//  3. Use of super with constructors
    		
    		 Student12 sc = new Student12(); 
    		
    		
    		
	}
	

	
    

}
