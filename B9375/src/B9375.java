import java.util.Scanner;
import java.util.HashMap;
public class B9375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		
		int T=s.nextInt();
		/* test case만큼 반복*/
		for(int i=0;i<T;i++) {
			
			int N=s.nextInt();
			HashMap<String,Integer> set=new HashMap<>();// String key, Integer value
			
			for(int j=0;j<N;j++) {
				String name=s.next();
				String type=s.next();
				/* 이미 옷의 종류가 있다면 업데이트 */
				if(set.containsKey(type)) {
					int add=set.get(type);//key를 이용해 value를 가져옴
					set.put(type,add+1);
				/*기존에 없던 옷의 종류라면 새롭게 만듬 */
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
