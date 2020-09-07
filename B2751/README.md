# 백준 2751 수 정렬하기

2751번 문제는 O(nlogn) 이하의 시간 복잡도를 가진 알고리즘을 활용해 풀어야 한다.<br>
O(nlogn)의 시간 복잡도를 가진 알고리즘은 대표적으로 quick sort, heap sort, mrege sort 등이 있다.<br>
counting sort 알고리즘은 O(n)의 시간 복잡도를 가진다고 한다.<br>
그럼에도 O(nlogn) 정렬 알고리즘을 사용하는 이유는 counting sort의 경우 수의 범위가 극단적으로 크면 메모리가 낭비되기 때문이라고 한다.

<pre>
이번 문제를 풀기 위해서는 다음을 import 해야한다.<code>
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
</code></pre>
<pre>
<code>
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();
</code>
위의 코드를 사용하여서 BufferedReader와 StringBuilder를 만든다.
</pre>

코드에서 +1000000을 해주고 -1000000을 해주는 이유는 둘째줄 부터 주어지는 수가 절댓값이 1000000보다 작거나 같은 정수이기 때문이다.
<pre>
<code>
for(int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
}
 
for(int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				sb.append((i - 1000000)).append('\n');
			}
}
</code>배열 안에 직접 입력을 받는 것을 배웠으며 StringBuilder를 사용하는 방법을 배울 수 있었다.<br>
BufferedReader와 StringBuilder를 더 사용해 보면서 응용력을 길러야겠다.
</pre>


출처 및 참고:<https://st-lab.tistory.com/106>
