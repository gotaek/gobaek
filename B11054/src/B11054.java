import java.util.Scanner;
public class B11054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int dp[][]=new int [2][n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			dp[0][i]=1;
			for(int j=0;j<n;j++) {
				if(arr[j]<arr[i]&&dp[0][j]+1>dp[0][i]) {
					dp[0][i]=dp[0][j]+1;
				}
			}
		}
		
		for(int i=n-1;i>-1;i--) {
			dp[1][i]=1;
			for(int j=n-1;j>i;j--) {
				if(arr[j]<arr[i]&&dp[1][j]+1>dp[1][i]) {
					dp[1][i]=dp[1][j]+1;
				}
			}
		}
		
		
		int max=-1;
		for(int i=0;i<n;i++) {
			max=max<dp[0][i]+dp[1][i]?dp[0][i]+dp[1][i]:max;
		}
		System.out.println(max-1);
	}

}
