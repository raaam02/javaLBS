package javaLBS;

public class PerfectSquare {
	public static void main(String[] args) {
		int num = 25;
		int sqrt = 0;
		boolean isPerfectSquare = false;
		for (int i = 1; i < num/2; i++) {
			if(i * i == num) {
				isPerfectSquare = true;
				sqrt = i;
				break;
			}
		}
		if(isPerfectSquare == true) {
			System.out.println(num + " is perfect sqaure of " + sqrt);
		}else {
			System.out.println(num + " is not a perfect sqaure");
		}
	}
}
