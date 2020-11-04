import java.util.StringTokenizer;
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class B5430 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		label: for (int i = 0; i < T; i++) {
			String func = br.readLine();
			int n = Integer.parseInt(br.readLine());

			Deque<Integer> q = new ArrayDeque<>();
			boolean is_front = true;

			StringTokenizer st = new StringTokenizer(br.readLine(), ",|[|]");
			int cnt = 0;
			while (st.hasMoreTokens()) {
				q.offer(Integer.parseInt(st.nextToken()));
				cnt++;
			}
			if (cnt != n) {
				sb.append("error\n");
				continue label;
			}

			for (int j = 0; j < func.length(); j++) {
				if (func.charAt(j) == 'R') {
					is_front = !is_front;

				} else if (func.charAt(j) == 'D') {
					if (q.isEmpty()) {
						sb.append("error\n");
						continue label;
					}
					if (is_front) {
						q.pollFirst();
					} else {
						q.pollLast();
					}

				}

			}
			sb.append("[");
			if (is_front) {
				while (q.size() > 1)
					sb.append(q.pollFirst() + ",");

			} else {

				while (q.size() > 1)
					sb.append(q.pollLast() + ",");

			}
			if (q.size() != 0)
				sb.append(q.getFirst());
			sb.append("]\n");
		}
		System.out.println(sb.toString());
	}
}
