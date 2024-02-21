package Strings;

public class RemoveSpaceTrim {

	public static void main(String[] args) {
		
		String s=" badal king ";
		
		String trimmer =s.trim();//badal king
		
		int count=0;
		
		
		for(int i=0;i<=trimmer.length()-1;i++) {
			
			if(trimmer.charAt(i)==' ') {
				break;
				
			}
			else {
				count++;
			}
		}
		System.out.println("before the space"+count);
	}
}
