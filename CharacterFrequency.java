package Strings;


public class CharacterFrequency {

	public static void main(String[] args) {

		String s="prepinsta";
		int freq[]=new int[s.length()];//store the freq
		char[] stringchar=s.toCharArray();//string can't compare char so
		
		for(int i=0;i<s.length();i++) {
			
			freq[i]=1;//atleast once
			
			for(int j=i+1;j<s.length();j++) {
				
				if(stringchar[i]==stringchar[j]) {
					
					freq[i]++;
					stringchar[j]='0';
				}
			}
		}
		//to display
		
		for(int i=0;i<freq.length;i++) {
			
			if(  stringchar[i]!=' ' && stringchar[i]!='0' ) {
				System.out.println(stringchar[i]+"-"+freq[i]);
			}
		}
		
	}
}
