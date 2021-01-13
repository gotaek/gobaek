import java.io.*;
import java.util.*;

public class B1504 {
	static int N,E;
	static int distance[];
	static ArrayList<Node> [] list;
	static final int INF=200000000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		E=Integer.parseInt(st.nextToken());
		
		list=new ArrayList[N+1];
		
		for(int i=1;i<=N;i++) {
			list[i]=new ArrayList<>();
		}
		distance=new int[N+1];
		
		for(int i=0;i<E;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			list[a].add(new Node(b,c));
			list[b].add(new Node(a,c));
		}
		st=new StringTokenizer(br.readLine()," ");
		int v1=Integer.parseInt(st.nextToken());
		int v2=Integer.parseInt(st.nextToken());
		
		int res1=0;
		res1+=dijkstra(1,v1);
		res1+=dijkstra(v1,v2);
		res1+=dijkstra(v2,N);
		
		int res2=0;
		res2+=dijkstra(1,v2);
		res2+=dijkstra(v2,v1);
		res2+=dijkstra(v1,N);
		
		int ans=(res1>=INF&&res2>=INF)?-1:Math.min(res1, res2);
		System.out.println(ans);
		
	}
	static int dijkstra(int start,int end) {
		
		Arrays.fill(distance, INF);
		
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.add(new Node(start,0));
		distance[start]=0;
		
		while(!pq.isEmpty()) {
			Node cur=pq.poll();
			
			for(Node next:list[cur.idx]) {
				if(distance[next.idx]>distance[cur.idx]+next.w) {
					distance[next.idx]=distance[cur.idx]+next.w;
					pq.add(new Node(next.idx,distance[next.idx]));
				}
			}
		}
		return distance[end];
	}
	
	static class Node implements Comparable<Node>{
		int idx,w;
		Node(int idx,int w){
			this.idx=idx;
			this.w=w;
		}
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.w-o.w;
		}
		
	}

}
