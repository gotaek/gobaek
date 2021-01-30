import java.util.Scanner;

public class B1644 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		boolean num[] = new boolean[N + 1];
		num[0] = num[1] = false;
		int primeNum[] = new int[N + 1];

		for (int i = 2; i <= N; i++) {
			num[i] = true;
		}
		for (int i = 2; i * i <= N; i++) {
			for (int j = i * i; j <= N; j += i) {
				num[j] = false;
			}
		}
		int idx = 0;
		for (int i = 0; i <= N; i++) {
			if (num[i] == true) {
				primeNum[idx++] = i;
			}
		}

		int pl = 0, pr = 0;
		int sum = 0;
		int cnt = 0;
		while (pl <= pr && pl <= N && pr <= N) {
			if (pl + 1 == pr && sum == N) {
				cnt++;
				break;
			}
			if (sum < N) {
				sum += primeNum[pr++];
			} else if (sum == N) {
				cnt++;
				sum += primeNum[pr++];
			} else {
				sum -= primeNum[pl++];
			}
		}

		System.out.println(cnt);

	}

}
