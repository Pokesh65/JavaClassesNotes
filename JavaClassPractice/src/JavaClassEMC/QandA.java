package JavaClassEMC;

import java.util.Scanner;

public class QandA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		String name=scan.nextLine();
//		int age=scan.nextInt();
//		scan.nextLine();
//		String Address=scan.nextLine();
//		
//		System.out.println("my name is :"+name);
//		System.out.println("my age is :"+age);
//		System.out.println("my Address is :"+Address);
		
//		System.out.println("Enter the A value :");
//		int a=scan.nextInt();
//		System.out.println("Enter the B value :");
//		int b=scan.nextInt();
//		System.out.println("Enter the C value :");
//		int c=scan.nextInt();
//		
//		int d=a*b*c;
//		int e=a+b+c;
//		System.out.println("The Output is :"+d/e);
		
		System.out.println("Enter Sudent Name :");
		String Sname=scan.nextLine();
		System.out.println("Enter Score Name :");
		double score=scan.nextDouble();
		scan.nextLine();
		System.out.println("Enter Sudent Department :");
		String Sdepart=scan.nextLine();
		
		double cv=score/10;
		System.out.println("The Sudent Name is :"+Sname);
		System.out.println("The Score  is :"+cv+"/10");
		System.out.println("The Sudent Name is :"+Sdepart);

		

	}

}
