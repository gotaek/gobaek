import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
import java.util.Deque;


public class B10866{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Deque<Integer> q = new ArrayDeque<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
	
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String input = st.nextToken();
			if (input.contains("push_front")) {
				int input2 = Integer.parseInt(st.nextToken());
				q.offerFirst(input2);
			}else if (input.contains("push_back")) {
				int input2 = Integer.parseInt(st.nextToken());
				q.offerLast(input2);
			}else if (input.equals("pop_front")) {
				Integer output = q.pollFirst();
				if (output == null)
					sb.append("-1 \n");
				else
					sb.append(output + " \n");
			}else if (input.equals("pop_back")) {
				Integer output = q.pollLast();
				if (output == null)
					sb.append("-1 \n");
				else
					sb.append(output + " \n");
			}else if (input.equals("size")) {
				sb.append(q.size() + " \n");
			}else if (input.equals("empty")) {
				if (q.isEmpty()) {
					sb.append("1 \n");
				} else
					sb.append("0 \n");
			} else if (input.equals("front")) {
				if (q.isEmpty()) {
					sb.append("-1 \n");
				} else
					sb.append(q.peekFirst() + " \n");
			} else if (input.equals("back")) {
				if (q.isEmpty()) {
					sb.append("-1 \n");
				} else
					sb.append(q.peekLast() + " \n");
			}
		}
		System.out.println(sb.toString());
	}
}