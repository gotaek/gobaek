import java.util.Scanner;
import java.util.Arrays;
public class B1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String num=s.nextLine();
		int arr[]=new int [num.length()];
		
		for (int i=0;i<num.length();i++) {
			arr[i]= num.charAt(i)-'0';
		}
		Arrays.sort(arr);
		
		for (int i=num.length()-1;i>=0;i--) {
			System.out.printf("%d", arr[i]);
		}
	}

}
