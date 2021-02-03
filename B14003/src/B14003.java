import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Stack;
public class B14003 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList();
		
		
		int n = Integer.parseInt(br.readLine());
		list.add(Integer.MIN_VALUE);
		int indexArr[]=new int[n];
		int arr[]=new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		for (int i = 0; i <n; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i]=num;
			if (list.get(list.size() -1) < num) {
				list.add(num);
				indexArr[i]=list.size()-1;

			} else {
				int pl = 1;
				int pr = list.size() - 1;
				while (pl < pr) {
					int pm = (pl + pr) / 2;

					if (list.get(pm) >= num) {
						pr = pm;
					} else {
						pl = pm + 1;
					}
				}
				
				list.set(pr, num);
				indexArr[i]=pr;
			}
		}
		System.out.println(list.size() - 1);

		Stack<Integer> stack=new Stack<>();
		int last=list.size()-1;
		for(int i=n-1;i>=0;i--) {
			if(last==indexArr[i]) {
				last--;
				stack.push(arr[i]);
				
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop()+" ");
		}
		System.out.println(sb.toString());
		
	}

}
