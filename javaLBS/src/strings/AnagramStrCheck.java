package strings;

public class AnagramStrCheck {
	
	public static String isStrAnagram(String str1, String str2) {
		
		if (str1.length() == str2.length()) {
			
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			
			str1 = SortString.sortStr(str1);
			str2 = SortString.sortStr(str2);
			
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					return "Strings are Not Anagram";
				}
			}
		}
		else {
			return "Strings Length are Not Same";
		}
		
		return "Strings are Anagram";
	}
	
	public static void main(String[] args) {
		String string1 = "Listen";
		String string2 = "Silent";
		
		System.out.println(isStrAnagram(string1, string2));
	}
}




