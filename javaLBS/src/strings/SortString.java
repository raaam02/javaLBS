package strings;

public class SortString {
	public static String sortStr(String str) {
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int k = 0; k < ch.length - 1; k++) {
				if (ch[k] > ch[k+1]) {
					char temp = ch[k];
					ch[k] = ch[k+1];
					ch[k+1] = temp;
				}
			}
		}
		String reversedStr = new String(ch);
		return reversedStr;
	}
	
	public static void main(String[] args) {
		String string = "abcdABCD";
		System.out.println(sortStr(string));
	}
}
