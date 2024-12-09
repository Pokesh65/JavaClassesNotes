package ProblemSolving;

public class practicenew {
	
	public static void insertionSort(int arr[]){
		
	
		for(int m:arr){
			System.out.print(m+" ");
		}
		System.out.println();
		
		for(int i=1;i<arr.length;i++){
			
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=key;
		}
		
		
		for(int a:arr){
			System.out.print(a+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []arr1= {38,40,10,39,38,40,11,33,45};
		
		insertionSort(arr1);
	}

}
