package Arrays;

public class SmallestElem {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 3, 7, 4 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {

				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
