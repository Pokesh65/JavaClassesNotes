package InstaConcepts;

import InstaConcepts.Outer.Inner;
import InstaConcepts.Outer.Sinner;
import InstaConcepts.nested.nesinner;
import InstaConcepts.nested.nesinner.nesinner2;

//Inner Class
	//	n Java, inner class refers to the class that is declared inside 
	//	class or interface which were mainly introduced, to sum up, same 
	//	logically relatable classes as Java is object-oriented so bringing 
	//	it closer to the real world. 

	//	In Java, it is also possible to nest classes (a class within a class).
	//	The purpose of nested classes is to group classes that belong together, 
	//	which makes your code more readable and maintainable.

	

	//Outer Class
	class Outer{
		private int myg=99999;
		void house() {
			System.out.println("welcome Home");
		}
		
		//Inner Class
		class Inner{
			
			void insideHome() {
				System.out.println("Inside Home is awesome "+myg);
			}
		}
		
		//Inner Static Class
		static class Sinner{
			void Shome() {
				System.out.println("Static innner Class Contents");
			}
		}
		
	}
	
	
//	Nested Class Here
	//	In Java, it is possible to define a class within another class, 
	//	such classes are known as nested classes. They enable you to logically
	//	group classes that are only used in one place, thus this increases 
	//	the use of encapsulation and creates more readable and maintainable
	//	code.

	//	The scope of a nested class is bounded by the scope of its 
	//	enclosing class. Thus in the below example, the class NestedClass 
	//	does not exist independently of the class OuterClass.
	

	//	A nested class is simply a class defined within another class. 
	//	The outer class that contains the nested class, is referred to as 
	//	the enclosing class or outer class. The key feature of a nested class
	//	is that it is entirely independent of its enclosing class. It can access
	//	all members (fields and methods) of the outer class, even if they are private.
	class nested{
		int nesval=500;
		private int nesval1=6969;
		class nesinner{
			 void show() {
				
				//	NestedClass is a nested class within OuterClass. It has access 
				//	to the outerData field of OuterClass directly.
				System.out.println("Nested inner Class "+nesval1);
			}
			class nesinner2{
				public void show2(){
					System.out.println("Nested inner2 Class "+nesval1);
					show();
				}
			}
		}
		
	}
	
	
//	Anonymous Inner Class
	 //  It is an inner class without a name and for which only a single 
	 // object is created. An anonymous inner class can be useful when 
	 // making an instance of an object with certain “extras” such as 
	 // overriding methods of a class or interface, without having to 
	 // actually subclass a class.
	class AnonyInnerClass{
		
		// so if we need to change the method attributes in another class
		// i need to declare new class and then override the method and change the attribute
		// but in anonymous inner class i can change override the methods 
		// without a class name {} then change the attributes
		
		public void FindVal(){
			
			System.out.println("Anonymouns Inner");
		}
		

	}
	
//	Enum
	//	n Java, an enum (short for enumeration) is a type that has a fixed set of constant values. 
	//	We use the enum keyword to declare enums. For example,
	//	Note: The enum constants are usually represented in uppercase.
	
	//  According to the Java naming conventions, we should
	//	have all constants in capital letters. So, we have enum constants in capital letters.
	
	//	enum declaration basicall this is class in java
	//	a fixed set of constants.
	enum Days{
		//	and this is a methods in java
		Sunday,Monday,tuesday,wednesday,tursday,friday,saturday;
	}	
		
	

//	Enum Constructor
	//	n Java, an enum (short for enumeration) is a type that has a fixed set of constant values. 
	//	We use the enum keyword to declare enums. For example,
	//	Note: The enum constants are usually represented in uppercase.
	
	//	In Java, an enum class may include a constructor like a regular class. 
	//	These enum constructors are either

	//	private - accessible within the class
	//	or
	//	package-private - accessible within the package
	
	enum Size{
		SMALL("You Ordered A Small Size Pizza"),
		REGULAR("You Ordered A Regular Size Pizza"),
		MEDIAN("You Ordered A Mediam Size You Have Offer Of 20%"),
		LARGE("You Ordered A Large,You Will Get One Regular Pizza");
		
		private final String Psize;
		
		private Size(String Pizzas){
			this.Psize =Pizzas;
			
		}
		public void GetSize(){
//			String Ps=Psize;
			System.out.println(Psize);
		}
		
		
	}

public class Oops7_5_Nc_Ic_AIc_Em_EmwC {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Outer Class
		Outer oc=new Outer();
		oc.house();
		
		
//Inner Class
		//	Creating Obj For Inner Class Over Here
		//	IF i want to create the object for inner class i need an object for 
		//	outer class to create obj for inner class here
		
		//	To access the inner class, create an object of the outer class, and then create 
		//	an object of the inner class:
		Outer.Inner Ic=oc.new Inner();
		Ic.insideHome();
		
		
// Static Inner Class
		//	creating Static Inner Class object all we need is use . beside outerclass
		//	To Access Inner static Class Methods
		
		Sinner Isc=new Sinner();
		Isc.Shome();
		Outer.Sinner osic=new Outer.Sinner();
		osic.Shome();
	
//	Nested Class Here
		nested nesc=new nested();
		System.out.println(nesc.nesval);
		
		nesinner nesIn=nesc.new nesinner();
		nesIn.show();
		nesinner2 nesIn2=nesIn.new nesinner2();
		nesIn2.show2();
		
//	Anonymous Inner Class
		AnonyInnerClass aic=new AnonyInnerClass()
		//	without Declaring a name this is called anonymous inner Class
		{
			@Override
			public void FindVal() {
				// TODO Auto-generated method stub
				super.FindVal();
				System.out.println("AnonymousInnerClass From AnonymousClass");
			}
		};
		aic.FindVal();
		
		
//	Enum
//		enum object creation we don't need to use new while creating object
		Days Df=Days.friday;
		Days Ds=Days.saturday;
		System.out.println(Ds);
		System.out.println(Df);
		System.out.println(Df.ordinal()); //it will show the index value of the object inside the enum class
		//	to get all value in enum use value,values will give array value
		Days []DA=Days.values();
		for(Days d:DA) {
			System.out.println(d+" "+d.ordinal());
		}
		
//	Enum Constructor
		Size PizzaSize=Size.LARGE;
		PizzaSize.GetSize();

		//System.out.println(PizzaSize.GetSize());
		//you can use this methods to print value when you give return type string
		///inside the GetSize Method
		

		
	}

}
