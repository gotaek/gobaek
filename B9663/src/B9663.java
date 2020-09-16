import java.util.Scanner;
 
public class B9663{
 
	public static int[] board;
	public static int N;
	public static int count = 0;
 
	public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		board = new int[N];
 
		queen(0);
		System.out.println(count);
 
	}
 
	public static void queen(int n) {
		
		if (N == n) {
			count++;
			return;
		}
 
		for (int i = 0; i < N; i++) {
			board[n] = i;
			if (possible(n)) {
				queen(n + 1);
			}
		}
 
	}
 
	public static boolean possible(int col) {
 
		for (int i = 0; i < col; i++) {
			if (board[col] == board[i]) {
				return false;
			} 	
			else if (Math.abs(col - i) == Math.abs(board[col] - board[i])) {
				return false;
			}
		}
		return true;
	}
}