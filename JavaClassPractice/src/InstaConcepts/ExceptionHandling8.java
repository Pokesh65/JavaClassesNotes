package InstaConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

//	Throws 	
class multiple {
	// In Java, the throws keyword is used in a method's
	// signature to declare that the method can throw
	// one or more checked exceptions. It indicates to the
	// caller that they need to handle or further propagate
	// these exceptions.
	void div() throws Exception {
		int a = 18 / 0;
	}
}

//	Custom Exception
// we create a manual exception in java for our purpose of code execution
class AgeNotVAlidException extends Exception {

	public AgeNotVAlidException(String s) {
		// to show the exception message we need to pass the string to
		// super class of AgeNotVAlidException
		super(s);
	}

}

//	Rethrowing Exceptions 

class Test {
	void show() {
		try {
			String str = "Hello";
			char ch = str.charAt(5);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Please Enter Correct Range " + e);
			// this will go to the main methods exeption
			throw e;// rethrow exception
			// this rethrow Exception will throw this exception to main methods
			// exeption handlings catch block
		}
	}
}

//	GetCause

class chained {
	static void divide1(int a, int b) {
		if (b == 0) {
			ArithmeticException ae = new ArithmeticException("Exception Cant't Div zero");
			// this initCause methods will be get by getCasue methods
			// this methods will be pass the message to getCause
			ae.initCause(new IOException("Initial Cause, our input b is "+b+" zero"));
			throw ae;
		} else {
			System.out.println("The Divided value is ;"+a / b);
		}
	}

}


public class ExceptionHandling8 {

	static String index1;

	public static void main(String[] args) throws IOException, Exception {

//	Java Exceptions
		// When executing Java code, different errors can occur: coding errors
		// made by the programmer, errors due to wrong input, or other
		// unforeseeable things.
		//
		// When an error occurs, Java will normally stop and generate an error
		// message. The technical term for this is: Java will throw an
		// exception (throw an error).

//	Java try and catch
		System.out.println("Java try and catch...");
		// The try statement allows you to define a block of code to be tested
		// for errors while it is being executed.

		// The catch statement allows you to define a block of code to be executed,
		// if an error occurs in the try block.

		String name[] = { "Pokesh", "Dinesh", "Kumar", "Rakesh","Ganesh" };

		try {
			// try methods will run the code once if any error occurs it will
			// go to the catch methods and print the errors
			index1 = name[8];
			System.out.println(index1);
		} catch (Exception e) {
			// the catch method will print the error the error will get by using Exception
			// we get exception value by e variables
			System.out.println("try Catch Exception " + index1 + " Is Not In Array " + e);

		}

//	Multiple Catch Blocks
		System.out.println("\nMultiple Catch Blocks...");
		// the multiple try catch exception
		// Based on the exception type we need to give Exception in each Catch block
		//
		int i = 2;
		int j = 0;
		String nick = null;
		int avalue[] = { 1, 4, 2, 5, 6 };
		try {
			j = 18 / i;
//			System.out.println(nick.length());
			System.out.println(avalue[9]);

		} catch (ArithmeticException e) {
			System.out.println("Can't Divide By " + i + " : " + e);
			
		} catch (NullPointerException np) {
			System.out.println("String Doesn't have Values :" + np);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Length is shorter here : "+e);
			
		}
		// this exception is a parent class of all exception
		// Exception can handle all the Error Which is java throws errors
		catch (Exception e) {

			System.out.println(e);

		}

//	try catch finally
		System.out.println("\ntry catch finally...");
		// the finally will always print even if the try block run or catch block run
		int div = 0;
		try {
			div = 18 / 2;
			System.out.println("The Divided value Will be : "+div);
			
		} catch (Exception e) {
			System.out.println(e);
			
		} finally {
			
			if(div==0){
				System.out.println("The Finally Div Value :"+div);
			}else {
				System.out.println("The div Value is: "+div);
			}
			
		}

//	try with resource
		System.out.println("\ntry with resource");
		// In Java, the Try-with-resources statement is a try statement that
		// declares one or more resources in it. A resource is an object that
		// must be closed once your program is done using it. For example, a
		// File resource or a Socket connection resource. The try-with-resources
		// statement ensures that each resource is closed at the end of the statement
		// execution. If we don’t close the resources, it may constitute a resource
		// leak and also the program could exhaust the resources available to it.

		// You can pass any object as a resource that implements
		// java.lang.AutoCloseable,
		// which includes all objects which implement java.io.Closeable.

		// By this, now we don’t need to add an extra finally block for just
		// passing the closing statements of the resources. The resources will
		// be closed as soon as the try-catch block is executed.
		
		// we don't need to use catch and finally after try in try with resources
		// it will closed automatically 
		
		int num=0;
//		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)) ) {
//		//	once the try get over this resource will closed automatically
//			System.out.println("Enter The Number Over Here :");
//			num=Integer.parseInt(br.readLine());
//			System.out.println("The Number You Entered : "+num);
//			
//			
//		}

//	Throw Exception
		System.out.println("\nThrow Exception...");
		// In Java, Exception Handling is one of the effective means to handle
		// runtime errors so that the regular flow of the application can be
		// preserved. Java Exception Handling is a mechanism to handle runtime
		// errors such as ClassNotFoundException, IOException, SQLException,
		// RemoteException, etc.

		// Java throw
		// The throw keyword in Java is used to explicitly throw an exception
		// from a method or any block of code. We can throw either checked or
		// unchecked exception. The throw keyword is mainly used to throw
		// custom exceptions.

		// with the throw key word we can throw manual error in java

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter Your Age : ");

			int age = scan.nextInt();
			if (age < 10) {
				// throw used to throw the manual exception over here
				// and we need to specified what type of error to be thrown
				throw new RuntimeException("Age Should Be Greater Than 10 :");
			}
		
			System.out.println("Your Age Is :"+age);
		} catch (Exception e) {
			
			System.out.println("Throw Exception : " + e);
		}

//	Throws 
		System.out.println("\n....Throws...");
		// In Java, the throws keyword is used in a method's
		// signature to declare that the method can throw
		// one or more checked exceptions. It indicates to the
		// caller that they need to handle or further propagate
		// these exceptions.

