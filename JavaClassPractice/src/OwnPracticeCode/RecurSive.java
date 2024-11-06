package OwnPracticeCode;

public class RecurSive {
	static int n=10;

	static String Recurname(String str, int index) {

		if (index == str.length()) {
			return "Recursive is Done:";
		}

		char CharactSplit = str.charAt(index);

		if (CharactSplit != ' ') {
			
			System.out.print('0');
			
		} else if (CharactSplit == ' ') {
			
			System.out.print(" ");
		}
		return Recurname(str, index + 1);

	}
//		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Pokesh kumar";
		Recurname(name, 0);
	System.out.println();

		int n=5;
		RecurSive Rs=new RecurSive();
		
		System.out.println(Rs.n);
		
	}

}
