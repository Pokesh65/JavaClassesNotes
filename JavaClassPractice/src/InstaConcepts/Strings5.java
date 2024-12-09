package InstaConcepts;

public class Strings5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String Declaration
		String str="Hello Pokesh";
		System.out.println(str);
		String str1="Malli Morning";
		
//String Concatenation
		System.out.println("\nString Concatenation");
		String conStr=str+" "+str1;
		System.out.println(conStr);
		
//String Builders
		System.out.println("\nString Builders");
//		String Buffer is thread safe and String builders is not
//		So whatever methods we use in stringBuffer it's also has in StringBuilders
		StringBuffer Sb=new StringBuffer("Pokesh");
		StringBuilder SB=new StringBuilder("Malligaaa");
		System.out.println(Sb.capacity());
		System.out.println(SB.capacity());
		
//String Builder length
		System.out.println("String Lenght "+SB.length()); //the length has normal String as well

//String Builder Append .append()
//		Append methods will append value after the previous String value
		SB.append(" Pokesh");
		System.out.println("Append : "+SB);
		
//Insert into String builder .insert()
//		insert methods will insert the value with the index value where we wants to insert
		SB.insert(0, "Mrs. ");
		System.out.println("Insert into String : "+SB);
		SB.insert(15,"Weds "); //Mrs. Malligaaa Weds Pokesh
		System.out.println("Insert into String : "+SB); //Insert into String : Mrs. Malligaaa Weds Pokesh
		
//Delete From String Builder .delete()
		SB.delete(0, 4); //to delete we need to use from index value 0 to array length value 4
		System.out.println("Delete in String :"+SB); // Malligaaa Weds Pokesh
		
//Delete CharAt from String Builder .deleteCharAt()
		SB.deleteCharAt(7);
		System.out.println("Delete charAt :"+SB); //it will remove a
		
//Replace in String Builders .replace()
		SB.replace(0,21,"Pokesh Weds Kalai"); //start index to,end index,then String value
		System.out.println("Replace In String :"+SB); //Pokesh Weds Kalai
		
//Reverse The String Builders .reverse()
		SB.reverse(); //It will reverse the entire String
		System.out.println("Reverse :"+SB);
		SB.reverse();
		
//Covert String Builder to String .toString()
//		String result=SB; //it will Show error we can't store StringBuilder into String
		String res1=SB.toString();
		System.out.println("Covert String Builders to String : "+res1);
		
//String Length .length()
		String StrL="HEllo Welcome To String";
		int SLen=StrL.length();
		System.out.println("String Length : "+SLen);
		
//Get Character At Index .charAt()
//		get the character with the indexx value; we need to use charAt(index value)
		char ca=StrL.charAt(6); //w
		System.out.println("Character value : "+ca); //w
		
//SubString()
//		The substring() method returns a substring from the string.
//		If the end argument is not specified then the substring will 
//		end at the end of the string.
		String Sub=StrL.substring(0, 5);//HEllo from index to end length
		String Sub1=StrL.substring(6); //take the value from the index to end of string
		System.out.println("SubString : "+Sub);
		System.out.println("SubString : "+Sub1);
		
//String Comparison .equals()
		String Sc1="Hello";
		String Sc2="Hellooo";
		Boolean Scv=Sc1.equals(Sc2); //if the both String is same it return true or else it return false
		System.out.println("String Comparison : "+Scv);
		
//Case-insensitive Comparison .equalsIgnoreCase()
		String Scc1="Hello";
		String Scc2="hello";
		Boolean Sciv=Scc1.equalsIgnoreCase(Scc2); //true
		System.out.println("Case-insensitive Comparison : "+Sciv);
		
//Compare Strings Lexicographically .compareTo()
//		the method compareTo() is used for comparing two strings lexicographically in Java. Each character 
//		of both the strings is converted into a Unicode value for comparison.
		
//		It returns the following values:
//		if (string1 > string2) it returns a positive value.
//		if both the strings are equal lexicographically i.e.(string1 == string2) it returns 0.
//		if (string1 < string2) it returns a negative value.
		String csl1="HelloOOoo";
		String csl2="Hello";
		int cslv=csl1.compareTo(csl2);
		System.out.println(cslv);
		
//Convert To UpperCase .toUpperCase()
		String Ctu="hello pokesh welcome";
		String Ctou=Ctu.toUpperCase();
		System.out.println("UpperCase : "+Ctou);
		
//Covert To LowerCase .toLowerCase()
		String Lower=Ctu.toLowerCase();
		System.out.println("LowerCase : "+Lower);
		
//Trim whiteSpace .trim()
//		It will trim the white space before and after empty space from string values
		String Triws=" Hello Pokesh Hii ";
		String tw=Triws.trim();
		System.out.println(tw);
		
//Strip Leading and trailling whitespace strip()
		String strst="     Hello Pokesh How are you Pokesh  ";
		String Slt=strst.strip();
		System.out.println(Slt);
		
//Replace Characters .replace()
//		it will replace character with what we give
		String rpc=strst.replace("o","a");
		System.out.println("replace charactor : "+rpc);
		
