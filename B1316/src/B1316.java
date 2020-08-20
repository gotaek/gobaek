import java.util.Scanner;
public class B1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int count=t;
		
		
		for (int i=0;i<t;i++) {
			String str=s.next();
			int checker[]=new int[26];
			int j=0;
			
			while (j<str.length()){
				
				int idx=(int)(str.charAt(j))%97;
				checker[idx]++;
				
				if(checker[idx]>1&&str.charAt(j)!=str.charAt(j-1)) {
					count--;break;
				}
				j++;
			}
			for (int k=0;k<26;k++) System.out.printf("%c: %d \n",(char)(97+k),checker[k]);
		}
		System.out.printf("%d",count);
	}

}
