package javaLBS;

public class Factorial {
	public static void main(String[] args) {
		 int number = 6, fact = 1;
		 for(int i=1; i<=number; i++) {
			 fact *= i;
		 }
		 System.out.println(fact);
	}

}
