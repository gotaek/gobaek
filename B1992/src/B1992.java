import java.io.*;

public class B1992 {
	static int arr[][];
	static StringBuilder sb = new StringBuilder();

	static boolean isSame(int n, int x, int y) {
		int flag = arr[x][y];
		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (flag != arr[i][j])
					return false;
			}
		}
		return true;
	}

	static void cut(int n, int x, int y) {
		
		if (isSame(n, x, y)) {
			if (arr[x][y] == 0)
				sb.append("0");
			else
				sb.append("1");
			return;
		}


		sb.append("(");
		cut(n / 2, x, y);
		cut(n / 2, x + n / 2, y);
		cut(n / 2, x, y + n / 2);
		cut(n / 2, x + n / 2, y + n / 2);
		sb.append(")");

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		arr = new int[N][N];
		for (int j = 0; j < N; j++) {
			String str = br.readLine();
			for (int i = 0; i < N; i++) {
				arr[i][j] = str.charAt(i) - '0';
			}
		}

		cut(N, 0, 0);
		System.out.println(sb);

	}

}
