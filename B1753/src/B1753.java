import java.io.*;
import java.util.*;

public class B1753 {
	static int visit[];
	static ArrayList<Node> [] list;
	static int distance[];
	static boolean visited[];

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int V=Integer.parseInt(st.nextToken());
		int E=Integer.parseInt(st.nextToken());
		
		list=new ArrayList[V+1];
		for(int i=1;i<=V;i++) {
			list[i]=new ArrayList<>();
		}
		distance=new int[V+1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		visited=new boolean[V+1];
		
		int start=Integer.parseInt(br.readLine());
		distance[start]=0;
		
		for(int i=0;i<E;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int u=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			
			list[u].add(new Node(v,w));
		}
		
		dijkstra(start);
		for(int i=1;i<=V;i++) {
			if(distance[i]==Integer.MAX_VALUE)
				System.out.println("INF");
			else
				System.out.println(distance[i]);
		}
	}
	
	static void dijkstra(int start) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.add(new Node(start,0));
		while(!pq.isEmpty()) {
			Node cur=pq.poll();
			if(visited[cur.idx])
				continue;
			for(Node next:list[cur.idx]) {
				if(distance[next.idx]>distance[cur.idx]+next.w) {
					distance[next.idx]=distance[cur.idx]+next.w;
					pq.add(new Node(next.idx,distance[next.idx]));
				}
			}
		}
		
	}
	
	static class Node implements Comparable<Node>{
		int idx,w;
		Node(int idx,int w){
			this.idx=idx;
			this.w=w;
		}
		
		public int compareTo(Node o) {
			return this.w-o.w;
		}
	}
}
