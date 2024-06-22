package strings;

public class OccOfSubStrInStr {
	
	public static int countOccOfSubStr(String str, String subStr) {
		int count = 0;

		for (int i = 0; i < str.length()-subStr.length()+ 1; i++){
			if (str.charAt(i) == subStr.charAt(0)) {
				boolean isNotSubStr = false;
				for (int j = 1; j < subStr.length(); j++) {
					if (subStr.charAt(j) != str.charAt(i + j)) {
						isNotSubStr = true;
						break;
					}
				}
				if (isNotSubStr == false) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String string = "github UserName: raaam02 raaam02 raaam02 raaam02";
		String subString = "raaam02";
		
		System.out.println("'" + subString + "'" +
		" occur " + countOccOfSubStr(string, subString) +
		" in '" + string + "'");
	}
}







