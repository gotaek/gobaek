import java.util.Scanner;
public class B11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		/*int n=s.nextInt();
		String str=s.next();
		int sum=0;
		
		for (int i=0;i<n;i++) {
			sum+=str.charAt(i)-'0';
			
		}
		System.out.printf("%d",sum);*/
		
		
		String word=s.next();
		int a=97;
		while (true){
			char ch=(char)a;
			System.out.printf("%d ",word.indexOf(ch));
			if (a=='z') break;
			a++;
		}
	}

}
