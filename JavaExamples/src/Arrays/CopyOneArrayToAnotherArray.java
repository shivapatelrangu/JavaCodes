package Arrays;

public class CopyOneArrayToAnotherArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = new int[a.length];
		copyOneArrayToAnotherArray(a,b);
	}

	private static void copyOneArrayToAnotherArray(int[] a, int[] b) {
		b=a;
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");	
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");	
		}
		
	}

}
