package InstaConcepts;

public class GenericType {
	
	//	Using generic type we can print any type of data in one
	//	parameter by <t> at same time
	public static<T> void ManyData(T a){
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		ManyData("Pokesh");
		ManyData(23);
		ManyData(true);
		ManyData(2.093);

	}

}
