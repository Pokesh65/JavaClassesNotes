package OwnPracticeCode;

import java.util.Scanner;

public class Swap {
//	seappin two variable without using temporary variable/
	static int a;
	static int b;
	
	static void Swapping(int v1,int v2){
		a=v1;
		b=v2;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The A value Is:"+a +"\nThe B value Is:"+b);
	}
	
	public static void Swappin1(int v1,int v2){
		 a=v1;
		 b=v2;
		 a=a^b;
		 b=a^b;
		 a=a^b;
		 System.out.println("Using Xor \nThe A value Is:"+a +"\nThe B value Is:"+b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter A Value Here: ");
	int a=scan.nextInt();
	System.out.println("Enter B Value Here: ");
	int b=scan.nextInt();
	Swapping(a, b);
	Swappin1(a,b);

	}

}
