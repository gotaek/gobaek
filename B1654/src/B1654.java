import java.util.Arrays;
import java.util.Scanner;

public class B1654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int k = s.nextInt();
		int n = s.nextInt();

		int arr[] = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);

		long min = 0;
		long max = arr[k - 1];
		long middle;
		
		while (min <= max) {

			middle = (min + max) / 2;

			long result = 0;
			for (int i = 0; i < k; i++) {
				result += arr[i] / middle;
			}
			if (result >= n) {
				min = middle + 1;
			} else {
				max = middle - 1;

			}
		}
		System.out.println(max);
	}
}
