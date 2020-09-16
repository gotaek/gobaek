import java.util.Scanner;

public class B9663 {
	static int cnt;
	static int N;
	static boolean board[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		N = s.nextInt();
		board = new boolean[N][N];
		queen(0);
		for(int i=N;i>0;i--) {
			cnt=cnt/i;
		}
		System.out.print(cnt);

	}

	public static boolean possible(int x, int y) {
		int cross = x + y;
		int rev_cross = y - x;

		for (int i = 0; i < N; i++) {
			if (board[i][y] == true)
				return false;
		}
		for (int i = 0; i < N; i++) {
			if (board[x][i] == true)
				return false;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if ((i + j == cross || j - i == rev_cross) && board[i][j] == true) {
					return false;
				}
			}
		}
		return true;
	}

	public static void queen(int n) {

		if (n == N) {
			cnt++;
			//System.out.printf("---\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (possible(i, j)) {
					//System.out.printf("%d : %d %d \n",n,i,j);
					board[i][j] = true;
					queen(n + 1);
					board[i][j]=false;
				}
			}
		}
	}
}
