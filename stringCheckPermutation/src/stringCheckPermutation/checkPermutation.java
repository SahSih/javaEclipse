package stringCheckPermutation;

import java.util.Arrays;

public class checkPermutation {
	
	// Sort it, then compare if two strings are equal.
	/*public static String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}*/
	
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) return false;
		
		int[] letters = new int[128];
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i)]++;
		}
		
		for (int i = 0; i < t.length(); i++) {
			letters[t.charAt(i)]--;
			if (letters[t.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123321";
		String t = "123231";
		
		System.out.println(permutation(s, t));
	}

}
