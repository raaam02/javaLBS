package strings;

public class OccOfSubStrInStr {
	
	public static int countOccurrencesOfSubstring(String str, String subStr) {
		int count = 0;

		for (int i = 0; i <= str.length()-subStr.length(); i++){
			if (str.charAt(i) == subStr.charAt(0)) {
				boolean matchFound = true;
				for (int j = 1; j < subStr.length(); j++) {
					if (subStr.charAt(j) != str.charAt(i + j)) {
						matchFound = false;
						break;
					}
				}
				if (matchFound) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String string = "github UserName: raaam02 raaam02 raaam02 raaam02";
		String subString = "ram02";
		
		System.out.println("'" + subString + "'" +
		" occur " + countOccurrencesOfSubstring(string, subString) +
		" times in '" + string + "'");
	}
}