import java.io.*;
import java.util.StringTokenizer;

public class B1806 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

		int arr[] = new int[n+1];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int pl = 0;
		int pr = 0;
		int sum = 0;
		int cnt = Integer.MAX_VALUE;

		while (pr <=n  && pl <=n) {
			if(sum>=s&&cnt>pr-pl)
				cnt=pr-pl;
			if (sum < s) {
				sum += arr[pr++];
			} else {
				sum -= arr[pl++];
			}
			
			
		}
		if(cnt==Integer.MAX_VALUE)
			System.out.println(0);
		else
			System.out.println(cnt);
	}

}
