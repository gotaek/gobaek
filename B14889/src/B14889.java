import java.io.*;
import java.util.StringTokenizer;

public class B14889 {
	static int N;
	static int depth;
	static int stat[][];
	static int start[], link[];
	static int min = 100000000;
	static boolean arr[];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		stat = new int[N][N];
		depth = N / 2;
		start = new int[depth];
		link = new int[depth];
		arr = new boolean[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				stat[i][j] = Integer.parseInt(s.nextToken());
			}
		}
		divide(-1, 0);
		System.out.printf("%d", min);

	}

	public static void divide(int num, int n) {
		if (depth == n) {

			statCalculator();

			return;
		}
		for (int i = 0; i < N; i++) {
			if (!arr[i] && num < i) {
				arr[i] = true;
				start[n] = i;
				divide(i, n + 1);
				arr[i] = false;
			}
		}
	}

	public static void statCalculator() {
		int startScore = 0, linkScore = 0;
		int idx = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] == false) {
				link[idx] = i;
				idx++;
			}
		}
		for (int i : start) {
			for (int j : start) {
				startScore += stat[i][j];
			}
		}
		for (int i : link) {
			for (int j : link) {
				linkScore += stat[i][j];
			}
		}
		int temp = Math.abs(startScore - linkScore);
		min = temp < min ? temp : min;

	}

}
