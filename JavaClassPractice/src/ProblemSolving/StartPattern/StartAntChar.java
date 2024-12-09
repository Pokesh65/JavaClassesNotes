package ProblemSolving.StartPattern;

import java.util.Scanner;

public class StartAntChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of Row");
		int num=scan.nextInt();
		int z=1;
		
		for(int i=0;i<num;i++){
			
			for(int k=i;k<num;k++){ 
				System.out.print(" ");
			}
			
			for(int j=0;j<z;j++){
				
				System.out.print("*");
			}
			z+=2;
			System.out.println();
			
			
		}
		
		
		System.out.println("\n...Abc Printing...");
		
		String Abc="ABCDEF";
		char ch[]=Abc.toCharArray();
		
//		for(char a:ch){
//			System.out.println(" "+a);
//		}
		
		for(int i=0;i<ch.length;i++){
			
			for(int k=i;k<ch.length;k++){
				System.out.print(" ");
			}
			
			for(int j=0;j<i+1;j++){
				
				System.out.print(ch[j]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
	

	}

	

}
