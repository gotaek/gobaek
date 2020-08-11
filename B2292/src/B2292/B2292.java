package B2292;

import java.util.Scanner;

public class B2292 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int min, max = 1;
		int i = 1;

		if (n == 1)
			System.out.printf("%d", 1);
		while (n<max) {
			
			max = max + i * 6;
			min = max - i * 6 + 1;

			if (n >= min && n <= max) {
				System.out.printf("%d", i + 1);
				return;
			}
			i++;
		}

	}

}
