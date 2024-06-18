package javaLBS;

public class Palindrome {
	public static void main(String[] args) {
		int num = 55255, num2 = num;
		int rem = 0, reverse = 0;
		while (num > 0) {
			rem = num % 10;
			reverse = reverse*10 + rem;
			num /= 10;
		}
		if (num2 == reverse) {
			System.out.println(num2 + " and " + reverse + " are palindrome");
		}else {
			System.out.println(num2 + " and " + reverse + " are not palindrome");
		}
	}
}
