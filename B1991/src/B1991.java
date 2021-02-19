import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1991{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int i, n = Integer.parseInt(in.readLine());
		Tree t = new Tree();
		char data[];
		for(i=0;i<n;i++){
			data = in.readLine().replaceAll(" ", "").toCharArray();
			t.add(data[0], data[1], data[2]);
		}
		t.preorder(t.root);
		System.out.println();
		t.inorder(t.root);
		System.out.println();
		t.postorder(t.root);
		in.close();
	}
}
class Node{
	char data;
	Node left, right;
	public Node(char data){ this.data = data; }
}

class Tree{
	Node root;
	
	public void add(char data, char leftData, char rightData){
		if(root==null){
			if(data!='.') root = new Node(data);
			if(leftData!='.') root.left = new Node(leftData);
			if(rightData!='.') root.right = new Node(rightData);
		}
		else search(root, data, leftData, rightData);
	}
	
	private void search(Node root, char data, char leftData, char rightData){
	    if(root==null) return;
	    else if(root.data==data){
		    if(leftData!='.') root.left = new Node(leftData);
		    if(rightData!='.') root.right = new Node(rightData);
	    }
	    else{
		    search(root.left, data, leftData, rightData);
		    search(root.right, data, leftData, rightData);
	    }
    }
	
	public void preorder(Node root){
		System.out.print(root.data);
		if(root.left!=null) preorder(root.left);
		if(root.right!=null) preorder(root.right);
	}
	public void inorder(Node root){
		if(root.left!=null) inorder(root.left);
		System.out.print(root.data);
		if(root.right!=null) inorder(root.right);
	}
	public void postorder(Node root){
		if(root.left!=null) postorder(root.left);
		if(root.right!=null) postorder(root.right);
		System.out.print(root.data);
	}
}
