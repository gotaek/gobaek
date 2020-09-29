import java.util.Scanner;

public class B1463 {
	static Integer dp[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		dp = new Integer[n + 1];
		dp[0] = 0;
		dp[1] = 0;

		

		System.out.println(recur(n));
	}

	public static int recur(int num) {
		if (dp[num] == null) {
			if (num % 6 == 0) {
				dp[num] = Math.min(recur(num - 1), Math.min(recur(num / 3), recur(num / 2))) + 1;
			} else if (num % 3 == 0) {
				dp[num] = Math.min(recur(num / 3), recur(num - 1)) + 1;
			} else if (num % 2 == 0) {
				dp[num] = Math.min(recur(num / 2), recur(num - 1)) + 1;
			} else {
				dp[num] = recur(num - 1) + 1;
			}
		}
		return dp[num];
	}

}
