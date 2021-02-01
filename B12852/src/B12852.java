import java.util.Scanner;
public class B12852 {
	static Integer dp[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		int n=sc.nextInt();
		dp=new Integer[n+1];
		dp[0]=0;dp[1]=0;
		System.out.println(recur(n));
		
		print(n);

	}
	static void print(int num) {
		if(num==0) return;
		System.out.printf("%d ",num);
		
		if(num-1>=0&&dp[num]-1==dp[num-1]) {
			print(num-1);
		}else if(num%3==0&&dp[num]-1==dp[num/3]) {
			print(num/3);
		}else if(num%2==0&&dp[num]-1==dp[num/2]) {
			print(num/2);
		}
		return;
	}
	
	static int recur(int n) {
		if( dp[n]==null) {
			if(n%6==0) {
				dp[n]=Math.min(recur(n-1), Math.min(recur(n/2), recur(n/3)))+1;
			}else if(n%2==0) {
				dp[n]=Math.min(recur(n/2), recur(n-1))+1;
			}else if(n%3==0) {
				dp[n]=Math.min(recur(n/3), recur(n-1))+1;
			}else {
				dp[n]=recur(n-1)+1;
			}
		}

		return dp[n];
	}

}
