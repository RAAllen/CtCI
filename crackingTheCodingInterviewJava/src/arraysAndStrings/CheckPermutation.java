package arraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {
	
	public static String permutation1 = new String("abcdef");
	public static String permutation2 = new String("fedcba");
	public static String nonPermutation = new String("hello");
	
	public static void main(String[] args) {
		System.out.println(isPermutation(permutation1, permutation2));
		System.out.println(isPermutation(permutation1, nonPermutation));
	}
	
	public static boolean isPermutation(String string1, String string2) {
		if(string1.length() != string2.length()) {
			return false;
		}
		char[] chars1 = string1.toCharArray();
		Arrays.sort(chars1);
		System.out.println(chars1);
		String first = new String(chars1);
		char[] chars2 = string2.toCharArray();
		Arrays.sort(chars2);
		System.out.println(chars2);
		String second = new String(chars2);
		return first.equals(second);
	}

}
