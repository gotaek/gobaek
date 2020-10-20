import java.util.Scanner;

public class B3036 {
	public static int GCD(int a, int b) {
		if (a % b == 0)
			return b;
		else
			return GCD(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=1;i<n;i++) {
			
			
			int gcd=GCD(arr[0],arr[i]);
			
			System.out.println(arr[0]/gcd+"/"+arr[i]/gcd);
		}
	}

}
