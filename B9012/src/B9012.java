import java.util.Scanner;
import java.util.Stack;

public class B9012 {
	static void par(String str) {

		Stack<String> stk = new Stack<>();

		for (int j = 0; j < str.length(); j++) {
			String a = Character.toString(str.charAt(j));
			
			if (a.equals("(")) {
				stk.push("(");
			} else {
				if (stk.empty()) {
					System.out.println("NO");
					return;
				} else if (stk.peek() == "(") {
					stk.pop();
				}
			}
		}
		if (stk.empty()) {
			System.out.println("YES");
			return;
		} else {
			System.out.println("NO");
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			String str = s.next();
			par(str);
		}
	}
}
