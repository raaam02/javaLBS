package javaLBS;

public class Factorial {
	public static int number = 8;
	public static int fact = 1;
	public static int getFactorial(int num) {
		if(num == 0) {
			return fact = 1;
		}
		else {
			for(int i=1; i<=num; i++) {
				fact *= i;
			}
			return fact;
		}
	}
	public static void main(String[] args) {
		 System.out.println(getFactorial(number));
		 
	}

}
