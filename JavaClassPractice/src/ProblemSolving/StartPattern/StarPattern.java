package ProblemSolving.StartPattern;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Star Count : ");
		int num=scan.nextInt();
	
		System.out.println("\nSquare Start Pattern");
		
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				System.out.print(" 💕 ");
			}System.out.println();
		}
		
		System.out.println("\nStart Pattern");
		for(int i=0;i<num;i++){
			
			for(int j=0;j<=i;j++){
			
				System.out.print("🦧");
				
			}
			System.out.println();
		}
		
		System.out.println("\nStart Pattern");
		for(int i=0;i<num;i++){
			
			for(int j=i;j<num;j++){
				
				System.out.print("👍");
				
			}
			System.out.println();
		}

		System.out.println("\nLeft Side Star Pattern");
		for(int i=0;i<num;i++){
			
			for(int j=i;j<num;j++){
				System.out.print("  ");
			}
			
			for(int j=0;j<=i;j++){
				System.out.print("❤️");
			}
			
			System.out.println();
		}

		
		System.out.println("\nRight Side Star Pattern");
		for(int i=0;i<num;i++){
			
			for(int j=0;j<i;j++){ //increase
				System.out.print("  ");
			}
			for(int j=i;j<num;j++){
				System.out.print("🤡"); //decrease
			}
			
			System.out.println();
		}
		
		System.out.println("\nHill Star Pattern");
		for(int i=0;i<num;i++){
			for(int j=i;j<num;j++){
				System.out.print("  ");
			}
			for(int j=0;j<i;j++){
				System.out.print("🐻‍❄️");
			}
			for(int j=0;j<=i;j++){
				System.out.print("🐻‍❄️");
			}
			
			System.out.println();
		}
		
		System.out.println("\nReverse Hill Star Pattern");
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=i;j<num-1;j++){
				System.out.print("🤖");
			}
			for(int j=i;j<num;j++){
				System.out.print("🤖");
			}
			System.out.println();
		}
		
		System.out.println("\nDiamond Star Pattern");
		for(int i=0;i<num-1;i++){
			
			for(int j=i;j<num;j++){
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("❤️");
			}
			for(int j=0;j<i;j++){
				System.out.print("❤️");
			}
			System.out.println();
		}
		
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=i;j<num-1;j++){
				System.out.print("❤️");
			}
			for(int j=i;j<num;j++){
				System.out.print("❤️");
			}
			System.out.println();
		}
		
		System.out.println("\nButterfly star Pattern");
		for(int i=0;i<num-1;i++){
			
			for(int j=0;j<=i;j++){
			
				System.out.print("🦋");
				
			}
			for(int j=i;j<num-1;j++){
				System.out.print("🍂");
			}
			for(int j=i;j<num-1;j++){
				System.out.print("🍂");
			}

			for(int j=0;j<=i;j++){
			
				System.out.print("🦋");
				
			}
			System.out.println();
		}
//	System.out.println();
		for(int i=0;i<num;i++){
			
			for(int j=i;j<num;j++){
			
				System.out.print("🦋");
			}
			for(int j=0;j<=i-1;j++){
				System.out.print("🍂");
			}
			for(int j=0;j<i;j++){
				System.out.print("🍂");
			}
			for(int j=i;j<num;j++){
				
				System.out.print("🦋");
			}
			
			System.out.println();
		}
	}
	

}
