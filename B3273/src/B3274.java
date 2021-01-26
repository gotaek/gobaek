import java.io.*;
import java.util.*;
public class B3274 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int x=Integer.parseInt(br.readLine());
		
		int left=0;
		int right=n-1;
		int cnt=0;
		
		while(left<right) {
			if(arr[left]+arr[right]==x) {
				cnt++;
				left++;
				right--;
				
			}else if (arr[left]+arr[right]<x) {
				left++;
			}else if(arr[left]+arr[right]>x) {
				right--;
			}
		}
		System.out.println(cnt);
		
		
		
	}

}
