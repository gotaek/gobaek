import java.util.Scanner;

public class B11051 {
	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();

		int arr[][] = new int[n + 1][n + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0)
					arr[i][j] = 1;
				else
					arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j]) % 10007;
			}
		}

		System.out.println(arr[n][k]);


	}
}
