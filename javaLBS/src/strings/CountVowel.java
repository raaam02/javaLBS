package strings;

public class CountVowel {
	public static int countVowel(String str) {
		int count = 0;
		
		for (char ch : str.toLowerCase().toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		String string = "Hello WORLD";
		System.out.println("Number of Vowel in \"" + string + "\" are: " + countVowel(string));
	}
}
