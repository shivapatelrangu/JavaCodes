package TypeConversions;

import java.util.Arrays;

public class CharArrayToString {
	public static void main(String[] args) {
		char[] charArray = {'s','h','i','v','a'};
		
		//method1 
		System.out.println(String.valueOf(charArray));
		
		//method 2
		System.out.println(new String(charArray));
		
		//method3
		System.out.println(new String(Arrays.copyOf(charArray, charArray.length)));
		
		//method =4 : String Builder
	
		StringBuilder sb = new StringBuilder();
		for (char c : charArray) {
		    sb.append(c);
		}
		System.out.println(sb.toString()); 

		
	}

}
