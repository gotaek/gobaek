import java.util.Scanner;
public class B4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		while (true) {
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			
			if (a==0&&b==0&&c==0) return;
			
			if (b>=a&&b>=c) {
				int temp=0;
				temp=a;
				a=b;
				b=temp;
			}
			if (c>=a&&c>=b) {
				int temp=0;
				temp=a;
				a=c;
				c=temp;
			}
			
			if (Math.pow(a,2)==Math.pow(b, 2)+Math.pow(c,2)) {
				System.out.println("right");
			}else System.out.println("wrong");
		}
	}

}
