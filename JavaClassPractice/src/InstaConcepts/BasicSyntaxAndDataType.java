package InstaConcepts;

import javax.crypto.Mac;

//4 type of Access Modifiers
//		Public: Can be accessed from Anywhere
//		Private: Can be accessed only inside the class

public class BasicSyntaxAndDataType {

	public static void main(String[] args) {
		
//		Formatted Print
		double ac=3.122344;
		System.out.printf("Hii %.2f",ac);
		System.out.printf("Hello %d",638353);
		System.out.printf("Gokul %s","kaka is couple");
		System.out.println("\n");
		
//		constant Declaration
		System.out.println("\nconstant Declaration...");
		final int MAX_VALUE=100;
		System.out.println(MAX_VALUE); //100
		int c=MAX_VALUE;
		System.out.println(c); //100
		
//		Type casting
		System.out.println("\nType casting...");
//		1.widening  Casting
//		Widening Casting (automatically) - converting a smaller type to a larger type size
//		byte -> short -> char -> int -> long -> float -> double
//		Widening casting is done automatically when passing a smaller size type to a larger size type:
		
			long l=(long)10;
			System.out.println(l);
			int myInt = 9;
		    double myDouble = myInt; // Automatic casting: int to double
		    System.out.println(myInt);      // Outputs 9
		    System.out.println(myDouble);   // Outputs 9.0
		    
//		2.Narrowing Casting
//		Narrowing Casting (manually) - converting a larger type to a smaller size type
//		double -> float -> long -> int -> char -> short -> byte
//		Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
		    double mDouble = 9.78d;
		    int mInt = (int) mDouble; // Manual casting: double to int
		    System.out.println(mDouble);   // Outputs 9.78
		    System.out.println(mInt);      // Outputs 9
		    
		    
//		Auto-Boxing
		    System.out.println("\nAuto-Boxing");
//		    wrapper class for every primitive type we are having a class for it(Integer,Float,Double,Character,Long)
//		    auto boxing is convert primitive data to object and class type 
//		    and it's provide you lots of features
		    int num=10;
		    Integer num1=num; //Auto-Boxing
		    System.out.println("Auto Boxing :"+num1 );
		    
//		UnBoxing
		    System.out.println("\nUnBoxing");
		    Character pk='P';
		    int value=num1.intValue();
		    char value1=pk.charValue();
		    System.out.println(value);
		    System.out.println(value1);
		    
//		Binary Literal
		    System.out.println("\nBinary Literal");
		    int binary=0b101010;
		    System.out.println("Binary :"+binary);
		    
//		Octal literal
		    System.out.println("\nOctal literal");
		    int octal=013;
		    System.out.println("Octal :"+octal);
		
//		hexadecimal literal
		    System.out.println("\nhexadecimal literal");
		    // Digits 10 to 15 are represented by a to f (A to F) in Hexadecimal
		    int hex=0x123 ;
		    System.out.println("Hexa :"+hex);
		    
//		Scientific Notation
		    System.out.println("\nScientific Notation");
		    double sci=1.23231e2;
		    System.out.println("Scientific :"+sci);

	}	

}
