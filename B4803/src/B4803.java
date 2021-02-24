import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class B4803 {
	static int n;
	static int m;
	static boolean visit[];
	static ArrayList<Integer> graph[];


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = 1;
		while (true) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			graph=new ArrayList[n+1];
			visit=new boolean[n+1];
			int cnt=0;
			if (n == 0 && m == 0)
				break;
			for (int i = 1; i <= n; i++) {
				graph[i] = new ArrayList<>();
			}
			for (int i = 1; i <= m; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				graph[a].add(b);
				graph[b].add(a);
			}

			for (int i = 1; i <= n; i++) {
				if (!visit[i]) {
					cnt += findTree(i);
				}
			}

			if (cnt == 1)
				sb.append("Case " + T + ": There is one tree.\n");
			else if (cnt == 0)
				sb.append("Case " + T + ": No trees.\n");
			else
				sb.append("Case " + T + ": A forest of " + cnt + " trees.\n");
			T++;

		}
		System.out.println(sb.toString());
	}

	static int findTree(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		int node = 0;
		int edge = 0;
		while (!q.isEmpty()) {
			int cur=q.poll();
			visit[cur]=true;
			node+=1;
			
			for (int next : graph[cur]) {
				edge++;
				if (!visit[next]) {
					
					q.offer(next);
				}
			}
		}
		return edge/2 + 1 == node ? 1 : 0;
	}

}
