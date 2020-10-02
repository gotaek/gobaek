import java.util.Scanner;
public class B11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int arr[]=new int [n];
		int dp[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]&&dp[i]<dp[j]+1) {
					dp[i]=dp[j]+1;
				}
			}
		}
		
		int max = -1;
		for(int i = 0; i < n; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);
	}

}
