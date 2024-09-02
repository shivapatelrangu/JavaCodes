package Arrays;

public class Transpose {
	public static void main(String[] args) {
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][]b = transpose(a);
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

	private static int[][] transpose(int[][] a) {
		int[][]b = new int[a.length][a[0].length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		return b;
	}

}
