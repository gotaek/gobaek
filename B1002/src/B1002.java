import java.util.Scanner;

public class B1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int i = 0;
		while (i < t) {
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int r1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int r2 = s.nextInt();

			double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			if (d == 0) {
				if (r1 == r2) {
					System.out.printf("%d\n", -1);

				} else {
					System.out.printf("%d\n", 0);

				}
			} else {
				if (d > r1 + r2 || d < r1 || d < r2) {
					System.out.printf("%d\n", 0);

				} else if (r1 - r2 == d || r2 - r1 == d || r1 + r2 == d) {
					System.out.printf("%d\n", 1);

				} else if (r1 + r2 > d) {
					System.out.printf("%d\n", 2);

				}
			}
			i++;

		}

	}

}
