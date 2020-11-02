import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1966 {
	static class Printer {
		int idx;
		int priority;

		public Printer(int idx, int priority) {
			this.idx = idx;
			this.priority = priority;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int testCase = Integer.parseInt(br.readLine());
		for (int k = 0; k < testCase; k++) {
			st = new StringTokenizer(br.readLine());
			int printNum = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken());
			Queue<Printer> queue = new LinkedList<Printer>();
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < printNum; i++) {
				int pri = Integer.parseInt(st.nextToken());
				queue.add(new Printer(i, pri));
			}//index�� �ο��ϸ� queue�� push

			int answer = 1;
			while (!queue.isEmpty()) {
				Printer current = queue.poll();//�� ���� ���ڸ� ������
				boolean check = true;

				Iterator it = queue.iterator();
				// �ٸ� ū ���� �ִ� �� Ȯ��
				while (it.hasNext()) {
					Printer other = (Printer) it.next();
					if (current.priority < other.priority) {
						check = false;
						break;
					}
				}
				if (!check) {
					queue.add(current);
				} else {
					if (current.idx == target) {
						System.out.println(answer);
					} else {
						answer++;
					}
				}
			}
		}
	}
}
