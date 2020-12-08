import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
public class B11286 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>() {

			public int compare(Integer a,Integer b) {
	
				if(Math.abs(a)==Math.abs(b)) {
					return a>b?1:-1;
				}else {
					return Math.abs(a)-Math.abs(b);
				}
			}
		});
		
		int n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			int x=Integer.parseInt(br.readLine());
			if(x==0) {
				if(pq.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(pq.poll());
				}
			}else {
				pq.offer(x);
			}
		}
	}
}
