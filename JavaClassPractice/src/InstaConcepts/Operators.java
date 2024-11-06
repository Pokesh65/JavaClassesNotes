package InstaConcepts;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		 int add1 = 5, add2 = 5;
		 int les1 = 5, les2 = 5;
		 
//postfix 
		   // 5 is displayed
		   // Then, var1 is increased to 6.
		   System.out.println("Print postfix Add :"+ add1++);
		   System.out.println(add1);
		   System.out.println("Print Postfix les :"+ les1--);
		   System.out.println(les1);
	
//Prefix  
		   // var2 is increased to 6 
		   // Then, it is displayed.
		   System.out.println("Print prefix Add :"+ ++add2);
		   System.out.println("Print prefix les :"+ --les2);
		   System.out.println(les2);
		   
		   a+=b;
		   System.out.println(a);  //30
		   a-=b;
		   System.out.println(a); //10
		   a*=b;
		   System.out.println(a); //200
		   a=b;
		   System.out.println(a); //0
		   
//logic not
		  boolean c=true;
		  boolean res=!c;
		  System.out.println(res); ///false
		  
//bitwise and operators
		  System.out.println("\nbitwise and operators...");
		  int d=15; //01111
		  int e=25; //11001
//	 and operator   //01001 =9
//	 or operator    //11111 =31 
		  int resAnd=d&e;
		  System.out.println("AND :"+resAnd);

//bitwise or operators
		  int resOr=d|e;
		  System.out.println("OR  :"+resOr); //	 or operator    //11111 =31 
		  		  
//Bitwise XOR Operator 
		  System.out.println("\nBitwise XOR Operator...");
//		  if both value is true it will return false or else it return true
		   int x=15; //01111
		   int o=25; //11001
		   int Xr=x^o; //10110  22
		   System.out.println(true^true); //false
		   System.out.println("XOR :"+Xr);//XOR :22
		   
//Bitwise Complement
		   System.out.println("\nBitwise Complement");
//		   When bitwise operator is applied on bits then, all the 1’s become 
//		   0’s and vice versa. The operator for the bitwise complement is ~ (Tilde).
		   int B=25; //11001
		   int Bc=~B;//00110
		   System.out.println("Complement :"+Bc); //Complement :-26
		   
//Left Shift
		   System.out.println("\nLeft Shift...");
//			  whenever i use left shift operator it will append the number of two 0s
			  int ls=8; //1000
			  int lsa=ls<<4; //10000000 i will print binary value
			  System.out.println("left Shift :"+lsa);
			  
//Right Shift
			  System.out.println("\nRight Shift");
//			  whenever i use right shift operator it will remove the right side digits of count we give
			  int Rsa=ls>>2; //100 i will print binary value
			  System.out.println("Right Shift :"+Rsa);
		   
// Unsinged Right Shift Operator 
		   System.out.println("\nUnsinged Right Shift Operator...");
//		   he unsigned right-shift operator is a special type of right-shift operator 
//		   that doesn't use the sign bit for filling the trailing position. 
//		   The unsigned right-shift operator always fills the trialing position by 0.
		   int u=25; //11001
		   int usr=u>>>2; //00110
		   System.out.println(usr); //3
		   
//ternary Operator in java
		   
		   int X, y;  
		   X = 20;  
		   y = (X == 1) ? 61: 90;  
		   System.out.println("Value of y is: " +  y); //Value of y is: 90
		   y = (X == 20) ? 61: 90;  
		   System.out.println("Value of y is: " + y); //Value of y is: 61

	}


	
		

}
