import java.util.*;
import java.io.*;
public class B2470 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int pl=0;
		int pr=n-1;
		int result=Integer.MAX_VALUE;
		int answer1=0,answer2=0;
		while(pl<pr) {
			int sum=arr[pl]+arr[pr];
			if (Math.abs(sum)<Math.abs(result)) {
				result=sum;
				answer1=arr[pl];
				answer2=arr[pr];
			}
			if(sum<=0) {
				pl++;
			}else if(sum>0) {
				pr--;
			}
		}
		System.out.printf("%d %d",answer1,answer2);
	}

}
