import java.util.Scanner;
public class B11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int N=s.nextInt();
		int K=s.nextInt();
		if(N>10||N<1) return;
		if(K>100000000||K<1) return;
		
		int coin[]=new int[N];
		for(int i=0;i<N;i++) {
			coin[i]=s.nextInt();
		}
		

		int nam=K;
		int cnt=0;
		
		for(int i=N-1;i>=0;i--) {
			if(nam>=coin[i]) {
				cnt+=(nam/coin[i]);
				nam=nam%coin[i];
				
			}
		}
		System.out.println(cnt);
	}

}
