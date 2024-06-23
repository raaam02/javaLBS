package strings;

public class FindRepeatedChar {
	
	public static void repeatedChar(String str) {
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < str.length() - 1; i++) {
			int count = 0;
			
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = ' '; //mark as counted
				}
			}
			if (count > 0) {
				System.out.print(ch[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		String str = "github : raaam02 raaam02 raaam02";
		System.out.print("'" + str + "' in this string repeated characters are: ");
		repeatedChar(str);
	}
}