//Replace SubString here .replace()
		String rpss=strst.replace("Pokesh", "Malliga");
		System.out.println("replace SusString : "+rpss);
		
//Replace All Occurrences (regex)
		String RAO="Thank 123 you me 456 For me 789 Using me 101 Me Here";
		String rpaa=RAO.replaceAll("[0-9]",""); //this will replace all number into empty
		String rpaa1=RAO.replaceAll("[a-zA-Z]+","Poks");//this will replace all character to pokes
		String rpaa2=RAO.replace("me","you");
		System.out.println("Replace All Number to Empty : "+rpaa);
		System.out.println("Replace all character to pokes : "+rpaa1);
		System.out.println("Replace all me into you : "+rpaa2);
		
//Split String  .split()
		String Ss="Welcome to Java Class buddy";
		System.out.println(Ss);
//		the Split methods split the string and return the array value of String 
		String[] Spart=Ss.split(" ");  // we will declare how to split here
		System.out.println(Spart[3]);
		for(int i=0;i<Spart.length;i++) {
			System.out.println("Splited String : "+Spart[i]);
		}
		
//Join String .join()
//		String Ss="Welcome to Java Class buddy";
//		join method join the array value and convert them into String value here
		String js=Ss.join(" + ",Spart);
		System.out.println(js);
		
//Check If The String Starts With .startsWith()
//		String Ss="Welcome to Java Class buddy";
		Boolean ssw=Ss.startsWith("to");
		Boolean ssw1=Ss.startsWith("Welcome"); //it will check the string start with if it is it return true
		System.out.println("String start With : "+ssw);
		System.out.println("String start With : "+ssw1);
		
//Check if the String Ends With .endsWith()
//		String Ss="Welcome to Java Class buddy";
		Boolean sew=Ss.endsWith("to");
		Boolean sew1=Ss.endsWith("buddy"); //it will check the string ends with if it is it return true else false
		System.out.println("String Ends With : "+sew);
		System.out.println("String Ends With : "+sew1);
		
//String Contains .contains()
//		if the give value is here in string it return true or else return false
		String Sss="Welcome to Java Class buddy";
		Boolean Scon=Sss.contains("to");
		Boolean Scon1=Sss.contains("Hi");
		System.out.println("String Contains : "+Scon+" "+Scon1);
		
//Index of SubString .indexOf()
//		the indexOf methods it will show the first occurrance of the value's index value
//		we give 
		int ios=Sss.indexOf("e"); //the number will ignore the first 4 occurrance of value we give
		int ios1=Sss.indexOf("e",2);
		System.out.println("indexOf : "+ios+" "+ios1);
		
//LastIndexOf SubString .lastIndexOf()
//		it will check the index value from the last String index value
		int lios=Sss.lastIndexOf("s");
		System.out.println("Last index Of value : "+lios);
		
//Convert Char to Array .toCharArray()
//		it will convert each letter in String to char and store in array
		String cca="Welcome to here da makkaley";
		char[] cta=cca.toCharArray();
		for(char m:cta) {
			System.out.println("character : "+m);  
		} 
		
//Create String from Char Array here 
//		it will create a new String from char array we created above
		String strcfa=new String(cta);
		System.out.println("Create String From Char Array : "+strcfa);
		
//Check If String Is Empyt Here .isEmpty()
//		in isEmpty it will Consider Empty String as a String value here
		String CsE=" "; //it will consider even empty String also as a String in Empty methods
		String CsE1="Pokesh";
		System.out.println("Check If Stirng Empty : "+CsE.isEmpty()); //if empty return true else false
		System.out.println("Check If Stirng Empty : "+CsE1.isEmpty());
		
//Check If String Is Blank .isBlank()
		String CsB=" "; //it will not consider even empty String  in isBlank methods
		String CsB1="Pokesh";
		System.out.println("Is Blank is : "+CsB.isBlank()); //it return true because it check if there is any string value of not 
		System.out.println("Is Blank is : "+CsB1.isBlank());

//Repeat String Here
		String Rep="Pokesh ";
		System.out.println("String Repeat : "+Rep.repeat(5)); //it will repeat the same string five time
		
		
//Format String .format()
//		in format String we need to give the String we print before the String value then
//		,we need to give String name Which you want to show here inside the fomatted String
		String StrFor="Welcome Home Malli";
		String StrFor1="Hey Pokesh Where Is Her";
		String forme1=String.format("My girl Malli %s",StrFor1);
		String forme=String.format("My girl Malli %s",StrFor);
		System.out.println("Fomatted String : "+forme);
		System.out.println(forme1);
		System.out.println(StrFor1);
		
//		 // Concatenation of two strings
//        String s
//            = String.format("My Company name is %s", str);
//
//        // Output is given upto 8 decimal places
        String str2
            = String.format("My answer is %.8f", 47.6573484840304304);
        System.out.println(str2);
//
//        // Here answer is supposed to be %15.8f" and
//        // "47.65734000" there are 15 spaces
//        String str3 = String.format("My answer is %15.8f",
//                                    47.65734);
	
	}

}
