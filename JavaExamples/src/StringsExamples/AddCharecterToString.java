package StringsExamples;

public class AddCharecterToString {
	public static void main(String[] args) {
		char ch = 'r';
		String s = "shiva";
		int pos = 3;
		String s2 = addCharectersTostring(s,ch);
		String s3 = addCharecterInAGivenPosition(s,ch,pos);
		System.out.println(s3);
	}

	private static String addCharecterInAGivenPosition(String s, char ch, int pos) {
		String s1 = s.substring(0,pos) + ch + s.substring(pos);
		return s1;
	}

	/*
	private static String addCharecterInAGivenPosition(String s, char ch, int pos) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.insert(pos, ch);
		return sb.toString();
	}
	*/

	private static String addCharectersTostring(String s, char ch) {
		String s3 = s+ch;
		return s3;
	}

}
