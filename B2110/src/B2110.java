import java.util.Scanner;
import java.util.Arrays;
public class B2110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int c=s.nextInt();
		
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		
		int left=1;
		int right=arr[n-1]-arr[0];
		int mid;
		int ans=0;
		int distance=0;
		
		while(left<=right) {
			mid=(left+right)/2;
			int cnt=1;
			int prev=arr[0];
			
			for(int i=0;i<n;i++) {
				distance=arr[i]-prev;
				if(distance>=mid) {
					cnt++;
					prev=arr[i];
				}
			}
			if(cnt>=c) {
				ans=mid;
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		System.out.println(ans);
	
	}
}
