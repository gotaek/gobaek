import java.io.*;
import java.util.StringTokenizer;
public class B1012 {
	static int m;
	static int n;
	static int map[][];
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};

	
	static void DFS(int x,int y) {
		map[x][y]=0;
		
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx<m&&nx>=0&&ny<n&&ny>=0&&map[nx][ny]!=0) {
				DFS(nx,ny);
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st;
		int t=Integer.parseInt(br.readLine());
		int iter=0;
		while(iter<t) {
			st=new StringTokenizer(br.readLine()," ");
			m=Integer.parseInt(st.nextToken());
			n=Integer.parseInt(st.nextToken());
			map=new int [m][n];
			int k=Integer.parseInt(st.nextToken());
			
			for(int i=0;i<k;i++) {
				st=new StringTokenizer(br.readLine()," ");
				map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]++;
			}
			int cnt=0;
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(map[i][j]==1) {
						DFS(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			
			iter++;
		}
	}

}
