import java.util.Scanner;
public class B2748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		long fib[]=new long[n+1];
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2;i<=n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.printf("%d", fib[n]);
		
		
	}
	

}
