import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2805 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int tree[] = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(tree);
		int top = tree[n - 1];
		int bottom = 0;
		int mid=0;
		while (bottom<=top) {
			mid = (top + bottom) / 2;
			int cutTree=0;
			long sumCutTree=0;
			for (int i = 0; i < n; i++) {
				cutTree = tree[i] - mid;
				if(cutTree<0) cutTree=0;
				
				sumCutTree+=cutTree;
			}
			if (sumCutTree >=m) {
				bottom = mid + 1;
			} else {
				top = mid - 1;
			}
		}
		
		System.out.printf("%d", top);

	}

}
