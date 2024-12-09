package InstaConcepts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Arrays4 {

	public static void main(String[] args) {

//		An array is a type of Data Structure that can store collections of elements. 
//		These elements are stored in contiguous memory locations and the it provides 
//		efficient access to each element based on the index of the array element.

//		What is an Array?
//		Arrays are commonly used for storing data and manipulating data in programming 
//		languages because they offer fast access to the elements based on their indices 
//		and provide efficient memory usage.

//one dimensional array 
		System.out.println("\n...one dimensional array...");
		int[] Aone = { 2, 3, 5, 6, 3, 7, 8, 7, 9 };
		System.out.println(Aone[2]); //5

//		To create an array, you need to allocate memory for it using the new keyword
//		This statement initializes the numbers array to hold 5 integers. T
//		he default value for each element is 0.

		int[] Atwo = new int[5];
		Atwo[0] = 20;
		Atwo[1] = 23;
		Atwo[2] = 17;
		Atwo[3] = 20;
		Atwo[4] = 18;
		int AtwoV = Atwo[0];
		int AtwoV1 = Atwo[1];
		System.out.println(Atwo[4]);
		System.out.println(AtwoV);

//Two Dimensional Array
		System.out.println("\n...Two Dimensional Array...");
//		the first[]represents the row of multi array
//		and the Second[] represents the coloum of multi array
		
		int ATD [][] = new int[3][4];
		
//		now i'm using math.random to assign random value to this array
		for (int i = 0; i < 3; i++) { 
			for (int j = 0; j < 4; j++) {
				ATD[i][j]=(int)(Math.random()*10);
				System.out.println(ATD[i][j]);
			}System.out.println();
		}
//		Printing the Array value 
		System.out.println("\nPrinting the Array value");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				
				System.out.print(ATD[i][j]+ " ");
			}
			
			System.out.println();
		}
		
//Array Printing in Enhanced For Loop
		System.out.println("\nEnhanced For Loop Is Here");
		for(int n[]:ATD) { 
			for(int m:n) {
				
				System.out.print(m+" ");
			}
			System.out.println();
		}
		
//Jagged Array:
		
		System.out.println("\nJagged Array Printing");
//		A jagged array is an array of arrays such that member arrays can be of 
//		different sizes, i.e., we can create a 2-D array but with a variable number 
//		of columns in each row. These types of arrays are also known as Jagged arrays. 
		int JDA [][] = new int[3][]; //if i know the rows but i don't know the coloum in each row is jagged array
		
//		we need to specifiying every coloum individually
		JDA[0]=new int[5];
		JDA[1]=new int[3];
		JDA[2]=new int[1];
		
		
		for(int i=0;i<JDA.length;i++) {
			for(int j=0;j<JDA[i].length;j++) { //we will get each row length using JDA[i].length
				JDA[i][j]=(int)(Math.random()*10);
				System.out.print(JDA[i][j]+" ");
			}
			System.out.println();
			
			
		}
//		we use enhanced for loop instead of using normal for loop
//		the using of enhanced for loop we don't have to mention size anywhere it will automatically take size
		System.out.println("\nJagged Array In Enhance For loop");
		for(int m[]:JDA) {
			for(int n:m){
				System.out.print(n+" ");
			}
			System.out.println();
			
		}
		
//Get Array Length
		int Alen=Aone.length; //9
		System.out.println("Arrays Length Is:"+Alen);

//Access Array Elements
		int gv=Aone[4]; //3
		System.out.println("Array value Access:"+gv);
		
//Updating the array element
		Aone[8]=23;
		System.out.println(Aone[1]+" "+Aone[8]);
		
//Iterate over array 
		System.out.println("One Dimentional Array :");
		for(int i=0;i<Aone.length;i++) {
			System.out.print(Aone[i]+" ");
		}
		
//Enhanced For Loop
		System.out.println("\nEnhanced For Loop is Here :");
		for(int En:Aone) { //It will go through each and every element inside the array
			System.out.print(En+" ");
		}
		System.out.println();

//Copy Array
		System.out.println("Array Copy:");
		int copy[]=Arrays.copyOf(Aone,Aone.length); //we can assign new array length  also
//		Arrays.copyOf(Aone,12); so we can assign the elements for new length also
		for(int i=0;i<copy.length;i++) {
		System.out.print(copy[i]+" ");
		}
		System.out.println();
		
//Copy Range Of Array
		System.out.println("Copy The Range Of The Array :");
		int copyR[]=Arrays.copyOfRange(copy,2,7); //here we give index value form where to where we need to copy elements
		for(int cr:copyR) {
			System.out.print(cr+" ");
		}
		System.out.println();
		
