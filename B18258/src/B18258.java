
import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class B18258 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int last = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String input = st.nextToken();

			if (input.contains("push")) {
				int input2 = Integer.parseInt(st.nextToken());
				last = input2;
				q.offer(input2);
			} else if (input.equals("pop")) {
				Integer output = q.poll();
				if (output == null)
					sb.append("-1 \n");
				else
					sb.append(output + " \n");

			} else if (input.equals("size")) {

				sb.append(q.size() + " \n");
			} else if (input.equals("empty")) {
				if (q.isEmpty()) {
					sb.append("1 \n");
				} else
					sb.append("0 \n");
			} else if (input.equals("front")) {
				if (q.isEmpty()) {
					sb.append("-1 \n");
				} else
					sb.append(q.peek() + " \n");
			} else if (input.equals("back")) {
				if (q.isEmpty()) {
					sb.append("-1 \n");
				} else
					sb.append(last + " \n");

			}
		}
		System.out.println(sb.toString());
	}
}