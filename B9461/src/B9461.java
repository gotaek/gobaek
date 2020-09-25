import java.io.*;
public class B9461 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		long seq[]=new long [100];
		int arr[]=new int [t];
		seq[0]=1;seq[1]=1;seq[2]=1;
		for(int i=0;i<t;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=3;i<100;i++) {
			seq[i]=seq[i-2]+seq[i-3];
		}
		for(int i=0;i<t;i++) {
			System.out.println(seq[arr[i]-1]);
		}
	}

}
