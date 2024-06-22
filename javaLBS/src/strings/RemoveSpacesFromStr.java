package strings;

public class RemoveSpacesFromStr {
	
	public static String removeSpaces(String str) {
		String newstr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				newstr += str.charAt(i);
			}
		}
		
		return newstr;
	}
	
	public static void main(String[] args) {
		String string = "Github raaam02 twitter raaam_02";
		
		System.out.println(removeSpaces(string));
	}
}
