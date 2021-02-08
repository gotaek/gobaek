import java.util.*;
public class B9019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		
		int iter=0;
		while(iter<t) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			boolean visited[]=new boolean [10000];
			String command[]=new String[10000];
			
			Arrays.fill(command, "");
			
			Queue<Integer> q=new LinkedList<>();
			
			visited[a]=true;
			q.add(a);
			while(!q.isEmpty()&&!visited[b]) {
				int now=q.poll();
				int D=(now*2)%10000;
				int S=now==0?9999:now-1;
				int L=now/1000+(now%1000)*10;
				int R=now/10+(now%10)*1000;
				
				if(!visited[D]) {
					command[D]=command[now]+"D";
					q.add(D);
					visited[D]=true;
				}
				if(!visited[S]) {
					command[S]=command[now]+"S";
					q.add(S);
					visited[S]=true;
				}
				if(!visited[L]) {
					command[L]=command[now]+"L";
					q.add(L);
					visited[L]=true;
				}
				if(!visited[R]) {
					command[R]=command[now]+"R";
					q.add(R);
					visited[R]=true;
				}
				
				
			}
			System.out.println(command[b]);
			iter++;
			
			
		}
	}

}
