package strings;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		str = str.toLowerCase();
		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;	
			}
			i++;
			j--;
		}
		
		return true;
	}
	public static void main(String[] args) {
		String string = "Tenet";
		System.out.println("is '"+ string + "' Palindrome: " + isPalindrome(string));
	}
}
