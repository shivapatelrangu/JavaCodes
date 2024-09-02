package StringsExamples;

public class PalindromeString {
	public static void main(String[] args) {
		String s = "madam";
		boolean val = palindromeString(s);
		if(val) {
			System.out.println("palindrome string");
		}
		else {
			System.out.println("not a palindrome string");
		}
	}

	private static boolean palindromeString(String s) {
		int start = 0, end = s.length()-1;
		while(start < end) {
			if(s.charAt(start)!= s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	/*
	private static boolean palindromeString(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		if(s.equals(sb.toString())) {
			return true;
		}
		return false;
	}
	*/
	

	/*
	private static boolean palindromeString(String s) {
		String newString = "";
		for(int i=0; i<s.length(); i++) {
			newString = s.charAt(i)+newString;
		}
		if(newString.equals(s)) {
			return true;
		}
		return false;
	}
	*/

}
