package OwnPracticeCode;

public class InnerConstructor {
	
	InnerConstructor(){
		this(10);
		System.out.println("Empty Constructor 1 ");
	}
	
	InnerConstructor(int a){
		System.out.println("Parameter Constructor 2 "+a);
	}

	public static void main(String[] args) {
//		constructor it will call when it's object created
		InnerConstructor cs=new InnerConstructor();
		
		

	}

}
