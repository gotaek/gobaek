import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class B1697 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		Integer arr[]=new Integer [1000001];
		Queue <Integer> q=new LinkedList();

		q.offer(n);
		arr[n]=0;
		while(arr[k]==null) {
			int temp=q.poll();
			if(temp-1>=0&&arr[temp-1]==null) {
				arr[temp-1]=arr[temp]+1;
				q.offer(temp-1);
			}if(temp+1<=1000000&&arr[temp+1]==null) {
				arr[temp+1]=arr[temp]+1;
				q.offer(temp+1);
			}if(temp*2<=1000000&&arr[2*temp]==null) {
				arr[2*temp]=arr[temp]+1;
				q.offer(2*temp);
			}
		}

		System.out.println(arr[k]);
		
	}

}
