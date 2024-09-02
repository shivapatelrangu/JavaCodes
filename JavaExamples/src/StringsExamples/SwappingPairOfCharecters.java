package StringsExamples;

public class SwappingPairOfCharecters {
	public static void main(String[] args) {
		String s = "shivapatel";
		String s1 = SwappingPairOfChar(s);
		System.out.println(s1);
	}

	private static String SwappingPairOfChar(String s) {
		char[] charArray = s.toCharArray();
		char temp ;
		for(int i=0; i<charArray.length-1; i=i+2) {
			temp = charArray[i];
			charArray[i] = charArray[i+1];
			charArray[i+1] = temp;
		}
		return String.valueOf(charArray);
	}

}
