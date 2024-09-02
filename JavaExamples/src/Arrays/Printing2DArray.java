package Arrays;

public class Printing2DArray {
	public static void main(String[] args) {
		int mat[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		print2DMatrix(mat);
	}

	
	private static void print2DMatrix(int[][] mat) {
		for(int[] row : mat) {
			for(int x : row) {
				System.out.print(x + " ");
			}
			System.out.println("\n");
		}
		
	}

	/*
	private static void print2DMatrix(int[][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] +" ");
			}
			System.out.println("\n");
		}
		
	}
	*/

}
