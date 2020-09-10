import java.util.*;

public class B11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[][] = new int[n][2]; // x좌표 y좌표

		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr,new Comparator<int[]>() { //Comparator 인터페이스 재정의

			@Override//annotation
			public int compare(int[] o1, int[] o2) {
				
					
				 if(o1[0]==o2[0])// x좌표의 값이 같다면 y좌표를 기준으로 정렬		
					return Integer.compare(o1[1], o2[1]);
					
					return Integer.compare(o1[0], o2[0]); // 나머지는 x좌표를 기준으로 정렬
			}		
			
		});
//		Arrays.sort(arr, new Comparator<int[]>() {		
//			@Override
//			public int compare(int[] e1, int[] e2) {
//				if(e1[0] == e2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
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