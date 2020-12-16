import java.io.*;
import java.util.*;
public class B2667 {
	
	static int cnt=0;
	static int map[][];
	static int dx[]= {0,0,1,-1};
	static int dy[]= {1,-1,0,0};
	
	public static void DFS(int x,int y) { 
		map[x][y]=0;
		cnt++;
		
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>=0&&nx<map.length&&ny>=0&&ny<map.length&&map[nx][ny]==1) {
				DFS(nx,ny);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		map=new int [n][n];
		for(int i=0;i<n;i++) {
			String str=s.next();
			for(int j=0;j<n;j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		ArrayList <Integer> list=new ArrayList();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j]==1) {
					DFS(i,j);
					list.add(cnt);
					
					cnt=0;
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
