import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int time[][]=new int [N][2];
		
		for(int i=0;i<N;i++) {
			time[i][0]=s.nextInt();
			time[i][1]=s.nextInt();
		}
		
		Arrays.sort(time,new Comparator<int[]>() {
			
			@Override
			public int compare(int o1[],int o2[]) {
				if(o1[1]==o2[1])
					return o1[0]-o2[0];

				return o1[1]-o2[1];
			}
		});
		
		int cnt=0;
		int prev_time=0;
		for(int i=0;i<N;i++) {
			if(prev_time<=time[i][0]) {
				cnt++;
				prev_time=time[i][1];
			}
		}
		System.out.println(cnt);
	}

}
