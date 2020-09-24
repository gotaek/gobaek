import java.io.*;

public class B1003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int arr[][] = new int[2][41];
		int storage[] = new int[t];
		arr[0][0] = 1;
		arr[1][0] = 0;
		arr[0][1] = 0;
		arr[1][1] = 1;
		for (int i = 2; i < 41; i++) {
			arr[0][i] = arr[0][i - 2] + arr[0][i - 1];
			arr[1][i] = arr[1][i - 2] + arr[1][i - 1];
		}
		for (int i = 0; i < t; i++) {
			storage[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < t; i++) {
			System.out.printf("%d %d\n", arr[0][storage[i]], arr[1][storage[i]]);
		}
	}

}
