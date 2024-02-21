package GobalAutomation;

public class AgeCompare {

	public static void main(String[] args) {

		String name1="badal",name2="King";
		int age1=20,age2=20;
		
		
		if(age1>age2) {
			System.out.println(name1+" bcz "+name1+ " is younger  ");
		}
		else if(age1<age2)
		{
			System.out.println(name2+" bcz "+name2+ " is elder  ");
		}
		else {
			System.out.println(name1+" same"+name2);
		}
		
	}

}
