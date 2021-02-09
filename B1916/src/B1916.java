import java.io.*;
import java.util.*;
public class B1916 {
	static ArrayList<Node> [] list;
	static int distance[];
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		list=new ArrayList[N+1];
		distance=new int[N+1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		
		for(int i=1;i<=N;i++) {
			list[i]=new ArrayList<Node>();
		}
		int M=Integer.parseInt(br.readLine());
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			list[a].add(new Node(b,c));
		}
		st=new StringTokenizer(br.readLine()," ");
		int start=Integer.parseInt(st.nextToken());
		distance[start]=0;
		int end=Integer.parseInt(st.nextToken());
		
		Dijkstra(start);
		System.out.println(distance[end]);
		
	}
	static void Dijkstra(int start) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.add(new Node(start,0));
		while(!pq.isEmpty()) {
			Node cur=pq.poll();
			for(Node next:list[cur.idx]) {
				if(distance[next.idx]>distance[cur.idx]+next.w) {
					distance[next.idx]=distance[cur.idx]+next.w;
					pq.add(new Node(next.idx,distance[next.idx]));
				}
			}
		}
	}
	static class Node implements Comparable<Node>{
		int idx;
		int w;
		Node(int idx,int w){
			this.idx=idx;
			this.w=w;
		}
		public int compareTo(Node o){
			return this.idx-o.idx;
		}
	}

}
