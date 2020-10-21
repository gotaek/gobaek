import java.util.Scanner;
import java.util.HashMap;
public class B9375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		
		int T=s.nextInt();
		for(int i=0;i<T;i++) {
			int N=s.nextInt();
			HashMap<String,Integer> set=new HashMap<>();
			for(int j=0;j<N;j++) {
				String name=s.next();
				String type=s.next();
				if(set.containsKey(type)) {
					int add=set.get(type);
					set.put(type,add+1);
				}else {
					set.put(type,1);
				}
			}
			int result=1;
			for(int val:set.values()) {
				result*=val+1;
			}
			System.out.println(result-1);
		}
	}

}
