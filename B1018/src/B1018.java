
import java.util.Scanner;

public class B1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int min = 10000;
		char[][] board = new char[n][m];
		if (n<8||m<8||n>50||m>50) return;
		for (int i = 0; i < n; i++) {
			String str = s.next();
			for (int j = 0; j < m; j++) {
				board[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				
				int cnt1 = 0;
				int cnt2 = 0;
				int minx = 0;

				for (int x = i; x < i + 8; x++) {
					for (int y = j; y < j + 8; y++) {

						if ((x + y) % 2 == 0 && board[x][y] != 'B')
							cnt1++;
						else if ((x + y) % 2 == 1 && board[x][y] != 'W')
							cnt1++;

						if ((x + y) % 2 == 0 && board[x][y] != 'W')
							cnt2++;
						else if ((x + y) % 2 == 1 && board[x][y] != 'B')
							cnt2++;

					}

				}

				minx = cnt1 > cnt2 ? cnt2 : cnt1;
				min = min > minx ? minx : min;
				//System.out.printf("%d\n", minx);
				
			}
		}

		System.out.printf("%d", min);

	}

}
