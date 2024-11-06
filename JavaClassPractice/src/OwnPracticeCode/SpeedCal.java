package OwnPracticeCode;

import java.util.Scanner;

public class SpeedCal {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter The Time    :");
		double t = scan.nextDouble();
		System.out.println("Please Enter The Distance :");
		double d = scan.nextDouble();
		System.out.println("Please Enter the Speed    :");
		double s = scan.nextInt();

		double time = d % s;
		System.out.println("The Calculated Time is : " + time);

		double distance = s * t;
		System.out.println("The Calculated Distance is :" + distance);

		double speed = d / t;
		System.out.println("The Calculation Speed Is  :" + speed);

	}

}
