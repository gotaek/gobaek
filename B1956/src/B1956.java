import java.io.*;
import java.util.*;
public class B1956 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		final int INF=400*10000;
		int v=Integer.parseInt(st.nextToken());
		int e=Integer.parseInt(st.nextToken());
		
		int arr[][]=new int [v+1][v+1];
		
		for(int i=1;i<=v;i++) {
			Arrays.fill(arr[i], INF);
		}
		for(int i=0;i<e;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			arr[a][b]=c;
		}
		
		for(int k=1;k<=v;k++) {
			for(int i=1;i<=v;i++) {
				for(int j=1;j<=v;j++) {
					if(arr[i][j]>arr[i][k]+arr[k][j])
						arr[i][j]=arr[i][k]+arr[k][j];
				}
			}
		}
		

		int result=INF;
		for(int i=1;i<=v;i++) {
			result=Math.min(result,arr[i][i]);
		}
		if(result==INF) System.out.println(-1);
		else System.out.println(result);
	}

}
