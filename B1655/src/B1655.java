import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
public class B1655 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
			PriorityQueue<Integer> maxHeap =new PriorityQueue(Collections.reverseOrder());
			PriorityQueue<Integer> minHeap =new PriorityQueue();
			
		for(int i=0;i<n;i++) {
			int num=Integer.parseInt(br.readLine());
			if(i%2==0) {
				maxHeap.offer(num);
			}else {
				minHeap.offer(num);
			}
			
			if(!maxHeap.isEmpty()&&!minHeap.isEmpty()) {
				if(maxHeap.peek()>minHeap.peek()) {
					int temp=maxHeap.poll();
					maxHeap.offer(minHeap.poll());
					minHeap.offer(temp);
				}
			}
			System.out.println(maxHeap.peek());
		}

	}

}
