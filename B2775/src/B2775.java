import java.util.Scanner;

public class B2775 {
	public static void main (String []args) {
		Scanner s=new Scanner (System.in);
		int itr=s.nextInt();
		int ans[]=new int[itr];
		
		int t=0;
		while (itr>t) {
			int k=s.nextInt();
			int n=s.nextInt();
			
			if ((1 > k&& k> 14)||(1 > n&&n > 14)) {
				return ;
			}
			
			
			int arr[][]=new int[n][k+1];
			for (int i=0;i<k+1;i++) {
				arr[0][i]=1;
			}
			
			for (int i=1;i<n;i++) {
				arr[i][0]=i+1;
			}
			
			for (int i=1;i<n;i++) {
				for (int j=1;j<k+1;j++) {
					arr[i][j]=arr[i][j-1]+arr[i-1][j];
				}
			}
			ans[t]=arr[n-1][k];
			
			t++;
		}
			
		for (int i=0;i<itr;i++) {
			System.out.printf("%d \n", ans[i]);
		}
		
		
	}
}
