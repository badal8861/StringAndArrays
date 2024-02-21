package Strings;

public class RemoveSpaces {

	public static void main(String[] args) {

		String s="Badal  Singh";
		
		char c[]=s.toCharArray();
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<s.length();i++) {
			
			if(c[i]!=' ' && c[i]!='\t') {
				
				sb.append(c[i]);
			}
		}
		System.out.println(sb);
		
	}

}