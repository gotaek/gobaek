import java.util.Scanner;
import java.util.Stack;
public class B10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Stack <Integer>stack=new Stack<>();
		
		int n=s.nextInt();
		int i=0;
		while(i<n) {
			int num=s.nextInt();
			if(num==0) {
				stack.pop();
			}else {
				stack.push(num);
			}
			i++;
		}int sum=0;
		for(Integer j :stack) {
			sum+=j;
		}
		System.out.println(sum);

	}

}
