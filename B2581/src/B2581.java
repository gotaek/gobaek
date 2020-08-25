import java.util.Scanner;

public class B2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int m = s.nextInt();
		int n = s.nextInt();
		int min = 0;
		int sum = 0;
		int arr[] = new int[n-m + 1];
		int idx = 0;

		for (int i = m; i <= n; i++) {
			int socnt = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					socnt++;
				}

			}
			if (socnt == 2) {
				arr[idx] = i;
				sum += i;
				idx++;
			}

		}
		if (sum==0&&arr[0]==0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(arr[0]);
			
		}

	}

}
