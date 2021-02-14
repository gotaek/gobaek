import java.util.*;

public class B11725 {
	static int parent[];
	static boolean check[];
	static ArrayList<Integer> []list;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		list=new ArrayList[n+1];
		parent=new int [n+1];
		check=new boolean [n+1];
		for(int i=1;i<=n;i++) {
			list[i]=new ArrayList<>();
		}
		
		for(int i=1;i<n;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			
			list[a].add(b);
			list[b].add(a);
		}
		dfs(1);
		for(int i=2;i<=n;i++) {
			System.out.println(parent[i]);
		}
		

	}
	
	static void dfs(int n) {
		if(check[n]==true) return;
		
		check[n]=true;
		for(int i:list[n]) {
			if(check[i]!=true) {
				parent[i]=n;
				dfs(i);
			}
		}
	}

}
