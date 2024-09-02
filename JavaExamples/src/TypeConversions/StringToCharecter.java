package TypeConversions;

import java.util.Arrays;

public class StringToCharecter {
	public static void main(String[] args) {
		String s = "rangushiva";
		char[] charArray1 = s.toCharArray();
		System.out.println(Arrays.toString(charArray1));
		
		
		char[] charArray = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
		    charArray[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(charArray));
	}

}
