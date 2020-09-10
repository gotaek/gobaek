import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B11651 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[][] = new int[n][2]; // x��ǥ y��ǥ

		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr,new Comparator<int[]>() { //Comparator �������̽� ������

			@Override//annotation
			public int compare(int[] e1, int[] e2) {
				
					
				if(e1[1] == e2[1]) {		// �ι�° ���Ұ� ���ٸ� ù ��° ���ҳ��� ��
					return e1[0] - e2[0];
				}
				else {
					return e1[1] - e2[1];	
				}
			}
			
		});

		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}