import java.io.*;
public class B2749 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		long t=Long.parseLong(br.readLine());
		int mod=1000000;
		int p=1500000;
		
		t=t%p;
		
		long fib[]=new long [p+1];
		
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2;i<=p;i++) {
			fib[i]=fib[i-1]+fib[i-2];
			fib[i]%=mod;
		}
		
		System.out.println(fib[(int)t]);
		
	}

}
