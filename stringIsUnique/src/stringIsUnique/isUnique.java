package stringIsUnique;

public class isUnique {
	
	// O(n) O(1)
	// Hashmap idea 
	/*public static boolean isUniqueChars(String str) {
		if (str.length() > 128) return false;
		
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}*/
	
	public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "dsf";
//		System.out.println(isUniqueChars(s));
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(1 << 1));
		System.out.println(Integer.toBinaryString(1 << 2));
	}

}
