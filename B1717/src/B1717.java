import java.io.*;
import java.util.StringTokenizer;
public class B1717 {
	static int parent[];
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		parent=new int [n+1];
		for(int i=0;i<=n;i++) parent[i]=i;
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int command=Integer.parseInt(st.nextToken());
			int num1=Integer.parseInt(st.nextToken());
			int num2=Integer.parseInt(st.nextToken());
			
			if(command==1) {
				isSameParent(num1,num2);
			}else if(command==0) {
				union(num1,num2);
			}
		}
		
	}
	
	static int find(int x) {
		if(parent[x]==x) {
			return x;
		}else return parent[x]=find(parent[x]);
	}
	
	static void union(int x,int y) {
		x=find(x);
		y=find(y);
		if(x!=y) {
			parent[x]=y;
		}
	}
	
	static void isSameParent(int x,int y) {
		x=find(x);
		y=find(y);
		
		if(x==y) {
			System.out.println("YES");
		}else 
			System.out.println("NO");
	}

}
