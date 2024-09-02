package StringsExamples;

public class PrintingNewLine {
	
	public static void main(String[] args) {
		
		String newLine = System.lineSeparator();
		String newLine1 = System.getProperty("line.separator");
		System.out.println("shiva"+newLine1+"rangu");
		System.out.println("shiva" + "\n" + "rangu");
		System.out.printf("shiva%nrangu");
	}

}
