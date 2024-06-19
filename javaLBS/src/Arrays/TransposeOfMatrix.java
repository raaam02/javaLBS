package Arrays;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int tMat[][] = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				tMat[i][j] = mat[j][i];
				System.out.print(tMat[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
