package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//	Printing All Zeros At the End Of the Array Here

public class MoveAllZeroToEnd {
	
	public static void pushzerotoEnd(int[]arr,int n){
		int temArr[]=new int[n];
		
		int v=0;
		
		for(int i=0;i<n;i++){
			if(arr[i]>0){
				temArr[v++]=arr[i];
			}
		}
		
		if(v==n||v==0){
			return;
		}
		
		for(int i=0;i<n;i++){
			if(arr[i]==0){
				temArr[v++]=arr[i];
			}
		}
		
		for(int i=0;i<temArr.length;i++){
			System.out.print(temArr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrZ[]={0,20,3,4,0,4,60,3,30,0,29,34,45,0,5,0,21,0};
		
		pushzerotoEnd(arrZ,arrZ.length);
		System.out.println("\n\nMove All Zero At The End Of The Array Using List\n");
		List<Integer> Allvalue=new ArrayList<Integer>();
		List<Integer> AllZero=new ArrayList<Integer>();
		
		for(Integer n:arrZ){
			if(n>0){
				Allvalue.add(n);
			}else{
				AllZero.add(n);
			}
		}
		Allvalue.addAll(AllZero);
		System.out.println(Allvalue);
		
		
		System.out.println("\nPrinting All Values Is Here");
		for(int g:Allvalue){
			System.out.print(g+" ");
		}
	}

}
