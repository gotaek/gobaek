import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;
public class B14002 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		int dp[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]&&dp[j]+1>dp[i])
					dp[i]=dp[j]+1;
			}
		}
		int max = -1;
		for(int i = 0; i < n; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);

		Stack<Integer> stack=new Stack<>();
		int last=max;
		for(int i=n-1;i>=0;i--) {
			if(last==dp[i]) {
				stack.push(arr[i]);
				last--;
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop()+" ");
		}
		System.out.println(sb.toString());
	}

}
