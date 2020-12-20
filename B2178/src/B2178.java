
import java.util.*;
import java.io.*;

public class B2178 {
	static int n,m;
	static int map[][];
	static boolean visit[][];
	static int dx[]= {1,-1,0,0};
	static int dy[]= {0,0,1,-1};
	
	public static void BFS(int x,int y) {
		Queue<Integer> qx=new LinkedList();
		Queue<Integer> qy=new LinkedList();
		
		
		qx.add(x);
		qy.add(y);

		while(!qx.isEmpty()&&!qy.isEmpty()) {
			x=qx.poll();
			y=qy.poll();
			visit[x][y]=true;

			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				
				if(nx>=0&&nx<n&&ny>=0&&ny<m&&map[nx][ny]==1&&visit[nx][ny]==false) {
					qx.add(nx);
					qy.add(ny);
					visit[nx][ny]=true;
					map[nx][ny]=map[x][y]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		StringTokenizer st=new StringTokenizer (br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		map=new int[n][m];
		visit=new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			String str=br.readLine();
			for(int j=0;j<m;j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		BFS(0,0);

		System.out.println(map[n-1][m-1]);
	}
}
