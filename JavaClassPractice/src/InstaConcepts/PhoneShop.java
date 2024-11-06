package InstaConcepts;

public class PhoneShop {

	public static void main(String[] args) {
		
//	Builder Method Design Pattern in Java
		
//		this is Builder we don't have to set lots of value over here
//		all we need is create builder and then we can give parameter value as we want
//		then it will print the parameter value we give and print null what we did not give
//		it will not show any error here
//		And sequence doesn't matter here
		Phone PB=new PhoneBuilder().setBattery(5000).setOs("Android").setRam(16).getPhone();
		System.out.println(PB);
	}

}
