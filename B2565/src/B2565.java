import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
public class B2565 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int dp[]=new int[N];
		int wire[][]=new int[N][2];
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				wire[i][j]=s.nextInt();
			}
		}
		Arrays.sort(wire,new Comparator<int[]>(){
			@Override
			public int compare(int []o1,int[]o2) {
				return o1[0]-o2[0];
			}
		});
		
		for(int i=0;i<N;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(wire[i][1]>wire[j][1]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int max=-1;
		for(int i=0;i<N;i++) {
			max=max<dp[i]?dp[i]:max;
		}
		
		System.out.println(N-max);
		
	}

}
