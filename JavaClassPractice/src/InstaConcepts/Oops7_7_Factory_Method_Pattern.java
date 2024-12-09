package InstaConcepts;

import InstaConcepts.FactoryProduct.Android;
import InstaConcepts.FactoryProduct.FactroyProduct;
import InstaConcepts.FactoryProduct.Ios;
import InstaConcepts.FactoryProduct.Os;
import InstaConcepts.FactoryProduct.Windows;

//FACTORY METHOD PATTERN

	//	It is a creational design pattern that talks about the creation of 
	//	an object. The factory design pattern says to define an interface 
	//	( A java interface or an abstract class) for creating the object and 
	//	let the subclasses decide which class to instantiate.

	//	Factory Method Design Pattern define an interface for creating an 
	//	object, but let subclass decide which class to instantiate. Factory
	//	Method lets a class defer instantiation to subclass.

public class Oops7_7_Factory_Method_Pattern {

	public static void main(String[] args) {
		
		// we are creating object for factory methods and Os and its subclass
		// here we are using the Factory Pattern which is already define
		// like we use products which is manufactured by certain factory we use methods here
		
		//	Normal Methods of calling factory object
//		Os os=new Android();
//		Os os=new Windows();
//		Os os=new ;
//		os.spec();
		
		//	Factory Methods Of Calling Factory Object
		//	we give obj for FactroyProduct methods and then 
		//	we create obj for Os with fp obj of FactroyProduct
		//	then we use Os obj of to get methods from Os interface
		//	
		FactroyProduct fp=new FactroyProduct();
		Os os=fp.getInstance("some"); //whatever the string value we give 
		//	here based on the string value we will get the Objs of factoryProduct methods
		os.spec();
		

	}

}
