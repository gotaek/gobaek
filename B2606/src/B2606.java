import java.io.*;
import java.util.*;

public class B2606 {
	static int map[][];
	static boolean[] visited;
	static int n,m,v;
	static int cnt;
	
	static void DFS(int i) {
		visited[i]=true;
		cnt++;
		
		for (int j=1;j<=n;j++) {
			if(map[i][j]==1&&visited[j]==false) {
				DFS(j);
			}
		}
		
	}
	

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st;
		n=Integer.parseInt(br.readLine());
		m=Integer.parseInt(br.readLine());

		map=new int[n+1][n+1];
		visited=new boolean[n+1];
		
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			map[a][b]=map[b][a]=1;
			
		}
		DFS(1);
		System.out.println(cnt-1);

	}

}
