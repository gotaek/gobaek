import java.util.Scanner;

public class B15649 {
	//main과 dfs 함수에서 공통적으로 사용해야 하므로 이곳에 배열을 생성
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
				checker[i]=false;// 자식노드 방문이 끝나고 돌아오면 방문노드릉 방문하여 다시 false로 변경
			}
		}
		
	}

}
