package InstaConceptsAccessSpecifier2;



public class Pokesh {
	
	public int PokeshSalary=10000000;
	
	
//Default can't be acces from one package to another package
//it can only access in same package only
	int malSalary=99999;
	
	
//	Protected:
//		• Accesible within the same packages.
//		⚫ it is accessible from other package
//		only through a subclass
	protected String ProSalary="Pokesh From Protected";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
