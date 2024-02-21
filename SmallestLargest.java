package Arrays;

public class SmallestLargest {

	public static void main(String[] args) {

		int arr[] = { 3, 6, 5, 2, 1 };

		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (largest < arr[i]) {
				largest = arr[i];
			}
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println(" smallest is " + smallest);
		System.out.println(" largest is " + largest);
	}
}
