package OwnPracticeCode;

import java.util.HashMap;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "{{[()]}";
		String [] arr = a.split("");
		
		HashMap<String, Integer> hm=new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			if(!hm.containsKey(arr[i])) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					count++;
				}
			}
			hm.put(arr[i], count);
		}
	}
		System.out.println(hm);

	}

}
