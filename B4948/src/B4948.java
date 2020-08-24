import java.util.Scanner;

public class B4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		while (true) {
			int n = s.nextInt();
			if (n == 0)
				break;
			boolean a[] = new boolean[2 * n + 1];

			int cnt = 0;

			
			for (int i = 2; i <= 2 * n; i++) {
				for (int j = 2; i * j <= 2 * n; j++) {
					a[i * j] = true;
				}
			}
			
			for (int i = n+1; i <= 2 * n; i++) {
				if (!a[i] )
					cnt++;
			}

			System.out.printf("%d \n", cnt);
		}

	}
}
