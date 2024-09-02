package StringsExamples;

enum Fruits{
	apple,
	banana,
	grapes
}
public class ConvertEnumToString {
	public static void main(String[] args) {
		
		System.out.println(Fruits.apple.name());
		System.out.println(Fruits.banana.toString());
	}
	

}
