import java.util.Scanner;
import java.io.*;
public class B5639 {
	static class Node {
		int num;
		Node left = null;
		Node right = null;

		Node(int num) {
			this.num = num;
		}
	}

	static class Tree {
		Node root = null;

		void add(int num) {
			if (root == null)
				root = new Node(num);
			else
				find(root, num);
		}

		void find(Node parent, int find_num) {
			if (parent.num > find_num) {
				if (parent.left == null) {
					parent.left = new Node(find_num);
				} else
					find(parent.left, find_num);
			} else if (parent.num < find_num) {
				if (parent.right == null) {
					parent.right = new Node(find_num);
				} else
					find(parent.right, find_num);
			} else
				return;
		}

		void postorder(Node node) {
			if (node == null)
				return;
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.num);
		}
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Tree bst = new Tree();
		String str=null;
		while ((str=br.readLine())!=null&&str.length()!=0) {
			bst.add(Integer.parseInt(str));
			
		}
		bst.postorder(bst.root);

	}
}
