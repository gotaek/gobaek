import java.io.*;
import java.util.Stack;

public class B4949 {

	static void checker(String str) {
		Stack<String> stk = new Stack<>();
		for (int j = 0; j < str.length(); j++) {
			String text = Character.toString(str.charAt(j));
			if (text.equals("(")) {
				stk.push("(");
			}

			else if (text.equals("[")) {

				stk.push("[");
			}
			try {
				if (text.equals(")")) {

					if (stk.pop() != "(") {
						System.out.println("no");
						return;
					}

				} else if (text.equals("]")) {

					if (stk.pop() != "[") {
						System.out.println("no");
						return;
					}

				}
			} catch (Exception e) {
				System.out.println("no");
				return;
			}
		}
		if (stk.empty()) {
			System.out.println("yes");
			return;
		}else {
			System.out.println("no");
			return;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			if (str.equals("."))
				return;
			checker(str);

		}
	}

}
