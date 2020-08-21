import java.util.*;

public class B1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		int i = 0;
		int count = 0;
		

		 while (i < t) {
			int socount=0;
			int num = s.nextInt();

			for (int j = 1; j <=num; j++) {
				
				if (num % j == 0) {
					socount++;
				}
				
			}if (socount==2) count++;
			
			
			i++;
		}

		System.out.print(count);

	}

}
