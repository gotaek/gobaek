import java.util.*;

public class B1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j, m = sc.nextInt(), n = sc.nextInt();
		int a[] = new int[n + 1];
		
		for (i = 0; i <= n; i++) a[i] = 0;
		a[1] = 1;//1은 소수가 아닌것을 표현, 1은 소수가 아니기 때문에  1
		
		for (i = 2; i <= n; i++)
			for (j = 2; i*j <= n; j++)
				a[i * j] = 1;

		for (i = m; i <= n; i++) 
			if(a[i] != 1) 
				System.out.println(i);
		sc.close();
	}
}