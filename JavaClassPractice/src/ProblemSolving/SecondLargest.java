package ProblemSolving;

import java.util.Arrays;

public class SecondLargest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Arr1[]={2,3,4,5,10,37,18,36,40,17,37,40,59};
		Arrays.sort(Arr1);
	
		
		for(int i:Arr1){
			System.out.print(i+" ");
		}
		System.out.println();
		
//		int SL=Arr1.length-2;
		System.out.println(Arr1[Arr1.length-2]);
		

		System.out.println("Fibonacci Started...");
		
		int n=10;
		int n1=0, n2=1, nextTerm;
		for(int i=0;i<n;i++) {
			System.out.println(n1);
			nextTerm=n1+n2;
			n1=n2;
			n2=nextTerm;
		}
		

	}

}
