# 백준 2869 달팽이는 올라가고 싶다.

scanner를 사용했더니 시간 초과가 발생 했다. 따라서 bufferedreader를 사용하여 시간을 감소시켰다.

주의할 점은 예외처리를 해주어야 하며 int형으로 바꾸어야 한다는 것이이다.

<pre>
<code>
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(bf.readLine());
int m=Integer.parseInt(st.nextToken());
</code>
</pre>
