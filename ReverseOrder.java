package Strings;

public class ReverseOrder {

	public static void main(String[] args) {

		String s1 = "Kinng";
		String s2 = " ";
		char c;

		for (int i = 0; i < s1.length(); i++) {

			c = s1.charAt(i);

			s2 = c + s2;
		}
		System.out.println(s2);
	}
}