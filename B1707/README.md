# 백준 1707 이분 그래프

그래프의 정점의 집합을 둘로 분할하여, 각 집합에 속한 정점끼리는 서로 인접하지 않도록 분할할 수 있을 때, 그러한 그래프를 특별히 이분 그래프 (Bipartite Graph) 라 부른다.<br>
이분그래프를 판별하는 방법으로 나는 BFS를 사용하였다. 정점을 방문 했을 때 표시를 해두고 인접한 정점으로 이동하여 방문하면 이전과 반대로 표시한다.
만약 모순이 생긴다면 이분 그래프가 아닌 것이다.

graph를 만들기 위해 LinkedList 배열 각각의 요소를 LinkedList로 만든다.
