package InstaConcepts;


//	Java, Inheritance is an important pillar of OOP(Object-Oriented Programming)
//	. It is the mechanism in Java by which one class is allowed to inherit the 
//	features(fields and methods) of another class. In Java, Inheritance means 
//	creating new classes based on existing ones. A class that inherits from 
//	another class can reuse the methods and fields of that class. In addition, 
//	you can add new fields and methods to your current class as well.  


//	Inheritance is the most powerful feature of object-oriented programming. 
//	It allows us to inherit the properties of one class into another class. 
//	In this section, we will discuss types of inheritance in Java in-depth with 
//	real-life examples. Also, we will create Java programs to implement the 
//	concept of different types of inheritance.

//Java supports the following four types of inheritance:
//	1	Single Inheritance
//	2	Multi-level Inheritance
//	3	Hierarchical Inheritance
//	4	Hybrid Inheritance



//Single Inheritance

	//In single inheritance, a sub-class is derived from only one super class. 
	//It inherits the properties and behavior of a single-parent class. Sometimes
	//it is also known as simple
class sa{
	
		int salary=88000;	
		void a1methods() {
			System.out.println("Methods From a1 class");
		}
	
}
class sb extends sa{
		int bonus=5000;
	
}


//	Multi-level Inheritance

	//	In multi-level inheritance, a class is derived from a class which is also 
	//	derived from another class is called multi-level inheritance. In simple 
	//	words, we can say that a class that has more than one parent class is 
	//	called multi-level inheritance. Note that the classes must be at different
	//	levels. Hence, there exists a single base class and single derived class 
	//	but multiple intermediate base classes.

class mla{
	String nano=" Mano Talking to Someone";
	
}
class mlb extends mla{
	String poke="Pokesh Talking to mano";
	
}
class mlc extends mlb{
	String mo="they both talking";
	
}
class mld extends mlc{
	String po="they Don't talking";
	
}

//	Hierarchical Inheritance

	//	If a number of classes are derived from a single base class, it is 
	//	called hierarchical

class teacher{
	
	String cmd="Listen All";
}
class Student1 extends teacher{
	String name1="Pokesh";
}
class Student2 extends teacher{
	String name2="Mano";
	
}
class Student3 extends teacher{
	String name3="Mothish";
}
class Student4 extends teacher{
	String name4="Kumar";
	
}


//	Hybrid Inheritance
		//	Hybrid means consist of more than one. Hybrid inheritance is the 
		//	combination of two or more types of inheritance.

class grandfather{
	String Gf="Im your Thathaaaa";
}
class father extends grandfather{
	void show() {
		System.out.println("Im Your Father");
	}
}
class son extends father{

	void show() {
		System.out.println("Im son Of My Father");
		super.show();
		
	}
}
class daughter extends father{
	void show() {
		System.out.println("Im Daughter");
	}
}


public class Oops7_2_inheritance	{
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//	Single Inheritance
		sb bv=new sb();
//		we can access class a1 properties and value by class b by extend classes
//		known as single inheritance
		System.out.println("Form Class a1 "+bv.salary);
		System.out.println("From Class b "+bv.bonus);
		bv.a1methods();

//	Multi-level Inheritance
		// this is multi leve inheritance i'm creating object for last class but it
		// gives me the first class variable to access here
		mld speak=new mld();
		System.out.println("From mla class : "+speak.nano);
		System.out.println("From mld Class : "+speak.po);
		

//	Hierarchical Inheritance
		Student1 s1=new Student1();
		System.out.println(s1.name1);
		System.out.println(s1.cmd);
		
		Student2 s2=new Student2();
		System.out.println(s2.name2);
		System.out.println(s2.cmd);
		
		Student3 s3=new Student3();
		System.out.println(s3.name3);
		System.out.println(s3.cmd);
		
		Student4 s4=new Student4();
		System.out.println(s4.name4);
		System.out.println(s4.cmd);
		//	Every Student can Communicate Single teacher
		

//	Hybrid Inheritance
		son sv=new son();
		sv.show();

		
		

	}

}
