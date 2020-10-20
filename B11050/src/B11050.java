import java.util.Scanner;
public class B11050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		
		int n_fac=1;
		for(int i=n;i>=1;i--) {
			n_fac*=i;
		}
		int k_fac=1;
		for(int i=k;i>=1;i--) {
			k_fac*=i;
		}
		int nk_fac=1;
		for(int i=n-k;i>=1;i--) {
			nk_fac*=i;
		}
		
		System.out.println(n_fac/(k_fac*nk_fac));

	}

}
