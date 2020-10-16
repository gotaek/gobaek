import java.io.*;
public class B11653 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int i=2;
		while(i<=n) {
			if(n%i==0) {
				System.out.println(i);
				n=n/i;
			}else {
				i++;
			}
		}
	
	}

}