		// Used to indicate what exception type may be thrown by a method
		multiple m = new multiple();
		try {
			m.div();
		} catch (Exception e) {
			System.out.println("Can't Divided By zeroooo :"+e);

		}
		

//	Custom Exception
		System.out.println("\nCustom Exception...");
		try {
			int ceAge = 20;
			if (ceAge < 30) {
				// To throw manual message here you need to create constructor
				// in AgeNotValidException and pass string to it's superclass
				throw new AgeNotVAlidException("Age Need to be above  of 30 but you given age is :"+ceAge);
			}
		} catch (AgeNotVAlidException e) {

			System.out.println(e);
			System.out.println(e.getMessage());
		}

//	Get Exception Message
		System.out.println("\nGet Exception Message...");
		// The getMessage() method is also defined in the Throwable class that belongs
		// to java.lang package. The method prints only the message of an exception.
		// It neither prints the name of the exception nor the description. It is widely
		// used to print the exception message.
		try {
			int get = 20;
			if (get < 30) {

				throw new AgeNotVAlidException("The Age You We Must be Above Of 30");
			}
		} catch (Exception e) {
			// the getmessage will get the error message of the exception
			// whatever the message in exception the getMessage will get it for
			// us

			System.out.println(e.getMessage());
		}

//	Print Stack Trace
		System.out.println("\nPrint Stack Trace...");
		// The printStackTrace() method prints the stack trace to the specified
		// stream. If no stream is specified, it prints to the standard error
		// stream (System.err). This stack trace includes information about the
		// throwable, such as its class name, detail message, and the stack trace
		// elements representing the sequence of method calls.

		try {
			int get = 20;
			if (get < 30) {

				throw new AgeNotVAlidException("The Age You Entered Must be Above Of 30");
			}
		} catch (Exception e) {
			// this will give us the exception message and class and it's methods
			// line number where exception occurs everything will print in printStackTrace
			e.printStackTrace();

// toString
			// print Exception information(name and description)
			System.out.println(e.toString());
		}

//	Catch Multiple Exceptions
		System.out.println("\nCatch Multiple Exceptions...");
		// syntax catch (Exception1 | Exception2 | Exception3 e){
		// System.out.println(e);
		// }

//	Rethrowing Exceptions 
		System.out.println("\nRethrowing Exceptions...");
		// Sometimes we may need to rethrow an exception in Java. If a catch
		// block cannot handle the particular exception it has caught, we
		// can rethrow the exception. The rethrow expression causes the
		// originally thrown object to be rethrown.

		// Because the exception has already been caught at the scope in
		// which the rethrow expression occurs, it is rethrown out to the
		// next enclosing try block. Therefore, it cannot be handled by
		// catch blocks at the scope in which the rethrow expression occurred.
		// Any catch blocks for the enclosing try block have an opportunity
		// to catch the exception.

		Test t = new Test();
		try {
			t.show();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("I caught rethrows exception : " + e);

		}

//	GetCause Of Exception
		System.out.println("\nGetCause Of Exception...");
		chained cd = new chained();
		try {
			cd.divide1(5, 0);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			// get cause methods will print the real cause what we print inside the
			// initCause in above the code
			System.out.println(ae.getCause());
		}

//	Assert Statement Assert Condition
		System.out.println("\nAssert Statement Assert Condition");
		String[] weekends = {"Friday", "Saturday", "Sunday"};
		// if assertion is true it will execute the code next code black
		// if assertion is fall then it will show error that we give in expression
	    assert weekends.length==4: "There are only 2 weekends in a week";
	    System.out.println("There are " + weekends.length + " weekends in a week");

	}

}
