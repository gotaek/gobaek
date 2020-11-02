# 백준 1966 프린터 큐

방법을 많이 고민했지만 적절한 방법을 찾을 수 없는 것 같아서 블로그를 참고하였다.

## Printer 클래스

내가 원하는 index를 알 수 있어야 하는 동시에 우선순위 까지 알 수 있어야 했다.<br>
그래서 Printer 클래스에 index와 priority를 저장할 수 있도록 하였다. 이 클래스를 바탕으로 한 Queue를 만들었다.<br>
<pre>
<code>
for (int i = 0; i < printNum; i++) {
				int pri = Integer.parseInt(st.nextToken());
				queue.add(new Printer(i, pri));
			}
</code>
이 같은 방식으로 index와 priority를 추가하였다.
</pre>

## Iterator

Iterator를 import하고 다음 iterator가 없을 때 까지 while문을 돌렸다.<br>
맨 앞의 Printer와 그 뒤의 Printer들을 비교해 우선순위가 더 큰 것이 있으면 다시 queue에 넣는다.<br>
만약 우선순위가 더 큰 것이 없으면 count를 하고 원하는 index가 맞으면 출력을 한다.
