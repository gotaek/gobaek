import java.util.*;

public class B11650 {

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
			public int compare(int[] o1, int[] o2) {
				
					
				 if(o1[0]==o2[0])// x��ǥ�� ���� ���ٸ� y��ǥ�� �������� ����		
					return Integer.compare(o1[1], o2[1]);
					
					return Integer.compare(o1[0], o2[0]); // �������� x��ǥ�� �������� ����
			}		
			
		});
//		Arrays.sort(arr, new Comparator<int[]>() {		
//			@Override
//			public int compare(int[] e1, int[] e2) {
//				if(e1[0] == e2[0]) {		// ù��° ���Ұ� ���ٸ� �� ��° ���ҳ��� ��
//					return e1[1] - e2[1];
//				}
//				else {
//					return e1[0] - e2[0];
//				}
//			}
//		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}