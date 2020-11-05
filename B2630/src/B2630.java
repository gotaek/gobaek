import java.io.*;
import java.util.StringTokenizer;

public class B2630 {
	static int white = 0;
	static int blue = 0;
	static int arr[][];

	static boolean isSame(int n, int x, int y) {
		int flag=arr[x][y];
		for(int i=x;i<x+n;i++) {
			for(int j=y;j<y+n;j++) {
				if(flag!=arr[i][j]) return false;
			}
		}return true;
	}

	static void cut(int n, int x, int y) {
		if(isSame(n,x,y)) {
			if(arr[x][y]==0) white++;
			else blue++;
			return;
		}
		cut(n/2,x,y);
		cut(n/2,x+n/2,y);
		cut(n/2,x,y+n/2);
		cut(n/2,x+n/2,y+n/2);

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		cut(N, 0, 0);
		System.out.println(white);
		System.out.println(blue);

	}

}
