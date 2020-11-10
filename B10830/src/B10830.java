import java.io.*;
import java.util.StringTokenizer;

public class B10830 {
	static int n;

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		n=Integer.parseInt(st.nextToken());
		Long m=Long.parseLong(st.nextToken());
		
		int result[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<n;j++) {
				result[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		result=pow(result, m);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(result[i][j]%1000+" ");
			}System.out.println();
		}
	}
	static int[][] multiplication(int arr_a[][],int arr_b[][]){
		int res[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int result=0;
				for(int k=0;k<n;k++) {
					result+=arr_a[i][k]*arr_b[k][j];
				}
				res[i][j]=result%1000;
			}
		}
		return res;
	}
	static int[][] pow(int arr[][],long p){
		if(p==1) {
			return arr;
		}else if(p%2==0) {  
			int [][]temp=pow(arr,p/2);
			return multiplication(temp,temp);
		}else {
			return multiplication(pow(arr,p-1),arr);
		}
		
	}

}
