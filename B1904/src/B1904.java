import java.util.Scanner;
public class B1904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==1) {
			System.out.printf("%d", 1);
			return;
		}
		else if(n==2) {
			System.out.printf("%d", 2);
			return;
		}
		int arr[]=new int[n];
		arr[0]=1;
		arr[1]=2;
		
		for(int i=2;i<n;i++) {
			arr[i]=(arr[i-1]+arr[i-2])%15746;
		}
		
		System.out.printf("%d", arr[n-1]);
		
	}

}
