package B1193;

import java.util.Scanner;

public class B1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 2;
		int count = 0;
		int a, b, result;

		while (i <= n) {

			if ((i % 2) == 1) {
				for (int j = 1; j < i; j++) {
					a = j;
					b = i - j;
					count++;
					 if (n == count) {
					System.out.printf("%d/%d ", a, b);
					 return;
					 }
				}
				i++;
			} 
			
			if ((i % 2) == 0) {
				for (int k = 1; k < i; k++) {
					b = k;
					a = i - k;
					count++;
					 if (n == count) {
					System.out.printf("%d/%d ", a, b);
					return;
					}
				}
			}

			i++;
		}

	}

}
