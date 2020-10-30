import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class B11866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int n=s.nextInt();
		int k=s.nextInt();
		Queue <Integer> q=new LinkedList<>();
		for(int i=1;i<=n;i++) {
			q.offer(i);
		}
		sb.append("<");
		while(true) {
			for(int i=1;i<k;i++) {
				q.offer(q.poll());
			}
			if(q.size()!=1) {
				sb.append(q.poll()+", ");
			}else {
				sb.append(q.poll()+">");
				break;
				
			}
			
		}
		
		System.out.println(sb.toString());
	}

}
