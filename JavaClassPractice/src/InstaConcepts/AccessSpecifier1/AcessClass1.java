package InstaConcepts.AccessSpecifier1;

import InstaConceptsAccessSpecifier2.Pokesh;


//if i want to access protected from another package in need to extends
//that class in  this main class
public class AcessClass1 extends Pokesh{
	
	
//	public can be access by anywhere 
	public int Fess=10000;
	
//	private can be only access inside the class or we can access them by pushing inside the 
//	method then we call methods to access the private variable
	private int salary=50000;
	
//	Protected:
//		• Accesible within the same packages.
//		⚫ it is accessible from other package
//		only through a subclass
	
	public String methodString() {
		System.out.println(salary);
		return null;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 AcessClass1 sv=new AcessClass1();
//		public method can be access by from another file 
		System.out.println(sv.Fess);
//      private variable access
		System.out.println(sv.methodString());
		
//		public method can be access by from another file 
		Teacher ts=new Teacher();
		System.out.println(ts.Tsalary);
		
//      private variable access
		ts.displaySalary();
		
//
		Pokesh Ps=new Pokesh();
		System.out.println(Ps.PokeshSalary);
		
//		Default can be access when it's in the same package otherwise can't access
		System.out.println(ts.malliSalar);
		
// 		Protected 
//		Accesible within the same packages.
////		⚫ it is accessible from other package
////		only through a subclass
		System.out.println("Protected mark From teacher "+ts.mark);
		
//		if i want to access protected from another package in need to extends
//		that class in  this main class
		AcessClass1 Ps1=new AcessClass1();
		System.out.println("Protected Method from Another Package : "+Ps1.ProSalary);
		
		
		
		
		
		
		

	}

}
