package strings;

public class IsOnlyDigit {
	
	public static boolean isOnlyDigit(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String string1 = "raaam02";
		String string2 = "002";
		
		System.out.println("is '" + string1 + "' only contains digits? : " + isOnlyDigit(string1));
		System.out.println("is '" + string2 + "' only contains digits? : " + isOnlyDigit(string2));
	}
}
