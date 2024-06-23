package strings;

public class LowerTriangularMatrix {
	
	public static void lowerTrangularMatrix(char[][] ch) {
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (i >= j) {
					System.out.print(ch[i][j] + " ");
				}
				else {
					System.out.print("0" + " ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		char ch[][] = {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'},{'M','N','O','P'}};
		lowerTrangularMatrix(ch);
 	}
}
