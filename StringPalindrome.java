
public class StringPalindrome {

	public static void main(String[] args) {
		
		String s="level";
		boolean result=isPalindrome(s);
		
		if(result==true) {
			
			
			System.out.println("palindrome"+s);
		}
		else
			System.out.println("not a "+s);
	}

	private static boolean isPalindrome(String s1) {

		int n=s1.length();
		
		for(int i=0;i<n/2;i++) {
			
			if(s1.charAt(i)!=s1.charAt(n-i-1)) {
				
				return false;
			}
		}
		
		return true;
	}
}
