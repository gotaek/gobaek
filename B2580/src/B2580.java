import java.io.*;
import java.util.StringTokenizer;

public class B2580 {
	static int board[][] = new int[9][9];
	static int arr[][];
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int idx = 0;
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == 0) {
					cnt++;
				}
			}
		}
		arr = new int[2][cnt+1];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == 0) {
					arr[0][idx] = i;
					arr[1][idx] = j;
					idx++;
				}
			}
		}
		// 함수 호출
		sdocu(arr[0][0], arr[1][0], 0);
		
		
	}

	// 재귀 함수
	public static void sdocu(int row, int col, int depth) {
		// 출력
		for (int i = 1; i < 10; i++) {
			if (possible(row, col, i)) {
				board[row][col] = i;
				sdocu(arr[0][depth + 1], arr[1][depth + 1], depth + 1);
				board[row][col]=0;
			}
		}
		if (row == arr[0][cnt]&&col==arr[1][cnt]) {
			
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.printf("%d ", board[i][j]);
				}
				System.out.println();
			}
			System.exit(0);
		}

	}

	// 가능성 확인
	public static boolean possible(int r, int c, int num) {
		
		for (int i = 0; i < 9; i++) {
			if (board[r][i] == num) {
				return false;
			}
		}
		for (int i = 0; i < 9; i++) {
			if (board[i][c] == num) {
				return false;
			}
		}
		int set_row = (r / 3) * 3; 
		int set_col = (c / 3) * 3;
 
		for (int i = set_row; i < set_row + 3; i++) {
			for (int j = set_col; j < set_col + 3; j++) {
				if (board[i][j] == num) {
					return false;
				}
			}
		}
		return true;
	}
}
