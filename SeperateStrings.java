package GobalAutomation;

public class SeperateStrings {

	public static void main(String[] args) {

		
		String str="Badal is Singh";
		
		 String[] words=str.split(" ");

		 String word1=words[0];
		 String word2=words[1];
		 String word3=words[2];
		 
		 
		 System.out.print(" \" "+words[0]+" \" ");
		 System.out.print(" \" "+words[1]+" \" ");
		 System.out.print(" \" "+words[2]+" \" ");
		
		
	}
}
