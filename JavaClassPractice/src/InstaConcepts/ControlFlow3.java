package InstaConcepts;

import java.util.Scanner;

public class ControlFlow3 {
	
	public int Comparenum(int nu1,int nu2) {
		int num1=nu1;
		int num2=nu2;
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if Statement
//		if-else Statement
//		if-else if-else Statement
//		nested if 
		
//		Switch Statement
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Day :");
		int Day=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Your Name :");
		String name=scan.nextLine();
		switch(Day) {
		case 1:{
			System.out.println("Hello "+name+" This Is Sunday");
			break;
		}
		case 2:{
			System.out.println("Hello "+name+"  This Is Monday");
			break;
		}
		case 3:{
			System.out.println("Hello "+name+"  This Is Tuesday");
			break;
		}
		case 4:{
			System.out.println("Hello "+name+"  This Is Wednessday");
			break;
		}
		case 5:{
			System.out.println("Hello "+name+"  This Is Thursday");
			break;
		}
		case 6:{
			System.out.println("Hello "+name+"  This Is Friday");
			break;
		}
		case 7:{
			System.out.println("Hello "+name+"  This Is Saturday");
			break;
		}
		default:{
			System.out.println("Hey "+name+" Your Enter The Wrong Number");
		}
		
	    }  
		
//		Enhanced For Loop
		System.out.println("\nEnhanced For Loop...");
//		The syntax of Java for-each loop consists of data_type with the
//		variable followed by a colon (:), then array or collection.
		
//		The Java for-each loop traverses the array or collection until the last 
//		element. For each element, it stores the element in the variable and executes 
//		the body of the for-each loop.
		int list[]= {40,30,50,70,90,60};
		for(int i:list) {
			System.out.println(i+5);
		}
		
//		While Loop
		System.out.println("\nWhile Loop...");
		int wh=1;
		while(wh<10) {
			System.out.println("Hello"+wh);
			wh++;
		}
		
//		Infinitive While Loop
//		If you pass true in the while loop, it will be infinitive while loop.
//		int w=1;
//		while(1==w) {
//			System.out.println("");
//		}
		
		
//		Do-While Loop
		System.out.println("\nDo-While Loop...");
//		The example below uses a do/while loop. 
//		The loop will always be executed at least once, even if the condition is false,
//		because the code block is executed before the condition is tested:
		
//		The do/while loop is a variant of the while loop. This loop will execute the code block once,
//		before checking if the condition is true, then it will repeat the loop as long as the condition is true.
		
		int D=1;
		do {
			System.out.println("Hello Reethuuu :"+D);
			D++;
		}while(D<0); 
		
		
//		Continue 
//		if i want to Skip Certain Specifically one Conditon i need to use Continue
//		if the condition is satisfied then the value is Skip the next block of code
		System.out.println("\n...Comtinue...");
		for(int i=1;i<=10;i++){
			if(i%2==0) {
				continue;
			}
			System.out.println("The Value Is :"+i);

		}
		
		
//		Break Statement
//		it will break the Entire For loop  and go out if the conditon is satisfied
		System.out.println("\n...Break Statement...");	
		for(int i=1;i<=10;i++){
			if(i>6) {
				break;
			}
			System.out.println("The Value Break Is :"+i);

		}
		
//		Outer Loop Labled Continue
		System.out.println("\n...Outer Loop Labled Continue...");
		for(int i=0;i<5;i++) {
			System.out.println("the I value:"+i);
			for(int j=0;j<5;j++) {
				if(j==3) {
					
					continue;
					
				}System.out.println("the J :"+j);
			}
		}
		
//		Outer Loop Labled Break
		System.out.println("\n...Outer Loop Labled Break...");
		for(int i=0;i<5;i++) {
			System.out.println("I Break:"+i);
			for(int j=0;j<5;j++) {
				if(j==3) {
					
					break;
					
				}System.out.println("J Break:"+j);
			}
		}
		
		
//	Return Statement
//		In Java programming, the return statement is used 
//		for returning a value when the execution of the block is completed. 
//		The return statement inside a loop will cause the loop to break and 
//		further statements will be ignored by the compiler.
		ControlFlow3 cf=new ControlFlow3();
		int retu=cf.Comparenum(40,80);
		System.out.println("These return Type "+retu);
		
		
//		yield() Method
//		Suppose there are three threads t1, t2, and t3. Thread t1 gets the 
//		processor and starts its execution and thread t2 and t3 are in Ready/Runnable 
//		state. The completion time for thread t1 is 5 hours and the completion time for 
//		t2 is 5 minutes. Since t1 will complete its execution after 5 hours, t2 has to wait 
//		for 5 hours to just finish 5 minutes job. In such scenarios where one thread is taking
//		too much time to complete its execution, we need a way to prevent the execution of a 
//		in between if something important is pending. yield() helps us in doing so. 
	}

}
