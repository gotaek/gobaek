import java.io.*;
import java.util.*;

public class B1260 {
	static int map[][];
	static boolean[] visited;
	static int n,m,v;
	
	static void DFS(int i) {
		visited[i]=true;
		System.out.printf("%d ",i);
		
		for (int j=1;j<=n;j++) {
			if(map[i][j]==1&&visited[j]==false) {
				DFS(j);
			}
		}
		
	}
	static void BFS(int i) {
		Queue<Integer> q=new LinkedList();
		q.offer(i);
		visited[i]=true;
		
		while(!q.isEmpty()) {
			int temp=q.poll();
			System.out.printf("%d ", temp);
			
			for(int j=1;j<=n;j++) {
				if(map[temp][j]==1&&visited[j]==false) {
					q.offer(j);
					visited[j]=true;
					
				}
			}
		}
		
	}
	

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		v=Integer.parseInt(st.nextToken());
		map=new int[n+1][n+1];
		visited=new boolean[n+1];
		
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			map[a][b]=map[b][a]=1;
			
		}
		DFS(v);
		System.out.println();
		Arrays.fill(visited, false);
		BFS(v);
	}

}
