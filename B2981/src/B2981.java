import java.util.Arrays;
import java.util.Scanner;


public class B2981 {
	/* 유클리드 호제법 */
	public static int GCD(int a,int b) {
		if(a%b==0) return b;
		else return GCD(b,a%b);
	}
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int v[]=new int[n];
		for(int i=0;i<n;i++) {
			v[i]=s.nextInt();
		}
		Arrays.sort(v);//음수가 나오는 것을 방지하기 위해 정렬
		
		/* 차이들의 최대공약수 구하기 */
		int val=v[1]-v[0];
		for(int i=2;i<n;i++) {
			val=GCD(val,v[i]-v[i-1]);
		}
		
		/* 최대공약수의 약수 구하기 */
		for(int i=2;i<=val;i++) {
			if(val%i==0) System.out.println(i);
		}

	}

}
