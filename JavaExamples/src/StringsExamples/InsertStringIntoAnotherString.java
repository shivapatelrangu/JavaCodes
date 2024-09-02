/*Input: originalString = "GeeksGeeks", 
            stringToBeInserted = "For", 
            index = 4
Output: "GeeksForGeeks" */

package StringsExamples;

import java.util.Scanner;

public class InsertStringIntoAnotherString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int index = sc.nextInt();
		String combinedString = insertNewString(s1,s2,index);
		System.out.println(combinedString);
	}

	private static String insertNewString(String s1, String s2, int index) {
		StringBuffer sb = new StringBuffer(s1);
		sb.insert(index + 1, s2);
		return sb.toString();
	}

	/*
	private static String insertNewString(String s1, String s2, int index) {
		String s3 = s1.substring(0,index+1)+s2+s1.substring(index+1);  // index+1 - it will take upto index 4 , it wont include index 4 , if we want to include index 4 we need write like this
		return s3;
	}
	*/

	/*
	private static String insertNewString(String s1, String s2, int index) {
		
		String newString = "";
		for(int i=0; i<s1.length();i++) {
			newString += s1.charAt(i);
			if(i==index) {
				newString += s2;
			}
		}
		return newString;
	}
	 */

}

//https://www.geeksforgeeks.org/insert-a-string-into-another-string-in-java/
