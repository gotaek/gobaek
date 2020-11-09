import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1629 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a, b, c;
		a = Long.parseLong(st.nextToken());
		b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());

		System.out.println(recur(a % c, b, c));





	}

	static long recur(long a, long b, long c) {
		if (b == 1)
			return a;
		else {
			long temp = recur(a, b / 2, c) % c;
			if (b % 2 == 1) {

				return ((temp * temp) % c * a) % c;
			} else {

				return (temp * temp) % c;
			}
		}
	}

}
