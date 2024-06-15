package javaLBS;

public class Factorial {
	public static int getFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		else {
			int fact = 1;
			for(int i=1; i<=num; i++) {
				fact *= i;
			}
			return fact;
		}
	}
	public static void main(String[] args) {
		int number = 7;
		System.out.println(getFactorial(number));
		 
	}

}
