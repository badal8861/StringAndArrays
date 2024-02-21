package Strings;

public class LengthOfString {

	public static void main(String[] args) {

		String s = "Baddal";

		char[] str=s.toCharArray();
		
		for(int i=0;i<str.length;i++) {
			
			
			
			for(int j=i+1;j<str.length;j++) {
				
				if(str[i]==(str[j])) {
					
					str[i]='$';
					str[j]='$';
					
				}
			}
		}
		 System.out.println(str);
		}
}