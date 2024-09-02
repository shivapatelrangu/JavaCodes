package StringsExamples;

public class RemoveLeadingZerosFromString {
	public static void main(String[] args) {
		String s = "000012390930";
//		String s2 = removeZeros(s);
		System.out.println(removeZeros(s));
	}

	private static String removeZeros(String s) {
		String s1 = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) > '0') {
				s1 = s.substring(i);
				break;
				
			}
		}
		return s1;
	}

}
