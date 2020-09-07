import java.util.Scanner;
public class B2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<1||n>1000) return;
		
		int arr[]=new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i=0;i<n;i++) {
			System.out.printf("%d\n",arr[i]);
		}
	}

}
