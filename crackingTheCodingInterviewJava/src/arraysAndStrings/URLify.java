package arraysAndStrings;

public class URLify {
	
	public static String string = new String("This is a string         ");

	public static void main(String[] args) {
		
	}
	
	public static String urlIfy(String string) {
		int length = string.length();
		char[] chars = string.toCharArray();
		int counter = 0;
		int index = 0;
		int i = 0;
		for(i = 0; i < length; i++) {
			if(chars[i] == ' ') {
				counter++;
			}
		}
		return string;
	}
	
}
