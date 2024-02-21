package Strings;

public class RemoveVowel {

	public static void main(String[] args) {

		String s = "Badal";
        String s1=" ";
	
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != 'a' && s.charAt(i) != 'A' && s.charAt(i) != 'e' && s.charAt(i) != 'E'
					&& s.charAt(i) != 'i' && s.charAt(i) != 'I' && s.charAt(i) != 'o' && s.charAt(i) != 'O'
					&& s.charAt(i) != 'u' && s.charAt(i) != 'U') {

				//System.out.print(s.charAt(i));
				s1=s1+s.charAt(i);
				
			     
			}
			
				
			
		
			}

		System.out.println(s1);
		}
		
	}


