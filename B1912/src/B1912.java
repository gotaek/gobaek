
import java.util.Scanner;
public class B1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int dp[]=new int[n];
		dp[0]=arr[0];
		int max=arr[0];
		for(int i=1;i<n;i++) {
			dp[i]=Math.max(dp[i-1]+arr[i], arr[i]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
