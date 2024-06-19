package javaLBS;

public class LCM {
	public static void main(String[] args) {
		int LCM = 0;
		int gcd = 0;
		int num1 = 15, num2 = 25;
		
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
//		According to formula
		LCM = (num1 * num2) / gcd;
		System.out.println(LCM + " is LCM of " + num1 + " and " + num2);
	}
}
