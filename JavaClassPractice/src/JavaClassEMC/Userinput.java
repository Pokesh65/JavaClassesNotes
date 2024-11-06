package JavaClassEMC;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Pok=new Scanner(System.in);
		
		System.out.println("Hello World");
		
		System.out.println("Enter The First Value : ");
		int a =Pok.nextInt();
		System.out.println("Enter The Second Value : ");
		int b=Pok.nextInt();
		int c=a+b;
		System.out.println("Here Is The Result :"+c);
		
		Scanner Mal=new Scanner(System.in);
		System.out.println("Enter Your name : ");
		String P=Mal.nextLine();
		
		System.out.println("Enter Her name : ");
		String M=Mal.nextLine();
		
		System.out.println("Congrates You both Added Your name In a Single name :"+P+"❤️😘💕🫦"+M);

	}

}
