# 백준 5639 이진 검색 트리

전위 순회 값이 주어지면 이 값으로 이진 검색 트리를 만들었다. <br>
그 후 이전에 배웠던 후위 순회를 통해 출력하면 되는 간단한 문제이다. <br>
1991번 문제를 참고하여 트리를 구성하였다. <br>
또한 입력 받을 때 어떻게 EOF까지만 입력받을 수 있는지 몰라 블로그를 참고했다. <br>
<pre>
<code>
String str=null;
while ((str=br.readLine())!=null&&str.length()!=0) {
  bst.add(Integer.parseInt(str));
}
</code>
</pre>
