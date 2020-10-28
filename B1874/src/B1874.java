import java.util.Scanner;
import java.util.Stack;


public class B1874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int idx = 0;
		Stack<Integer> stk = new Stack<>();
		StringBuilder sb=new StringBuilder();
		int temp = 1;
		int ai = 0;
		boolean isAble=true;
		while (idx < n ) {
			int num = s.nextInt();
			if (num >= temp) {
				for (int i = temp; i <= num; i++) {
					stk.push(i);
					sb.append("+ \n");
					
					ai++;
				}
				stk.pop();
				sb.append("- \n");
			
				ai++;
				temp = num + 1;
			} else {
				if (stk.pop() == num) {
					sb.append("- \n");
		
					ai++;
				}
				else {
					isAble=false;
					
				}
			}idx++;
		}
		if(isAble)
			System.out.println(sb.toString());
		else 
			System.out.println("NO");
	}

}
