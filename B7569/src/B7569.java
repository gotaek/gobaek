import java.io.*;
import java.util.*;

public class B7569 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		Scanner sc=new Scanner (System.in);
		int y=Integer.parseInt(st.nextToken());
		int x=Integer.parseInt(st.nextToken());
		int z=Integer.parseInt(st.nextToken());
		
		
	    int[] dx = {-1,1,0,0,0,0};
	    int[] dy = {0,0,-1,1,0,0};
	    int[] dz = {0,0,0,0,1,-1};
		
		int map[][][]=new int [z][x][y];
		
		Queue<Integer> qx=new LinkedList();
		Queue<Integer> qy=new LinkedList();
		Queue<Integer> qz=new LinkedList();
		
		for (int i=0;i<z;i++) {
            for (int j=0;j<x;j++) {
            	st=new StringTokenizer(br.readLine()," ");
                for (int k=0;k<y;k++) {
                	map[i][j][k] = Integer.parseInt(st.nextToken());
                    if (map[i][j][k] == 1) {
                    	qz.add(i);
                    	qx.add(j);
						qy.add(k);
                    }
                }
            }
        }

		
		while(!qx.isEmpty()&&!qy.isEmpty()&&!qz.isEmpty()) {
			int x1=qx.poll();
			int y1=qy.poll();
			int z1=qz.poll();
			
			for(int i=0;i<6;i++) {
				int nx=x1+dx[i];
				int ny=y1+dy[i];
				int nz=z1+dz[i];
				
				if(nz>=0 && nz<z && nx>=0 && nx<x && ny>=0 && ny<y && map[nz][nx][ny] == 0)  {
					qx.add(nx);
					qy.add(ny);
					qz.add(nz);
					map[nz][nx][ny]=map[z1][x1][y1]+1;
				}
			}
		}
		
		
		int max=0;
		for(int i=0;i<z;i++) {
			for(int j=0;j<x;j++) {
				for(int k=0;k<y;k++) {
					if(map[i][j][k]==0) {
						System.out.println(-1);
						return;
					}else if(map[i][j][k]>max) {
						max=map[i][j][k];
					}
				}
			}
		}
		
		if(max==1)
			System.out.println(0);
		else
			System.out.println(max-1);
	}
}
