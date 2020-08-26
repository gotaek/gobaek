import java.util.Scanner;
public class B3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int xa[]=new int [3];
		int ya[]=new int [3];
		int x=0,y=0;
		for (int i=0;i<3;i++) {
			xa[i]=s.nextInt();
			ya[i]=s.nextInt();
			
			if (xa[i]<1||xa[i]>1000||ya[i]<1||ya[i]>1000) return;
		}
		
		if (xa[0]==xa[1]) x=xa[2];
		else if (xa[0]==xa[2]) x=xa[1];
		else if (xa[1]==xa[2]) x=xa[0];
		
		if (ya[0]==ya[1]) y=ya[2];
		else if (ya[0]==ya[2]) y=ya[1];
		else if (ya[1]==ya[2])  y=ya[0];
		
		System.out.printf("%d %d",x,y);
		
		
	}

}
