import java.util.LinkedList;
import java.util.Scanner;
public class B1021 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		
		LinkedList<Integer> list=new LinkedList<>();
		
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		int cnt=0;
		for(int i=0;i<m;i++) {
			int num=s.nextInt();
			while(num!=list.get(0)) {
				if(list.indexOf(num)<=list.size()/2) {
					int first=list.getFirst();
					list.removeFirst();
					list.addLast(first);
					cnt++;
				}else {
					int last=list.getLast();
					list.removeLast();
					list.addFirst(last);
					cnt++;
				}
			}
			list.removeFirst();
		}
		System.out.println(cnt);
	}
}
