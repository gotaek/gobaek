# 백준 14889 스타트와 링크

이번 문제는 백트래킹의 마지막 문제이다.<br>
백트래킹 문제를 풀 때 트리를 그려 어떤 식으로 풀어나가야 하는지를 파악하는 것이 중요한 것 같다<br>

<pre>
<code>
	public static void divide(int num, int n) {
     //depth를 확인하여 return하는 부분
		if (depth == n) {
			statCalculator();
			return;
		}
     //반복해서 재귀함수를 호출할 부분
		for (int i = 0; i < N; i++) {
			if (!arr[i] && num < i) {
				arr[i] = true;
				start[n] = i;
				divide(i, n + 1);
				arr[i] = false;
			}
		}
	}
  </code>
  재귀 함수를 만들 때 기본적인 구성은 깊이를 확인할 수 있는 부분을 먼저 만들어 저야 한다는 것이고, 
  재귀함수를 호출하는 부분을 만들어야 한다. 
  이때주의할 점은 재귀함수를 호출하는 부분에서 다시 올라올 때 내려가기 전과 같은 상태로 만들어줘야 한다는 것이다.
  위의 코드에서는 시간 초과를 막기위해 중복된 것을 뺄 수 있도록 num < i와 같은 조건을 달아 줬다.
  </pre>
