package javaLBS;

public class FibonacciSeries {
	public static void main(String[] args) {
		int till = 10;
		int a = 0;
		int b = 1;
		
		for (int i = 1; i <= till; i++) {
			int c = a + b;
			System.out.println(a);
			a = b;
			b = c;
		}
		
	}
}
