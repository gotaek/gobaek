# 백준 1991 트리 순회

트리를 만들기 위해서는 노드 클래스를 만들어야 한다. 노드클래스는 다음과 같이 구성 된다.

## 노드 클래스

<pre>
<code>
class Node{
	char data;
	Node left, right;
	public Node(char data){ this.data = data; }
}
</cod>
</pre>
-----------
## 트리 클래스

<pre>
트리의 본체를 구성해야 한다. 우선 루트 노드를 만들어준다. 

다음으로 add메소드와 search메소드를 구현한다.

1.add메소드
<code>
public void add(char data, char leftData, char rightData){
		if(root==null){
			if(data!='.') root = new Node(data);
			if(leftData!='.') root.left = new Node(leftData);
			if(rightData!='.') root.right = new Node(rightData);
		}
		else search(root, data, leftData, rightData);
	}
 </code>
 만약 루트 노드가 없고 data들이 .이 아닐 경우 노드들을 만들어 루트와 연결해준다.<br>
 그렇지 않다면 search메소드를 실행해준다.

 
 2.search메소드
 <code>
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
 </code>
 여기서 root가 의미하는 것은 로컬변수임을 주의해야한다. 재귀를 통해 원하고자 하는 노드가 있는지 탐색해야 한다.<br>
 만약 없다면 null을 return하고 찾았다면 그 노드에 새롭게 추가한다. 재귀를 통해 리프로 내려간다.
 </pre>
  -------------
  ## 순회
  
  전위순회,중위순회,후위순회를 하는 방법들은 간단하다. 재귀를 통해 구현해주면 되는데 print하는 위치만 바꾸어 주면서 자식 노드들을 타고 내려가면 된다.
  <pre>
  <code>
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
  </code>
  </pre>
  
  참고 및 출처:https://m.blog.naver.com/PostView.nhn?blogId=occidere&logNo=220899936160&proxyReferer=https:%2F%2Fwww.google.com%2F
