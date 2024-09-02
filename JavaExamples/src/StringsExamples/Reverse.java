package StringsExamples;

public class Reverse {
	public static void main(String[] args) {
		String s = "shiva";
		String rev = reverseString(s);
		System.out.println(rev);
		
	}

	 	private static String reverseString(String s) {
		String newString = "";
		for(int i=0;i<s.length();i++) {
			newString = s.charAt(i)+newString;
		}
		return newString;
	}
	
	/*
	private static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
	*/

}
