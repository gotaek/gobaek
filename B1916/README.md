# 백준 1916 최소비용구하기

다익스트라 알고리즘을 이용해야 했다. 1753 코드를 참고했다. <br>
<pre>
<code>
static void Dijkstra(int start) {
		PriorityQueue<Node> pq=new PriorityQueue<>();
		pq.add(new Node(start,0));
		while(!pq.isEmpty()) {
			Node cur=pq.poll();
			for(Node next:list[cur.idx]) {
				if(distance[next.idx]>distance[cur.idx]+next.w) {
					distance[next.idx]=distance[cur.idx]+next.w;
					pq.add(new Node(next.idx,distance[next.idx]));
				}
			}
		}
	}
</code>
현재 노드의 거리와 가중치를 더한것이 다음 노드의 거리보다 작으면 업데이트하고 우선순위 큐에 푸쉬한다.
</pre>
<pre>
<code>
static class Node implements Comparable<Node>{
		int idx;
		int w;
		Node(int idx,int w){
			this.idx=idx;
			this.w=w;
		}
		public int compareTo(Node o){
			return this.idx-o.idx;
		}
	}
</code>
Node 클래스를 Comparable 인터페이스를 구현하였다. compareTo메소드도 생성해주었다. 
</pre>
