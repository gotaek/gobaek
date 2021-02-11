import java.io.*;
import java.util.*;
public class B11779 {
	static ArrayList<Node> [] list;
	static int distance[];
	static int nextVisit[];
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		int N=Integer.parseInt(br.readLine());
		list=new ArrayList[N+1];
		distance=new int[N+1];
		nextVisit=new int[N+1];
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

		sb.append(distance[end]+"\n");
		Stack<Integer> stack=new Stack<>();

		stack.push(end);
		while(nextVisit[end]!=0) {
			stack.push(nextVisit[end]);
			end=nextVisit[end];
			
		}

		sb.append(stack.size()+"\n");
		while(!stack.isEmpty()) {
			sb.append(stack.pop()+" ");
		}
		System.out.println(sb.toString());
		
		
	}
	static void Dijkstra(int start) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.add(new Node(start,0));
		while(!pq.isEmpty()) {
			Node cur=pq.poll();
			for(Node next:list[cur.idx]) {
				if(distance[next.idx]>distance[cur.idx]+next.w) {
					distance[next.idx]=distance[cur.idx]+next.w;
					nextVisit[next.idx]=cur.idx;
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
