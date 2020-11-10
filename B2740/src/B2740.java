import java.io.*;
import java.util.StringTokenizer;
public class B2740 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int a_row=Integer.parseInt(st.nextToken());
		int a_col=Integer.parseInt(st.nextToken());
		
		int arr_a[][]=new int[a_row][a_col];
		for(int i=0;i<a_row;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<a_col;j++) {
				arr_a[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		st=new StringTokenizer(br.readLine()," ");
		int b_row=Integer.parseInt(st.nextToken());
		int b_col=Integer.parseInt(st.nextToken());
		int arr_b[][]=new int[b_row][b_col];
		for(int i=0;i<b_row;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<b_col;j++) {
				arr_b[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int res[][]=new int[a_row][b_col];
		for(int i=0;i<a_row;i++) {
			for(int j=0;j<b_col;j++) {
				int result=0;
				for(int k=0;k<a_col;k++) {
					result+=arr_a[i][k]*arr_b[k][j];
				}
				res[i][j]=result;
			}
		}
		for(int i=0;i<a_row;i++) {
			for(int j=0;j<b_col;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
