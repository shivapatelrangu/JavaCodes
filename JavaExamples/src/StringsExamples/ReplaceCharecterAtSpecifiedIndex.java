package StringsExamples;

public class ReplaceCharecterAtSpecifiedIndex {
	public static void main(String[] args) {
		String s = "shibapatel";
		char ch = 'v';
		int index = 3;
		System.out.println(s.substring(0,index) + ch + s.substring(index+1));
		
		StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(index, ch);
        System.out.println(sb);
	}

}
