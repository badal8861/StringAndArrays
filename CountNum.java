package Strings;

public class CountNum {

	public static void main(String[] args) {

		String s1="Badal123King";
		

		int sum=0;
		
		for(int i=0;i<s1.length();i++) {
			
			if(Character.isDigit(s1.charAt(i))) {
				
				sum=sum+Character.getNumericValue(s1.charAt(i));
					
				}
			}
		System.out.println(sum);
		}
}
