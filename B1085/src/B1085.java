import java.util.Arrays;
import java.util.Scanner;
public class B1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int x=s.nextInt();
		int y=s.nextInt();
		int w=s.nextInt();
		int h=s.nextInt();
		int arr[]=new int [4];
		
		
		if (x<1||x>(w-1)||y<1||y>(h-1)||x>w||y>h) return;
		arr[0]=x;
		arr[1]=y;
		arr[2]=h-y;
		arr[3]=w-x;
		
		int min=arr[0];
		for (int i=1;i<4;i++) {
			if (min>arr[i]) min=arr[i];
		}
		
		System.out.print(min);
	}

}
