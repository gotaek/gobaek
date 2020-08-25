import java.util.Scanner;

public class B9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean arr[] = new boolean[10001];
		int t = s.nextInt();
		int iter = 0;
		for (int i = 2; i <= 10000; i++) {
			for (int j = 2; i * j <= 10000; j++) {
				arr[i * j] = true;
			}
		}

		while (iter < t) {
			int num = s.nextInt();
			if (num<4||num>10000) return;
			int a = 0, b = 0;
			int pre_a=a, pre_b=b;
			int d = 0;
			for (int i = 2; i < num; i++) {
				pre_a = a;
				pre_b = b;
				if (!arr[i]&&!arr[num-i]) {
					a=i;
					b=num-i;
					d = b - a;
					if (d < 0)
						break;
				}

			}
			System.out.printf("%d %d \n", pre_a, pre_b);
			iter++;
		}

	}

}
