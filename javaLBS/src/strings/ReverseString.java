package strings;

public class ReverseString {
	
	public static String reverseStr(String str) {
		char[] ch = str.toCharArray();
		int j = str.length() - 1;
		
		for (int i = 0; i < j; i++) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			j--;
		}
		String reversedStr = new String(ch);
		return reversedStr;
	}
	
	public static void main(String[] args) {
		String string = "ABCD";
		System.out.println(reverseStr(string));
	}
}
