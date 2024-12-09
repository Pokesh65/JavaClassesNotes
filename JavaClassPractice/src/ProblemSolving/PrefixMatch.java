package ProblemSolving;

public class PrefixMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S[]= {"Flow","Flower","Floor"};
		String Firstword=S[0];
		String Res="";
		
//		System.out.println(Firstword.length());
		
		for (int i = 0; i < Firstword.length(); i++) {
			boolean Valid=true;
			
			for (int j = 1; j < S.length; j++) {
				if(Firstword.charAt(i)!=S[j].charAt(i)){
					Valid=false;
				}
			}
			if(Valid){
				Res+=Firstword.charAt(i);
			}
			
		

			
		}
		System.out.println(Res);

	}

}
