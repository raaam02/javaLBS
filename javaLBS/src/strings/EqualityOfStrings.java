package strings;

public class EqualityOfStrings {
	
	public static boolean isStringsEqual(String str1, String str2) {
		
		// Check if the lengths of the two strings are not equal
		if (str1.length() != str2.length()) {
			return false;
		}
		
			// Compare each character of both strings
			for (int i = 0; i < str1.length(); i++) {
				
				if (str1.charAt(i) != str2.charAt(i)) {
					return false;
				}
				
			}
			// Return true if all characters are equal
		return true;
	}
	
	public static void main(String[] args) {
		
		String str1 = "github userName: raaam02";
		String str2 = "github userName: raaam02";
		
		System.out.println("Both Strings are Equal? " + isStringsEqual(str1, str2));
	}
}
