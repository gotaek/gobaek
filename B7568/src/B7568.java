import java.util.Scanner;

public class B7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*
		 * int t = s.nextInt(); int x[] = new int[t]; int y[] = new int[t]; int f[] =
		 * new int[t]; int i = 0; int max = 0; for (int k = 0; k < t; k++) { f[k] = 0; }
		 * if (t < 2 || t > 50) return; while (i < t) { x[i] = s.nextInt(); y[i] =
		 * s.nextInt(); if (x[i] < 10 || y[i] < 10 || x[i] > 200 || y[i] > 200) return;
		 * 
		 * i++; } i = 1; while (i <= t) {
		 * 
		 * int pre = max;
		 * 
		 * for (int j = 0; j < t; j++) { if (f[j] == 0) { max = j; break; }
		 * 
		 * } for (int j = 0; j < t; j++) {
		 * 
		 * if ((x[max] < x[j] && y[max] < y[j]) && f[j] == 0) { max = j; } }
		 * 
		 * if ((x[max] < x[pre] && y[max] > y[pre])) f[max] = f[pre]; else if ((x[max] >
		 * x[pre] && y[max] < y[pre])) f[max] = f[pre]; else f[max] = i; i++; }
		 * 
		 * for (int k = 0; k < t; k++) { System.out.printf("%d ", f[k]); }
		 */

		int t = s.nextInt();
		int x[] = new int[t];
		int y[] = new int[t];
		int f[] = new int[t];
		if (t < 2 || t > 50)
			return;

		int n = 0;

		while (n < t) {
			
			x[n] = s.nextInt();
			y[n] = s.nextInt();
			if (x[n] < 10 || y[n] < 10 || x[n] > 200 || y[n] > 200)
				return;
			n++;
		}
		for (int i = 0; i < t; i++) {
			int cnt=0;
			for (int j = 0; j < t; j++) {
				if ((x[i] < x[j] && y[i] < y[j]))
					cnt++;
			}
			f[i] = cnt+1;
		}
		for (int k = 0; k < t; k++) {
			System.out.printf("%d ", f[k]);
		}

	}

}
