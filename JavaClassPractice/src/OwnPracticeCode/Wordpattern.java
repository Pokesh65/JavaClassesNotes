package OwnPracticeCode;

import java.util.HashMap;

public class Wordpattern {

	static boolean WordPattern(String pattern, String s) {
		String[] arr = s.split(" ");
		if (pattern.length()!= arr.length) {
			return false;
		}
		HashMap<Character, String> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			char ch = pattern.charAt(i);
			boolean containKey = hm.containsKey(ch);
			if (hm.containsValue(arr[i]) && !containKey) {
				return false;
			}

			if (containKey && !hm.get(ch).equals(arr[i])) {
				return false;
			} else {
				hm.put(ch,arr[i]);
			}
			
		}
		return true;
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "aaaa";
		String s = "dog cat cat dog";
		System.out.println(WordPattern(pattern,s));

	}

}
