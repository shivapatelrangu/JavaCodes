package StringsExamples;

import java.util.ArrayList;

public class SplitStringIntoNumberOfSubStrings {
	public static void main(String[] args) {
		String s = "Shiva";
		ArrayList<String> subStrings = new ArrayList<>();
		subStrings = findSubStrings(s,subStrings);
		System.out.println(subStrings);
	}

	private static ArrayList<String> findSubStrings(String s, ArrayList<String> subStrings) {
		for(int i=0; i<=s.length();i++) {
			for(int j=i+1; j<=s.length(); j++) {
				subStrings.add(s.substring(i, j));
			}
		}
		return subStrings;
	}

}
