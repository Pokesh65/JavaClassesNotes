package ProblemSolving;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value :");
		String w1 = s.nextLine();
		
		String w2="";
		
		for(int i=w1.length()-1;i>=0;i--) {
			w2+=w1.charAt(i);
		}
		if(w1.equalsIgnoreCase(w2)) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}
