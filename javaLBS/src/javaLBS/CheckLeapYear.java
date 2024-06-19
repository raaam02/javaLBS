package javaLBS;

public class CheckLeapYear {
	public static void main(String[] args) {
		int year = 1700;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap Year");
				} else {
					System.out.println(year + " is not a Leap Year");
				}
			}else {
				System.out.println(year + " is a Leap Year");
			}
		}else {
			System.out.println(year + " is not a Leap Year");
		}
	}
}
