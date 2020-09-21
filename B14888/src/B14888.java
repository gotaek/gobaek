import java.util.Scanner;

public class B14888 {
	static int num[];
	static int real_op[];
	static int arr[];
	static int depth;
	static int max=-1000000000, min=1000000000 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int op[] = new int[4];
		depth = s.nextInt();
		num = new int[depth];
		real_op = new int[depth - 1];
		arr=new int[depth-1];
		for (int i = 0; i < depth; i++) {
			num[i] = s.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			op[i] = s.nextInt();
		}
		int idx = 0;
		for (int i = 0; i < 4; i++) {
			while (op[i] > 0) {
				real_op[idx] = i;
				idx++;
				op[i]--;
			}
		}
		recur(0);
		System.out.printf("%d %d", max,min);
		
	}

	static void recur(int n) {
		if (depth-1 == n) {
			calculate();
			return;
		}
		for (int i = 0; i < depth-1; i++) {
			int p;
			if (real_op[i]!=4) {
				p=real_op[i];
				real_op[i]=4;
				arr[n]=p;
				recur(n+1);
				real_op[i]=p;
			}
		}
			
	}
	static void calculate() {
		int sum=0;
		if (arr[0]==0) {
			sum=num[0]+num[1];
		}else if(arr[0]==1) {
			sum=num[0]-num[1];
		}else if(arr[0]==2) {
			sum=num[0]*num[1];
		}else {
			sum=num[0]/num[1];
		}
		for(int i=1;i<depth-1;i++) {	
			if (arr[i]==0) {
				sum=sum+num[i+1];
			}else if(arr[i]==1) {
				sum=sum-num[i+1];
			}else if(arr[i]==2) {
				sum=sum*num[i+1];
			}else {
				sum=sum/num[i+1];
			}
		}
		
		if(sum>max)max=sum;
		if (depth==2)min=max;
		if(sum<min)min=sum;
		
		
	}

}
