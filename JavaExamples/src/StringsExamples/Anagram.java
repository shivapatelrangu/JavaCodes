package StringsExamples;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		boolean val = isAnagram(s1.toLowerCase(),s2.toLowerCase());
		if(val) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not a anagram");
		}
	}

	private static boolean isAnagram(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		if(n1 != n2) {
			return false;
		}
		char[] s3 = s1.toCharArray();
		char[] s4 = s2.toCharArray();
		
		Arrays.sort(s3);
		Arrays.sort(s4);
		for(int i=0;i<n1;i++) {
			if(s3[i]!=s4[i]) {
				return false;
			}
		}
		
		return true;
	}

}
