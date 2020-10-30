import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class B2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Queue<Integer>q=new LinkedList<>();
		
		int N=s.nextInt();
		if (N==1) q.offer(1);
		for(int i=1;i<=N;i++) {
			q.offer(i);
		}
		while(true) {
			q.poll();
			if(q.size()==1 )break;
			q.offer(q.poll());
		}
		System.out.println(q.poll());
		
	}

}
