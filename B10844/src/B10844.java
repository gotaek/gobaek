import java.util.Scanner;

public class B10844 {
	static Long dp[][];
	static int N;
	final static long MOD = 1000000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		N = s.nextInt();
		dp = new Long[N + 1][10];
		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1L;
		}
		long sum = 0;
		for (int i = 1; i < 10; i++) {
			sum += recur(N, 1);
		}
		System.out.println(sum % MOD);

	}

	public static long recur(int digit, int val) {
		if (digit == 1)
			return dp[digit][val];
		if (dp[digit][val] == null) {
			if (val == 0)
				dp[digit][val] = recur(digit - 1, 1);
			else if (val == 9)
				dp[digit][val] = recur(digit - 1, 8);
			else
				dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
		}
		return dp[digit][val] % MOD;
	}
}
