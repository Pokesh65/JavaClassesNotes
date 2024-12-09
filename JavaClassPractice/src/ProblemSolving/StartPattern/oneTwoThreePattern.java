package ProblemSolving.StartPattern;

import java.util.Iterator;

public class oneTwoThreePattern {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			int k = i + 1;
			for (int j = i; j < 6; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < k; j++) {

				i = j;
				System.out.print(i + " ");

			}

			System.out.println();

		}System.out.println();

		
		
		System.out.println("next Start pattern");
		int z=1;
		for(int i=0;i<5;i++){
			
			for(int k=0;k<i;k++){
				System.out.print("");
			}
			
			for(int j=0;j<z;j++){
				
				System.out.print("🫦");
				
			}
			if(i>1){
				z+=2;
			}else {
				z+=1;
			}
			System.out.println();
		}
		
		
		System.out.println("\nnext Start pattern");
	}

}
