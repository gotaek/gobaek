import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class B1920 {
	static int A[];
	static int B[];
	static int n;
	static int BinarySearch(int x) {

		int pl=0;
		int pr=n-1;
		int pc;
		
		while(pl<=pr) {
			pc=(pl+pr)/2;
			if(A[pc]==x) {
				return 1;
			}else if(x>A[pc]) {
				pl=pc+1;
			}else {
				pr=pc-1;
			}
		}return 0;
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		A=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());		
		for(int i=0;i<n;i++) {
			A[i]=Integer.parseInt(st.nextToken());
		}
		int m=Integer.parseInt(br.readLine());
		
		B=new int[m];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			B[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);

		for(int i=0;i<m;i++) {
			System.out.println(BinarySearch(B[i]));
		}
	}

}
