import java.io.*;
import java.util.*;

public class B7576 {

	
	static int dx[]= {1,-1,0,0};
	static int dy[]= {0,0,1,-1};
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int m=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		
		int map[][]=new int [n][m];
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		Queue<Integer> qx=new LinkedList();
		Queue<Integer> qy=new LinkedList();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==1) {
					qx.add(i);
					qy.add(j);
				}
			}
		}
		
		while(!qx.isEmpty()&&!qy.isEmpty()) {
			int x=qx.poll();
			int y=qy.poll();
			
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				
				if(nx>=0&&nx<n&&ny>=0&&ny<m&&map[nx][ny]==0) {
					qx.add(nx);
					qy.add(ny);
					map[nx][ny]=map[x][y]+1;
				}
			}
		}
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==0) {
					System.out.println(-1);
					return;
				}else if(map[i][j]>max) {
					max=map[i][j];
				}
			}
		}
		if(max==1)
			System.out.println(0);
		else
			System.out.println(max-1);
	}
}
