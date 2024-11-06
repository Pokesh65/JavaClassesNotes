package InstaConcepts;


//	
class Human{
	
	// private mean no one can outside the world can use is
	private int age=23;
	private String name="Pokesh";
	
	
	// Somewhere encapsulating data with the methods 
	// and that is encapsulation
	public int getAge(){
		return age; 
	}
	
	public void  setAge(int age){
		//this is keyword which is represents the current object
		  this.age=age;
	}
	
	public String getName(){
		return name;
	}
	
	public void  setName(String name){
		  this.name=name;
	}
	
}

public class Oops7_8Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human obj=new Human();
		obj.setAge(20);
		obj.setName("Kalaiyarasi");
		System.out.println(obj.getAge()+" : "+obj.getName());
		  

	}

}
