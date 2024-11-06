package ProblemSolving;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Star Count : ");
		int num=scan.nextInt();
	
		int i=0;
		while(i<num){
			
			for(int j=0;j<num/3;j++){
				i++;
				System.out.print("*");
				
			}
			System.out.println();
		}

		

	}

}
