
import java.util.Scanner;
public class B10816 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int arr[]=new int [20000001];
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			arr[s.nextInt()+10000000]++;
		}
		int m=s.nextInt();
		for(int i=0;i<m;i++) {
			sb.append(arr[s.nextInt()+10000000]+" ");
		}
		System.out.println(sb.toString());
	}

}
