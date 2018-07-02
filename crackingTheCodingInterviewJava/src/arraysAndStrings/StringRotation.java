package arraysAndStrings;

import java.util.Arrays;

public class StringRotation {
	
	public static String hello = new String("Hello");
	
	public static void main(String[] args) {
		System.out.println(isUniqueChars(hello));
		System.out.println(isUniqueChars2(hello));
	}
	
	public static boolean isUniqueChars(String string) {
		char[] chars = string.toCharArray();
		Arrays.sort(chars);
		for(int i = 0; i < chars.length; i++) {
			if(chars[i] == chars[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isUniqueChars2(String string) {
		boolean[] chars = new boolean[256];
		for(int i = 0; i < string.length(); i++) {
			int value = string.charAt(i);
			System.out.println(value);
			if(chars[value]) {
				return false;
			}
			chars[value] = true;
		}
		return true;
	}

}
