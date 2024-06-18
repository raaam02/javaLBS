package javaLBS;

public class SumOfDigits {
	public static void main(String[] args) {
		int num = 5665;
		int rev = 0, sum = 0;
		while (num > 0) {
			rev = num % 10;
			sum += rev;
			num /= 10;
		}
		System.out.println(sum);
	}
}
