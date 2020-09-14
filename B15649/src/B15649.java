import java.util.Scanner;

public class B15649 {
	public static boolean checker[];
	public static int arr[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		checker=new boolean[N+1];
		arr=new int[M];
		dfs(N, M, 0);
	}

	static void dfs(int n, int m, int depth) {

		if (m == depth) {
			for (int i:arr) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <=n; i++) {
			if (checker[i] == false) {
				checker[i] = true;
				arr[depth] = i;
				dfs(n, m, depth + 1);
				checker[i]=false;
			}
		}
		
	}

}
