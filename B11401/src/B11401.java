import java.util.Scanner;
public class B11401 {
	static final int p=1000000007;
	static long pow(long a,long b) {
		if(b==0) {
			return 1;
		}if(b%2==1) return (pow(a,b-1)*a)%p;
		long temp=pow(a,b/2)%p;
		return(temp*temp)%p;
	}
	
    static long fac(long n){
        long ret = 1;
        while (n > 1){
            ret = (ret * n) % p;
            n--;
        }
        return ret;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		
		long a = fac(n);
        long b = fac(n - k) * fac(k) % p;
        long result = a * pow(b, p-2) % p;
		System.out.println(result);
	}

}
