package Arrays;

public class SecondSmallest {

	public static void main(String[] args) {

		int a[]= {3,2,1,4,5,7};
		
		// assigning 1st elem as smallest temperory
		int smallest=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(smallest>a[i])
			{
				smallest=a[i];
			}
		}
		
		int second_smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=smallest && a[i]<second_smallest) {
				
				second_smallest=a[i];
			}
		}
		System.out.println(second_smallest);
	}
	

}
