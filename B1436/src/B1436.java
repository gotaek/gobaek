import java.util.Scanner;

public class B1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n<1||n>10000) return;
		int list[] = new int[10001];
		int idx = 1;

		for (int i = 666; i <= 10000000 ; i++) {
			int temp = i;
			int cur = 0;
			int pre = 0;
			int prep=0;
			int cnt = 0;
			while (i != 0) {
				prep=pre;
				pre = cur;
				cur = i % 10;
				if (pre == 6 && cur == 6&&prep==6)
					
					cnt++;
				i /= 10;
			}
			i = temp;
			try {
				if (cnt >= 1) {
					list[idx] = i;
					idx++;
					//System.out.printf("%d \n",i);
				}
			} catch (Exception e) {
				break;
			}

		}
		System.out.printf("%d \n", list[n]);

	}

}
