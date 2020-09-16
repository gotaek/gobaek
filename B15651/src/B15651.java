import java.io.IOException;
import java.util.StringTokenizer;
import java.io.*;

public class B15651 {
	// main과 dfs 함수에서 공통적으로 사용해야 하므로 이곳에 배열을 생성
	public static boolean checker[];
	public static int arr[];
	public static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		dfs(N, M, 0);
		System.out.print(sb);
	}

	static void dfs(int n, int m, int depth) {
		if (m == depth) {
			for (int i=1;i<m;i++) {
				if (arr[i-1]>arr[i]) return;
			}
			for (int i : arr) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= n; i++) {
			arr[depth] = i;
			dfs(n, m, depth + 1);

		}
	}
}
