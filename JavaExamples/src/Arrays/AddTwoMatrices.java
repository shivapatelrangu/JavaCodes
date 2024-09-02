package Arrays;

public class AddTwoMatrices {
	public static void main(String[] args) {
		int a[][] = {
				{1,2},
				{2,3}
		};
		int b[][] = {
				{2,2},
				{3,3}
		};
		int c[][] = new int[a.length][a[0].length];
		int d[][] = addTwoMatrices(a,b,c);
		for(int i =0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

	private static int[][] addTwoMatrices(int[][] a, int[][] b, int[][] c) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}
