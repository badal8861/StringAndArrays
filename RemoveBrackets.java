package Strings;

public class RemoveBrackets {

	public static void main(String[] args) {

		
		String s="({a+b})";
		
		String result=s.replaceAll("[(){}]","");
		System.out.println(result);
		
		
	}

}
