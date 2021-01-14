import java.util.*;

import java.io.*;

public class B9370 {
	static int n, m, t;
	static int s, g, h;
	static ArrayList<Node>[] list;
	static int dist[];
	static boolean visit[];
	static ArrayList<Integer> answer;
	static final int INF=10000000;
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			t = Integer.parseInt(st.nextToken());

			dist = new int[n+1];
			visit=new boolean [n+1];
			Arrays.fill(dist,INF);
			list = new ArrayList[n + 1];

			for (int k = 1; k <= n; k++) {
				list[k] = new ArrayList<>();
			}

			st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());

			for (int j = 1; j <=m; j++) {
				
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				if ((a == g && b == h) || (b == g && a == h)) {
					list[a].add(new Node(b, d * 2 - 1));
					list[b].add(new Node(a, d * 2 - 1));
				} else {
					list[a].add(new Node(b, d * 2));
					list[b].add(new Node(a, d * 2));
				}
			}

			answer=new ArrayList<>();
			for (int x = 0; x < t; x++) {
				int a = Integer.parseInt(br.readLine());
				answer.add(a);
			}

			dijkstra(s);
			
			Collections.sort(answer);
			for (int num : answer) {
				if (dist[num] % 2 == 1)
					bw.write(num+" ");
			}
			bw.write("\n");

		}

        br.close();
        bw.close();
	}

	static void dijkstra(int s) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.add(new Node(s,0));
		dist[s]=0;
		
		while(!pq.isEmpty()) {
			Node cur=pq.poll();
			
			if(visit[cur.idx]) continue;
			
			visit[cur.idx]=true;
			
			for(Node next:list[cur.idx]) {
				if(visit[cur.idx]&&dist[next.idx]>next.w+dist[cur.idx]) {
					dist[next.idx]=next.w+dist[cur.idx];
					pq.add(new Node(next.idx,dist[next.idx]));
				}
			}
		}
	}

	static class Node implements Comparable<Node> {
		int idx;
		int w;

		Node(int idx, int w) {
			this.idx = idx;
			this.w = w;
		}

		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.w - o.w;
		}
	}

}