//Fill Array
//		Array fill it will fill array elements with the number we give in fill methods
		
//		java.util.Arrays.fill() method is in java.util.Arrays class. This method assigns the specified data type value to 
//		each element of the specified range of the specified array.
		System.out.println("Array Fill Methods");
		Arrays.fill(copyR,69); //here give the array name and then fill elements 
//		Arrays.fill(copyR,0,3,69); //we can also using fill in certain range also
		for(int cr:copyR) {
			System.out.print(cr+" ");
		}System.out.println();

//Sort Array
//		Sorting will arrange data in specific order using certain criteria
//		sort(array, fromIndex, toIndex) – sorts only the elements from fromIndex to toIndex
		System.out.println("Array Sort Methods Start");
		int[] arrs = { 13, 7, 6, 11,45, 21,2,9,4,12,101, 102 };
		Arrays.sort(arrs);
		for(int as:arrs) {
			System.out.print(as+" ");
		}System.out.println();
		
//Binary Search
		//Using a binary Search for a array that array should be an sorted array 
		//it will return a index value of search array elements
		System.out.println("Binary Search :");
		int [] intArr= { 10, 20, 15, 22, 35 };
		Arrays.sort(intArr);
		int index=Arrays.binarySearch(intArr,20);
		System.out.println(index);
		
		
//Compare Arrays
		System.out.println("Comapre Arrays :");
		int []copyArr=Arrays.copyOf(intArr, intArr.length);
		System.out.println(Arrays.equals(arrs, intArr));
		System.out.println(Arrays.equals(intArr,copyArr));
		
//Convert Array To List 
		System.out.println("Convert Array To List");
		Integer cal[]= {4,5,2,1,4,6,8,9,10};
		List<Integer> lis=Arrays.asList(cal);
//		var lis=Arrays.asList(cal);
		//if i want to add another element 
//		lis.set(1, 22); //we can change existing value using set methods but we can't add value
//		lis.add(30); //it will throw some error here
		
		System.out.println(lis);
		
//Covert array To List that can add new elements
		System.out.println("\nCovert array To List that can add new elements");
		List<Integer> Alis=new ArrayList<Integer>(Arrays.asList(cal));
		Alis.add(69);
		System.out.println(Alis);
	
//Print Array
		System.out.println("Print Array");
		int Pa[]= {2,3,45,6,1,6,78,4,9,10};
		System.out.println(Arrays.toString(Pa));//to print array elements i need to toString convert array to String
		
//Print MultiDimensional Array
//		to print multidimensioal array we need to use Arrays.deepToString()
		System.out.println("Print Multidimensional Array");
		System.out.println(Arrays.deepToString(ATD));
		
		
//Parallel sort
		System.out.println("Parallel Sort Methods");
//		This method also sorts an array of objects or primitives. Similar to sort() 
//		it also has two variants to sort a full array and partial array:
		
//		The parallelSort() is functionally different. Unlike sort(), 
//		which sorts data sequentially using a single thread, it uses a 
//		parallel sort-merge sorting algorithm. It breaks the array into 
//		sub-arrays that are themselves sorted and then merged.
		int psa[]= {3,4,2,1,4,5,7,68,7,45,3,8,98,98,454,2,3,1,656,8,98,76,6};
		Arrays.parallelSort(psa);
		System.out.println(Arrays.toString(psa));
		
//Stream From Array
		System.out.println("Stream From Array");
//		the stream method has a lot of in-build methods 
//		which provides a way to perform functional-style operations 
//		on sequences of elements, such as filtering, mapping, and reducing.
		
		 String[] names = {"Alice", "Bob", "Charlie"};
	        // Convert the array to a Stream
	        Stream<String> nameStream = Arrays.stream(names);
	        // Perform an operation on the stream (e.g., printing each name)
	        nameStream.forEach(System.out::println);
	        
	   

//Find Max value in Array
	    System.out.println("\nFind Max value in Array :");
		int max=Arrays.stream(psa).max().getAsInt();
		System.out.println(max);
		
//Find min value in Array
		System.out.println("Find min value in Array");
		int min=Arrays.stream(psa).min().getAsInt();
		System.out.println(min);
		
//Sum Of Array Elements
		System.out.println("Sum Of Array Elements :");
		int sum=Arrays.stream(psa).sum();
		System.out.println(sum);
		
//Average Of Array Elements
		System.out.println("Average Of Array Elements");
		double avg=Arrays.stream(psa).average().getAsDouble();
		System.out.println(avg);
		
		
		   
		
		
		
	}
	

}
