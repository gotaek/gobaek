# 백준 15651 N과 M (3)

Scanner 와 System.out.print()를 사용하여 풀이를 하였으나 시간 초과가 나왔다.<br>
<pre>
<code>
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());

Integer.parseInt(st.nextToken());
</code>
하지만 BufferedReader 와 StringTokenizer 그리고 StringBuilder를 사용하여 풀었더니 성공하였다.<br>자바에서는 이 문법들을 잘 익혀두어야겠다.
</pre>
