import java.util.Scanner;

public class B2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int res = 0;

		if (n < 1 || n > 1000000)
			return;
		for (int i = n-1; i >= 1; i--) {
			int num = i;
			int sum = 0;
			sum += num;

			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if (sum == n) {
				res = i;
			}

		}

		System.out.printf("%d", res);
	}

}
