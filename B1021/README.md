# 백준 1021 회전하는 큐

덱으로 이 문제를 풀어야 하는 줄 알고 헤맸다. LinkedList를 사용하면 쉽게 풀 수 있는 것을 블로그를 참고해서 깨달았다.<br>

## 리스트 사용하기

<pre>
<code>
import java.util.LinkedList;

LinkedList<Integer> list=LinkedList<>()
list.indexOf(num)

int first=list.getFirst();
list.removeFirst();
list.addLast(first);
cnt++;

int last=list.getLast();
list.removeLast();
list.addFirst(last);
cnt++;
</code>
이런 방식으로 deque을 사용하는 것처럼 표현했다.
</pre>

생각해보면 단순한 문제였다. 그러나 이번에도 마찬가지로 너무 복잡하게 생각해서 헤맸던 문제인 것 같다.
