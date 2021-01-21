import java.io.*;
import java.util.StringTokenizer;
public class B11404 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		final int INF=987654321;
		int n=Integer.parseInt(br.readLine());
		int arr[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) arr[i][j]=0;
				else arr[i][j]=INF;
			}
		}
		
		int m=Integer.parseInt(br.readLine());
		
		for (int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			if(arr[a][b]<c) continue;
			arr[a][b]=c;
		}
		
		
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(arr[i][k]+arr[k][j]<arr[i][j])
						arr[i][j]=arr[i][k]+arr[k][j];
				}
			}
		}
		StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {

                if (arr[i][j] == INF) {
                    arr[i][j] = 0;
                }
 
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
	}

}
