import java.util.Scanner;
public class B10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int t=s.nextInt();
		String arr[]=new String [t];
		for (int i=0;i<t;i++) {
			int h=s.nextInt();
			int w=s.nextInt();
			int n=s.nextInt();
			int x=0,y=0;
			if (w*h<n) return;
			
			if (n%h==0) {
				x=h;
				y=n/h;
			}
			else {
				x=n%h;
				y=n/h+1;
			}
			
			String xx = Integer.toString(x);
			String yy = Integer.toString(y);
			
			if (y<10) {
				arr[i]=xx+"0"+yy;
			}
			else arr[i]=xx+yy;
			
		}
		
		for (int i=0;i<t;i++){
			System.out.println(arr[i]);
		}
	}
}
