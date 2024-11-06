package InstaConcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Collection9_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li=new ArrayList<String>();
	
	// Add elements 
		li.add("pokesh");
		li.add("Lokesh");
		li.add("Rakesh");
		li.add("Mothis");
		li.add("ganesh");
		li.add("Gokul");
		li.add("Sujith");
		System.out.println(li); //[pokesh, Lokesh, Rakesh, Mothis, ganesh, Gokul, Sujith]
		
	// Add elements by index
		li.add(1,"Malliga");
		System.out.println(li); //[pokesh, Malliga, Lokesh, Rakesh, Mothis, ganesh, Gokul, Sujith]
		
	// Remove element
		li.remove("Lokesh");
		System.out.println(li); //[pokesh, Malliga, Rakesh, Mothis, ganesh, Gokul, Sujith]
		
	// Remove element by index
		li.remove(4);
		System.out.println(li); //[pokesh, Malliga, Rakesh, Mothis, Gokul, Sujith]
		
	// Get element
		System.out.println(li.get(1)); //Malliga
		
	// Set element
		li.set(1,"Deepi");
		System.out.println(li); //[pokesh, Deepi, Rakesh, Mothis, Gokul, Sujith]
		
	// Check if contains
		System.out.println(li.contains("Rakesh")); //true
		
	// Size of collection
		System.out.println(li.size()); //6
		
	// Check if empty
		System.out.println(li.isEmpty()); //false
		
	// Iterator over collection
		System.out.println("\n....Collection values....");
		for(String v:li){
			System.out.println(v);  //pokesh
									//Deepi
									//Rakesh
									//Mothis
									//Gokul
									//Sujith
		}
		
	// Iterator
		//	Iterators are used in Collection framework in Java to retrieve 
		//	elements one by one. It can be applied to any Collection object.
		//	By using Iterator, we can perform both read and remove operations.
		//	Iterator must be used whenever we want to enumerate elements in 
		//	all Collection framework implemented interfaces like Set, List, Queue,
		//	Deque and also in all implemented classes of Map interface. Iterator 
		//	is the only cursor available for entire collection framework
		System.out.println("\nIterator");
		//iterator will print the value in sorted order
		Iterator<String> ili=li.iterator();
		while(ili.hasNext()){
		
			System.out.println(ili.next()); //pokesh
											//Deepi
											//Rakesh
											//Mothis
											//Gokul
											//Sujith
		} 
		
	// ListIterator
		//	ListIterator It is only applicable for List collection implemented 
		//	classes like arraylist, linkedlist etc. It provides bi-directional 
		//	iteration. ListIterator must be used when we want to enumerate 
		//	elements of List
		System.out.println("\nListIterator");
		ListIterator<String> Litor=li.listIterator();
		while(Litor.hasNext()){
			System.out.println(Litor.next()); 	//pokesh
												//Deepi
												//Rakesh
												//Mothis
												//Gokul
												//Sujith
		}
	
	// Sort List
		System.out.println("\nSort List");
		// declaration of sort 
		Collections.sort(li); //[Deepi, Gokul, Mothis, Rakesh, Sujith, pokesh]
		System.out.println(li);
		
	// Reverse List
		System.out.println("\nReverse List");
		Collections.reverse(li); //[pokesh, Sujith, Rakesh, Mothis, Gokul, Deepi]
		System.out.println(li);
	
	// Shuffle List
		System.out.println("\nShuffle List");
		Collections.shuffle(li); //[Mothis, Rakesh, Deepi, Gokul, Sujith, pokesh]
		System.out.println(li);

	// Binary Search
		// Searching an int key in a list sorted in descending order. 
		// it will show the index value of list value we give
		System.out.println("\nBinary Search");
		int bval=Collections.binarySearch(li,"Rakesh");
		System.out.println(bval); //4
		System.out.println(Collections.binarySearch(li,"Rakesh"));
		
		System.out.println("\n...LinkedList...");
		List<Integer> ll=new LinkedList<Integer>();
		ll.add(98);
		ll.add(20);
		ll.add(3);
		ll.add(4);
		ll.add(20);
		ll.add(20);
		ll.add(25);
		ll.add(1);
		ll.add(60);
		System.out.println(ll); //[98, 20, 3, 4, 20, 20, 25, 1, 60]
		
	// Find Min Element
		System.out.println("\nMinimum");
		int min= Collections.min(ll);
		System.out.println(min); //1
		
	// Find Max Element
		System.out.println("\nMaximum");
		int max= Collections.max(ll);
		System.out.println(max); //98
			
	// Frequency of element
		// it will tell the counts how many times it represent in list 
		System.out.println("\nFrequency");
		int freq= Collections.frequency(ll,20);
		System.out.println(freq); //3
		
	// Fill list with Element
		System.out.println("\nFill");
		Collections.fill(ll,69);
		System.out.println(ll); //[69, 69, 69, 69, 69, 69, 69, 69, 69]
		
	// Disjoint Collections
		System.out.println("\nDisjoint Collection...");
		//	java.util.Collections.disjoint() method is present in java.util.
		//	Collections class. It is used to check whether two specified 
		//	collections are disjoint or not. More formally, two collections 
		//	are disjoint if they have no elements in common.
		
		//	Note that it is permissible to pass the same collection in both 
		//	parameters, in which case the method will return true if and only 
		//	if the collection is empty.
		
		boolean isDisjoin= Collections.disjoint(li, ll);
		System.out.println(isDisjoin); //true
		
		List<Integer> ll1=new LinkedList<Integer>();
		ll1.add(98);
		ll1.add(20);
		ll1.add(3);
		ll1.add(4);
		ll1.add(20);
		ll1.add(20);
		ll1.add(25);
		ll1.add(1);
		ll1.add(60);
		Collections.fill(ll1,69);
		boolean isDisjoin1= Collections.disjoint(ll,ll1);
		System.out.println(isDisjoin1); //false
		
	// Unmodifiable list
		System.out.println("\nUnmodifiable List");
		List<String> unmlist= Collections.unmodifiableList(li);
		System.out.println(li);
		unmlist.add("senthil");  //java.util.Collections$UnmodifiableCollection
		System.out.println(unmlist);
	}

}
