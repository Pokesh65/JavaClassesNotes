package InstaConcepts;

class Vehicle1{
	
  public void go(){
	  System.out.println("Run Anywhere");
  }
	
}

class bike extends Vehicle1{
	public void go(){
		System.out.println("In bike We are two pepople go");
	}	
}

class bens extends Vehicle1{
	public void go(){
		System.out.println("In car We are 5 pepople go");
	}	
	
}

class bus extends Vehicle1{
	public void go(){
		System.out.println("In bus We are 40 pepople go");
	}	
	
}

class train extends Vehicle1{
	public void go(){
		System.out.println("In Train We are 200+ pepople go");
	}	
	
}

public class Oops7_Polymirphism {
	
	// Polymorphism 
		
		// herarical inheritance is Polymorphism
		// concept override is used in it
		// left side is parent class, right side is given child
		// class for what result want to print
	
		// override mean same methods in different class
	
	// polymorphism greek word for poly-"many", morph-"form"
	// The ability of an object to identify as more than one type
	
	// the polymorphism object can be more than one type 
	// vehicle can be more that one type it can be many vehicle 
	// each vehicle have a different purpose

	public static void main(String[] args) {
		
		Vehicle1 vb=new bike();
		Vehicle1 vc=new bens();
		Vehicle1 vbus=new bus();
		Vehicle1 vt=new train();
		
		// left side is parent class, right side is given child
		vb.go();
		vc.go();
		vbus.go();
		vt.go();
		
		
		System.out.println("\n\nVehicle in an Object methods\n");
		bike bike=new bike();
		bens car=new bens();
		bus bus=new bus();
		train train=new train();
		Vehicle1[] travel= {bike,car,bus,train};
		
		bike.go();
		car.go();
		bus.go();
		train.go();
		
		System.out.println("\n\nPrint All in Enhance for Loop\n");
		
		for(Vehicle1 vandi:travel){
			vandi.go();
		}

	}

}
