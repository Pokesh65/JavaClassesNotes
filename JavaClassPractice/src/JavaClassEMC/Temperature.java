package JavaClassEMC;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Celcius value : ");
		Float c=scan.nextFloat();
		Float F=((c*9)/5)+32;
		System.out.println("The temprature is: "+F);
		

	}

}
