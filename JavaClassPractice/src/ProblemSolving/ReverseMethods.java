package ProblemSolving;

public class ReverseMethods {
	
	 void  ReverseString(String Palli){
		 
		 String Value=Palli;
		 String Result="";
		 char Letter;
		 
		 for(int i=0;i<Value.length();i++){
			 
			 Letter=Value.charAt(i);
			 
			 Result=Letter+Result;
		 }
		 
		 if(Result.equalsIgnoreCase(Value)){
			 System.out.println(Palli+" IS Palindrom See ("+Result+")");
		 }else {
			 System.out.println(Palli+" Is Not Palindrom see ("+Result+")");
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseMethods newOne=new ReverseMethods();
		
		newOne.ReverseString("Porur");
		
	}
	
	
	

}
