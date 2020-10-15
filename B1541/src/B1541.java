import java.util.Scanner;
public class B1541 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String sub[]=s.nextLine().split("-");

		String first_arr[]=sub[0].split("\\+");
		int first=0;
		for(int i=0;i<first_arr.length;i++) {
			first+=Integer.parseInt(first_arr[i]);
		}
		int sum=0;
		for(int i=1;i<sub.length;i++) {
			String arr[]=sub[i].split("\\+");
			for(int j=0;j<arr.length;j++) {
				sum+=Integer.parseInt(arr[j]);
			}
		}
		System.out.println(first-sum);

	}

}
