package StringsExamples;

public class PrintingEvenLengthWordsInString {
	public static void main(String[] args) {
		String s = "happy birthDay to you saho";
		String[] words = s.split(" ");
		for(String word : words) {
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}
	}

}
