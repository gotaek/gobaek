import java.util.Scanner;
public class B1300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int k=s.nextInt();

		long min=1,max=k;
		long mid;
		long ans=0;
		while(min<=max) {
			mid=(min+max)/2;
			int cnt=0;
			for(int i=1;i<=n;i++) {
				cnt+=Math.min(mid/i, n);
			}
			if(cnt>=k) {
				ans=mid;
				max=mid-1;
			}else {
				min=mid+1;
			}
		}
		System.out.printf("%d",ans);
	}
}
