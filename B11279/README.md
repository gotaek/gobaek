# 백준 11279 최대 힙

이 문제를 풀기 위한 방법으로는 java의 우선순위 큐를 사용하는 방법과 직접 최대 힙을 구현하는 방법이 있다.

## 1. Priority Queue

<pre>
<code>
import java.util.PriorityQueue
</code>

<code>
PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

pq.isEmpty()
pq.poll()
pq.offer()

</code>
우선순위가 높은 숫자 순으로 배열할 수 있다.
</pre>

## 2. 최대 힙 구현하기

### push

배열의 가장 끝 원소부터 위로 올라가면서 부모노드의 값보다 크다면 swap한다. 

### pop

가장 첫번째 원소를 빼내고 마지막 원소를 첫번째 원소 자리에 넣는다. 그리고 자식 원소 크기와 비교하여 더 큰 원소와 swap한다.<br>

