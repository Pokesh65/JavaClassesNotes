package InstaConcepts;


//When we declare a synchronized keyword in the header of a method, it is 
//called synchronized method in Java. Using the synchronized keyword, we can 
//synchronize all the methods of any class.

//When a method is declared as synchronized, JVM creates a monitor (lock). 
//To enter the monitor, the synchronized method is called. The thread that 
//calls the synchronized method first, acquires object lock.

//If the object lock is not available, the calling thread is blocked, and it 
//has to wait until the lock becomes available. As long as thread holds lock 
//(monitor), no other thread can enter the synchronized method and will have 
//to wait for the current thread to release the lock on the same object. Look 
//at the below figure to understand better.

//in Synchronized method if one thread is running then another thread must wait 
//until that the current thread is complete their work in code block

class counter {

	int count;

  synchronized	void Increase() {
	  
//	  if we are not using synchronized then the multiple thread can be access the 
//	  same methods at same time 

		count++; //count=count+1
	}
}

public class Methods6_Synchronized {

	public static void main(String[] args) throws Exception {

		counter c = new counter();
		

		Thread T1 = new Thread(new Runnable() {

			public void run() {

				for (int i = 1; i <= 1000; i++) {

					c.Increase();
				}

			}
		});

		Thread T2 = new Thread(new Runnable() {

			public void run() {

				for (int i = 1; i <= 1000; i++) {

					c.Increase();
				}

			}
		});

		T1.start();
		T2.start();
		T1.join();
		T2.join();
		
		
		System.out.println("count : " + c.count);

	}

}
