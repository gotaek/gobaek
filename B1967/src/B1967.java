import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1967 {
	static LinkedList<Node>  list[];
	static int distance[],max,index;
	static boolean visit[];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		list=new LinkedList[10001];
		distance=new int[10001];
		visit=new boolean[10001];
		for(int i = 1; i <= 10000; i++)
            list[i] = new LinkedList<>();
		
		
		for(int i=0;i<N-1;i++) {
			st=new StringTokenizer (br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			list[a].add(new Node(b,c));
			list[b].add(new Node(a,c));
		}

		
		if(N>1) {
			DFS(1,0);
			visit=new boolean[10001];
			distance=new int[10001];
			DFS(index,0);
			System.out.println(max);
		}else {
			System.out.println(0);
		}
		
		
		
	}
	public static void DFS(int node,int weight) {
		visit[node]=true;
		distance[node]=weight;
		
		if(weight>max) {
			max=weight;
			index=node;
		}
		
		for(Node next:list[node]) {
			if(!visit[next.idx]) {
				DFS(next.idx,weight+next.w);
			}
		}
	}
	
	static class Node{
		int idx;
		int w;
		Node(int idx,int w){
			this.idx=idx;
			this.w=w;
		}
	}
}