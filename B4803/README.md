# 백준 4803 트리

이 문제는 그래프와 트리를 구분하는 문제이다. 그래프 범위 안에 트리가 들어가 있는 것이다. <br>
트리는 사이클이 있어서는 안되며 노드의 갯수가 간선의 갯수+1 과 같다.<br>
여기서 주의 할 점이 있는데 노드가 연결되지 않는 경우도 트리에 속한다. <br>
예를 들어 1,2,3,4 노드가 연결 되어 있고, 5번 노드 따로 6번 노드 따로 있다면 이것은 트리가 세개가 있는 것이다. <br>

지금까지 그래프를 구성할 때 양방향 인접 리스트로 구성하였다. 이번 문제도 양방향으로 간선을 구성한다.<br>
따라서 주어진 그래프가 트리를 이룬다면 '(간선/2)+1==노드'이어야 한다.<br>

findTree 함수는 다음과 같이 BFS로 트리를 검색하는 함수이다.<br>
<pre>
<code>
static int findTree(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		int node = 0;
		int edge = 0;
		while (!q.isEmpty()) {
			int cur=q.poll();
			visit[cur]=true;
			node+=1;
			
			for (int next : graph[cur]) {
				edge++;
				if (!visit[next]) {	
					q.offer(next);
				}
			}
		}
		return edge/2 + 1 == node ? 1 : 0;
}
 </code>
 </pre>
 
 출처:https://gre-eny.tistory.com/entry/java-%EB%B0%B1%EC%A4%80-4803-%ED%8A%B8%EB%A6%AC-Gold-4
