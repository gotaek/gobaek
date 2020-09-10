import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String arr[]=new String[n]; // x좌표 y좌표

		for(int i = 0; i < n; i++) {
			arr[i]=sc.next();
			
		}
		Arrays.sort(arr,new Comparator<String>() { //Comparator 인터페이스 재정의

			@Override
			public int compare(String e1, String e2) {
				
				if(e1.length()==e2.length()) {
					if (e1.compareTo(e2)<0) return -1;
					else return 1;
				}
				if(e1.length() < e2.length()) {		// 두번째 원소가 같다면 첫 번째 원소끼리 비교
					return -1;
				}
				else {
					return 1;
				}
				
				
			}
			
		});

		System.out.printf("%s\n",arr[0]);
		for(int i = 1; i < n; i++) {
			if (arr[i-1].compareTo(arr[i])==0) continue;
			System.out.printf("%s\n",arr[i]);
		}
		sc.close();
	}
}