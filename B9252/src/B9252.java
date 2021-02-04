import java.util.*;
public class B9252 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		char str1[]=sc.nextLine().toCharArray();
		char str2[]=sc.nextLine().toCharArray();
		
		int dp[][]=new int [str1.length+1][str2.length+1];
		
		for(int i=1;i<=str1.length;i++) {
			for(int j=1;j<=str2.length;j++) {
				if(str1[i-1]==str2[j-1]) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}

		Stack<Character> stack=new Stack<Character>();
		int last=dp[str1.length][str2.length];
		System.out.println(last);
		if (last<=0) return;
		for(int i=str2.length;i>=1;i--) {
			for(int j=str1.length;j>=1;j--) {
				if(str2[i-1]==str1[j-1]&&last==dp[j][i]) {

					stack.push(str1[j-1]);
					last--;
					break;
				}
			}

		}
		StringBuilder sb=new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}

}
