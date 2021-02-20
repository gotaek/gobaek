import java.util.Scanner;
 
public class B2263 {
    static int [] inOrder = new int[100000];
    static int [] postOrder = new int[100000];
    static int [] position = new int[100001];
    
    static void solve(int is, int ie, int ps, int pe) {
        if(is>ie || ps>pe) return ;
        int root = postOrder[pe];
        System.out.print(root+" ");
        int inRoot = position[root]; 
        int left = inRoot-is; 
        solve(is, inRoot-1, ps, ps+left-1);
        solve(inRoot+1, ie, ps+left, pe-1);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();    
        
        for(int i=0; i<n; i++)
            inOrder[i] = scan.nextInt();
        for(int i=0; i<n; i++)
            postOrder[i] = scan.nextInt();
        for(int i=0; i<n; i++)
            position[inOrder[i]] = i;
        
        solve(0, n-1, 0, n-1);
    }
 
}
