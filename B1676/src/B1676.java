import java.util.Scanner;

public class B1676 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int two=0;
		int five=0;
		for(int i=n;i>1;i--) {
			int val=i;
			int j=2;
			while(true) {
				if(val%2==0) {
					val=val/2;
					two++;
				}else if(val%5==0){
					val=val/5;
					five++;
				}else break;
			}
				
		}
		System.out.println(Math.min(two, five));
		
	}

}
