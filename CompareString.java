//compare two strings like example 
//BadalSingh SinghBadal if it equals return 0 else return -1

package GobalAutomation;

public class CompareString {

	public static void main(String[] args) {

		String str1 = "BadalSingh";

		String str2 = "badalSingh";

		int res = compare(str1.toLowerCase(), str2.toLowerCase());

		if (res == 0) {
			System.out.println(res + " same ");
		} else {
			System.out.println(res + " not same ");
		}
	}

	public static int compare(String str1, String str2) {

		// original order
		for (int i = 0; i < str1.length(); i++) {

			if (str1.charAt(i) != str2.charAt(i)) {
				return -1;
			}
		}

//		// reverse order
//
//		for (int i = 0; i < str1.length(); i++) {
//
//			if (str1.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
//				return -1;
//			}
		
		return 0;

	}
}