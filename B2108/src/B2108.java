import java.io.*;
import java.util.Arrays;
public class B2108 {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		int flag[]=new int[8001];
		double avg=0,middle=0;
		int cnt=0;
				int mode=0,mode2=0,range=0;
		int flag_max=0,flag_second=0;
		for(int i=0;i<n;i++) {
			int temp=Integer.parseInt(br.readLine());
			arr[i]=temp;
			flag[temp+4000]++;
		}
		if(n==1) {
			System.out.printf("%d\n%d\n%d\n%d", arr[0],arr[0],arr[0],0);
			return;
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			avg+=arr[i];
		}
		avg/=n;
		
		if (n%2==0) {
			middle=(arr[n/2]+arr[n/2+1])/2;
		}else {
			middle=arr[n/2];
		}
		
		for(int i=0;i<8001;i++) {
			
			if (flag[i]>flag_max) {
				flag_max=flag[i];
				mode=i-4000;
			}
			
		}for (int i=0;i<8001;i++) {
			if (flag[i]==flag_max) cnt++;
			if (cnt==2) {
				mode=i-4000;
				break;
			}
		}
		range=arr[n-1]-arr[0];
		
			
		System.out.printf("%d\n%d\n%d\n%d", Math.round(avg),Math.round(middle),mode,range);

		
	}

}
