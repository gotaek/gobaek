import java.util.Scanner;

public class B2004 {
	static long cnt_five(long n) {
		long cnt=0;
		for(long i=5;i<=n;i*=5) {
			cnt+=n/i;
		}
		return cnt;
	}
	static long cnt_two(long n) {
		long cnt=0;
		for(long i=2;i<=n;i*=2) {
			cnt+=n/i;
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		long m=s.nextInt();
		long n=s.nextInt();
		long two=0,five=0;
		
		two=cnt_two(m);
		five=cnt_five(m);

		two-=cnt_two(n);
		five-=cnt_five(n);
		
		two-=cnt_two(m-n);
		five-=cnt_five(m-n);
		
		System.out.println(Math.min(two,five));
	}

}
