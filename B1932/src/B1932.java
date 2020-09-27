import java.util.Scanner;
public class B1932 {
	static int n;
	static int arr[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		arr=new int[n][n];
		int idx=0;
		int maxNum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				arr[idx][j]=s.nextInt();
			}idx++;
		}
		recur(1);
		
		for(int i=0;i<n;i++) {
			if(maxNum<arr[n-1][i])
				maxNum=arr[n-1][i];
		}
		System.out.printf("%d",maxNum);
	}
	static void recur(int depth) {
		if(n==depth) {
			return;
		}
		max(depth);
		recur(depth+1);
	}
	static void max(int m) {
		arr[m][0]+=arr[m-1][0];
		arr[m][m]+=arr[m-1][m-1];
		for(int i=1;i<m;i++) {
			arr[m][i]=Math.max(arr[m][i]+arr[m-1][i-1],arr[m][i]+arr[m-1][i]);
		}
	}
	
}
