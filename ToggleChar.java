package Strings;

public class ToggleChar {

	public static void main(String[] args) {

		String str1 = "Badal Singh";
		String str2 = "";

		for (int i = 0; i < str1.length(); i++) {

			if (Character.isUpperCase(str1.charAt(i))) {

				str2 = str2 + Character.toLowerCase(str1.charAt(i));
			} else {
				str2 = str2 + Character.toUpperCase(str1.charAt(i));
			}
		}
		System.out.println(str2);
	}
}