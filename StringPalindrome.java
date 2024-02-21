package Strings;

public class StringPalindrome {
	public static void main(String[] args) {

		String s1 = "radar";
		boolean a = stringPalin(s1);

		if (a == true) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

	public static boolean stringPalin(String s1) {

		int left = 0;
		int right = s1.length() - 1;// radar

		while (left < right) {

			if (s1.charAt(left) != s1.charAt(right)) {

				return false;
			}
			left++;
			right--;
		}

		return true;

	}
}