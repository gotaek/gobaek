import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class B12015 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		ArrayList<Integer> list=new ArrayList();
		list.add(0);
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			int num=Integer.parseInt(st.nextToken());
			if(list.get(list.size()-1)<num) {
				list.add(num);

			}else {
				int pl=0;
				int pr=list.size()-1;
				while(pl<pr) {
					int pm=(pl+pr)/2;
					
					if(list.get(pm)>=num) {
						pr=pm;
					}else {
						pl=pm+1;
					}
				}
				list.set(pr,num);
			}
		}
		System.out.println(list.size()-1);

	}

}
