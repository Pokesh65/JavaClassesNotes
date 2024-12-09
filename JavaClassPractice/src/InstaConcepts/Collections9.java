package InstaConcepts;

import java.util.ArrayDeque;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections9 {
	
//	Collection 
	//	in collection we have 3 type of classes
	//	1.List
	//	2.set
	//	3.Queues
	
//	Collection Api
	//	in collection api we have map 
	


	public static void main(String[] args) {

		
		
//	LIST
		System.out.println("...LIST STARTS...");
//	ArrayList in Java?
			//	ArrayList is a Java class implemented using the List interface.
			//	Java ArrayList, as the name suggests, provides the functionality
			//	of a dynamic array where the size is not fixed as an array. Also, 
			//	as a part of the Collections framework, it has many features not 
			//	available with arrays.
		
			// resize it's size automatically by values
		
		//	we need to specified the collection type inside the angular brackets
		
//		Collection<Integer> nums=new ArrayList<Integer>();
		//	list have a index value where collection is not
		//	so we need to use list whenever we are creating a ArrayList 
		
		List<Integer> nums=new ArrayList<Integer>();
		//	the value we added here is not an datatypes link number and string,it's an
		//	object type
		//	by default the collection api work with the objects not the primitive types
		nums.add(212);
		nums.add(10);
		nums.add(50);
		nums.add(10);
		nums.add(120);
		
		//	print nums value by index
		System.out.println(nums.get(2)); //50
		//	print entire ArrayList value
		System.out.println("Array List : "+nums); //[212, 10, 50, 60, 120]
		
		System.out.println("index value of 10 is : "+nums.indexOf(10)); //index value of 10 is : 1

		for(int n:nums){
			System.out.println(n);  //212
									//	10
									//	50
									//	60
									//	120
		}
		
//		LinkedList
		System.out.println("\n...LinkedList...");
			//	linkedlist and arraylist both are use for same operation but
			//	the linked list is faster than the array list to add value
			//	and slower than the arraylist to fetch value
			// array operated by index number linked list is operated by nodes
			//	we can use all methods whatever we use in arraylist in linkedlist
		List<String> linkName=new LinkedList<String>();
		linkName.add("Pokesh");
		linkName.add("Loves");
		linkName.add("Malliga");
		linkName.add("kalai"); 
		linkName.add("Love Pokesh");
		linkName.add(3,"Loved");
		System.out.println("Linked List Values  : "+ linkName.get(2)); //Linked List Values  : Malliga
		System.out.println("LinkedList : "+linkName);
		//LinkedList : [Pokesh, Loves, Malliga, Loved, kalai, Love Pokesh]
		
	
//	SET
		System.out.println("\n...SET STARTS...");
	//	set supports unique value
	//	and set is not going for sequence 
	//	set doesn't support index value 
	//	set basically collection of unique values that collection contains no duplicates elements
		
//		HashSet
		System.out.println("\n HashSet...");
		//	and set is not going for sequence 
		//	set doesn't support index value
		//	hashset only support the unique value
		Set<Integer> snums=new HashSet<Integer>();
		snums.add(212);
		snums.add(10);
		snums.add(50);
		snums.add(60);
		snums.add(120);
		snums.add(60);
		snums.add(120);
		
		System.out.println(snums); //[50, 212, 120, 10, 60]
		System.out.println(snums.hashCode());
		
		
//		LinkedHasSet
		System.out.println("\n LinkedHashSet...");
		//	duplicates are not allowed
		//	linkedhasSet maintain linked list secretly
		//	linkedHashSet is sequence value in set collection
		//	whatever methods are available in the hashset the same methods are 
		//	available in linkedhashset
		Set<Integer> LHasSet=new LinkedHashSet<Integer>();
		LHasSet.add(1);
		LHasSet.add(11);
		LHasSet.add(10);
		LHasSet.add(13);
		LHasSet.add(123);
		LHasSet.add(13);
		LHasSet.add(134);
		LHasSet.add(12);
		LHasSet.add(11);
		LHasSet.add(1);
		System.out.println(LHasSet);	//[1, 11, 10, 13, 123, 134, 12]
		LHasSet.remove(12);
		System.out.println(LHasSet); 	//[1, 11, 10, 13, 123, 134]
		
		
//		TreeSet
		System.out.println("\n TreeSet...");
		// all the values in treeset is sorted values because it extends sotredset
		Set<Integer> tnums=new TreeSet<Integer>();
		tnums.add(212);
		tnums.add(10);
		tnums.add(50);
		tnums.add(60);
		tnums.add(120);
		tnums.add(120);
		tnums.add(120);
		tnums.add(30);
		tnums.add(221);
		tnums.add(1000);
		tnums.add(1);
		System.out.println(tnums);	//[10, 30, 50, 60, 120, 212, 221, 1000]
		
		
//		Iterator
		//instead of using for loop i use iterator here
		System.out.println("\n Iterator...");
		Iterator<Integer> value=tnums.iterator();//from this iterator we get all values in value variable
		System.out.println(value); //java.util.TreeMap$KeyIterator@2812cbfa
		
		//System.out.println(value.next()+" "+value.next()+" "+value.next());
		//.next which will give you the next elements but it give only one element at time
		
		
		System.out.println("All Values Print in for Loop");
//		for(int i=1;i<=9;i++){
//			System.out.println(value.next()); 	//10
//												//30
//												//50
//												//60
//												//120
//												//212
//												//221
//												//1000
//		}
		 
		
		System.out.println("All Values Print In While Loop");
		while(value.hasNext()) { //Returns true if the iteration has more elements
			System.out.println(value.next());	//10
												//30
												//50
												//60
												//120
												//212
												//221
												//1000

		}
		
//	Collection Api
//	MAP
		System.out.println("\n\n...MAP...\n");
		//	Map Interface is present in java.util package represents a mapping between 
		//	a key and a value. Java Map interface is not a subtype of the Collection 
		//	interface. Therefore it behaves a bit differently from the rest of the
		//	collection types. A map contains unique keys.
		
		// map doesn't extends the collection interface but it's a part of collection 
		// concept relational api

		// instead of having index value can we have name to it
		// map is a collection of key and value pair
		
	// HashMap
		System.out.println("HashMap...");
		Map<String, Integer> marks=new HashMap<String, Integer>();
		//add value in map 

		marks.put("Pokesh",10);
		marks.put("Kalai",100);
		marks.put("Dinesh",50);
		marks.put("Kalai",80);
		marks.put("deepi",50);
		marks.put("Pokesh",100);
	
		// this is not even sequence
		System.out.println(marks );//{Kalai=100, Dinesh=50, Pokesh=100, deepi=50, kalai=80}
		System.out.println(marks.get("deepi"));
		marks.put("deepi", 100); 
		System.out.println(marks.get("deepi")); //100
		System.out.println(marks.getOrDefault("Pokes",0));
		
		
		// printing map in for loop
		System.out.println("All Key : "+marks.keySet()); //All Key : [Kalai, Dinesh, Pokesh, deepi]
		
		
		System.out.println("\n HashMap All values ");
		for(String k:marks.keySet() ) {
			
			System.out.println(k+" : "+marks.get(k)); 	//Kalai : 80
														//Dinesh : 50
														//Pokesh : 100
														//deepi : 100	
		}
		
		
	// HashTable 
		Map<String, Integer> markT=new Hashtable<String, Integer>();
		// the HashTable is exactly Same as hashMap but it's Synchronized
		
		
		
	// TreeMap
		// The TreeMap in Java is a concrete implementation of the 
		// java.util.SortedMap interface. It provides an ordered 
		// collection of key-value pairs, where the keys are ordered 
		// based on their natural order or a custom Comparator passed 
		// to the constructor.
		
		// it sorted the whole object that we create using key pair
		// it sorted using key values
		System.out.println("\n TreeMap...");
		Map<String, Integer> Treemark=new TreeMap<String, Integer>();
		// add value in map 
		// no duplicate value are allowed
		Treemark.put("p",100);
		Treemark.put("k",100);
		Treemark.put("b",50);
		Treemark.put("b",80);
		Treemark.put("d",50);
		Treemark.put("a",100);
		Treemark.put("c",30);
		
		System.out.println(Treemark); //{a=100, b=80, c=30, d=50, k=100, p=100}
		Treemark.remove("b");
		System.out.println(Treemark); //{a=100, c=30, d=50, k=100, p=100}
		
		
	// LinkedHashMap
		
		//	Java LinkedHashMap Class with Examples
		//	The LinkedHashMap class of the Java collections
		//	framework provides the hash table and linked list
		//	implementation of the Map interface.
		//	
		//	It extends the HashMap class to store its entries in
		//	a hash table. It internally maintains a doubly-linked
		//	list among all of its entries to order its entries.
		//	
		//	LinkedHashMap preserves the order of elements added.
		//	But it takes more memory due to double linked list
		System.out.println("\nLinkedHashMap...");
		Map<String, Integer> lhm=new LinkedHashMap<String, Integer>();
		//	this is ordered sequence list
		//	only support unique key only
		lhm.put("one",1);
		lhm.put("ten",10);
		lhm.put("two",2);
		lhm.put("five",5);
		lhm.put("eight",8);
		lhm.put("seven",7);
		lhm.put("eleven",11);
		lhm.put("eleven",11);
		lhm.put("eleven",11);
		lhm.put("four",4);
		lhm.put("seven",7);
		lhm.put("seven",7);
		System.out.println(lhm); //{one=1, ten=10, two=2, five=5, eight=8, seven=7, eleven=11, four=4}
		lhm.replace("seven", 77);
		System.out.println(lhm); //{one=1, ten=10, two=2, five=5, eight=8, seven=77, eleven=11, four=4}
		
		
		
//QUEUE
		System.out.println("\n...QUEUE...");
		//	A queue is another kind of linear data structure that is used to 
		//	store elements just like any other data structure but in a particular
		//	manner. In simple words, we can say that the queue is a type of 
		//	data structure in the Java programming language that stores 
		//	elements of the same kind. The components in a queue are stored
		//	in a FIFO (First In, First Out) behavior. There are two ends in 
		//	the queue collection, i.e., front & rear. Queue has two ends that 
		//	is front and rear.
		
		//	the queue is first in first out
		
		//	Think of a queue as people standing in line in a supermarket.
		//
		//	The first person to stand in line is also the first who can pay and leave the supermarket. This way of organizing elements is called FIFO: First In First Out.
		//
		//	Basic operations we can do on a queue are:
		//
		//	Enqueue: Adds a new element to the queue.
		//	Dequeue: Removes and returns the first (front) element from the queue.
		//	Peek: Returns the first element in the queue.
		//	isEmpty: Checks if the queue is empty.
		//	Size: Finds the number of elements in the queue.
		System.out.println("Queue...");
		Queue<Integer> Qval=new LinkedList<Integer>();
		
		Qval.add(3);
		Qval.offer(10); //offer same as add methods
		Qval.add(3);
		Qval.offer(10);
		Qval.add(3);
		Qval.offer(10);
		Qval.add(200);
		System.out.println(Qval); //[3, 10, 3, 10, 3, 10]
		System.out.println(Qval.size());
		
	// elements()
		//	which return the head of the queue return exception if empty
		System.out.println("Head of the Queue element: "+Qval.element()); //Head of the Queue : 3
		
	// peek() 
		//	peek() return the head of the queue return null if empty
		System.out.println("Head of the Queue Peek: "+Qval.peek()); //Head of the Queue Peek: 3
		
	// remove()
		//	return and remove head of the queue
		Qval.remove();
		System.out.println(Qval); //[10, 3, 10, 3, 10]
		//	which return and remove the head of the queue return exception if empty
	
	// poll()
		//	which return and remove the head of the queue return null if empty
		Qval.poll();
		System.out.println(Qval); //[3, 10, 3, 10]
	
		
//	PriorityQueue
		System.out.println("\nPriorityQueue...");
		//	PriorityQueue worked based on min-heap methods
		
		//	A PriorityQueue is used when the objects are supposed to be processed 
		//	based on the priority. It is known that a Queue follows the First-In-
		//	First-Out algorithm, but sometimes the elements of the queue are needed 
		//	to be processed according to the priority, that’s when the PriorityQueue
		//	comes into play.

		//	The PriorityQueue is based on the priority heap. The elements of the 
		//	priority queue are ordered according to the natural ordering, or by a 
		//	Comparator provided at queue construction time, depending on which 
		//	constructor is used. 
		
		//	Suppose, we want to retrieve elements in the
		//	ascending order. In this case, the head of the
		//	priority queue will be the smallest element. Once
		//	this element is retrieved, the next smallest element
		//	will be the head of the queue.
	
		//	NOTE: The elements of a priority queue may not be
		//	sorted. However, elements are always retrieved in
		//	sorted order.
		
		// the smallest value will be the first head of priorityQueue
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(100);
		pq.add(20);
		pq.add(200);
		pq.add(40);
		pq.add(70);
		pq.add(8);
		pq.add(6);
		pq.add(2);
		System.out.println(pq); //[2, 6, 8, 20, 40, 200, 70, 100]
		pq.add(150);
		System.out.println(pq); //[2, 6, 8, 20, 40, 200, 70, 100, 150]
		System.out.println("Head Of the PQ : "+pq.peek()); //Head Of the PQ : 2
		pq.remove(); //2
		System.out.println(pq);	//[6, 20, 8, 100, 40, 200, 70, 150]
		
		//	iterator will print the value in sorted order
		System.out.println("\nIterator...");
		Iterator<Integer> tpq=pq.iterator();
		while(tpq.hasNext()) {
			System.out.print(pq.poll()+" "); //6 8 20 40 70 100 150 200 
			
		}
		
		
//	Dequeue
		System.out.println();
		System.out.println("\nDequeue...");
		//	the dequeue will support first in first out and last in first out
		//	we can insert and remove elements from the front and rear 
		Deque<Integer> dq=new ArrayDeque<Integer>();
		dq.add(5);
		dq.add(4);
		dq.add(3);
		dq.addFirst(1);
		dq.addLast(10);
		dq.offerFirst(50);
		dq.offer(99);
		System.out.println("Dequeue Value : "+dq); //[50, 1, 5, 4, 3, 10, 99]
		dq.pollFirst();//50
		System.out.println("Poll first : "+dq); //[1, 5, 4, 3, 10, 99]
		dq.pollLast();//99
		System.out.println("Poll last : "+dq); //[1, 5, 4, 3, 10]

	
		
//		Stack
			System.out.println("\n...Stack...");
			// the stack is last in first out in stack (lifo)
			// stack = LIFO data structure. Last-In First-Out 
			// stores objects into a sort of "vertical tower, stack of book"
			
			// uses of stacks?|
			// 1. undo/redo features in text editors
			// 2. moving back/forward through browser history
			// 3. backtracking algorithms (maze, file directories)
			// 4. calling functions (call stack)
			
			// push() to add to the top
			// pop() to remove from the top
			// peek() to the top of the stack
			// empty() to check if our stack is empty
			// search() our stack for an item
			
			
	   		
			Stack<String> tack=new Stack<String>();
			Stack<Integer> one=new Stack<Integer>();
			System.out.println( tack.empty());
			tack.push("laptop");
			tack.push("book");
			tack.push("note");
			tack.push("wallet");
			tack.push("money");
			tack.push("card");
			System.out.println(tack); //[laptop, book, note, wallet, money, card]
			
			// pop will get the top value of stack 
			System.out.println(tack.pop());//card
			System.out.println(tack.pop()); //money
			System.out.println(tack); //[laptop, book, note, wallet]
			
			//	if i wanted to see the top most value i need to use peek()
			System.out.println("Top Value Of Stack : "+tack.peek()); //  wallet
			
			System.out.println("Check : "+ tack.empty());// false
			
			// Search will show the value of stack position value
			System.out.println("Stack Position : "+tack.search("note")); // 2
			
			

	}

}
