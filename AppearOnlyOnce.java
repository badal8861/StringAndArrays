package Strings;

public class AppearOnlyOnce {

	public static void main(String[] args) {

		String s = "prepinsta";

		boolean flag = true;

		char[] stringchar = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(stringchar[i]) == s.lastIndexOf(stringchar[i])) {
				System.out.println(" 1st non repeating char is " + stringchar[i]);
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("there is no no repeating");
		}
	}
}
