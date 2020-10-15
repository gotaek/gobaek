import java.util.Arrays;
import java.util.Scanner;
public class B11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int arr[]=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=1;i<N;i++) {
			arr[i]=arr[i-1]+arr[i];
		}
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
