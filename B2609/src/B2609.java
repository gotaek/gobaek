import java.util.Scanner;
public class B2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int i=2; int max=1;
		while(i<=Math.min(a, b)) {
			if(a%i==0&&b%i==0) {
				a=a/i;
				b=b/i;
				max*=i;
			}else {
				i++;
			}
		}
		int min=max*a*b;
		
		System.out.println(max);
		System.out.println(min);
	}

}
