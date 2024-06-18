package javaLBS;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153, num2 = num;
		int rem = 0, result = 0, count = 0, digit = 0;
		
		while(num > 0) {
			num /= 10;
			count++;
		}
		num = num2;
		while(num > 0) {
			rem = num % 10;
//			result = (result * 10) + (rem * rem *rem);
			digit = (int) Math.pow(rem, count);
			result += digit;
			num /= 10;
		}
		if (num2 == result) {
			System.out.println(num2 + " is armstrong");
		}else {
			System.out.println(num2 + " is not armstrong");
		}
	}

}
