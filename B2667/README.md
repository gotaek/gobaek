# 백준 2667 단지 번호붙이기

DFS를 통해 숫자가 써있는 곳을 탐색한다.
dx와 dy를 설정한다. DFS함수는 nx와 ny는 map의 범위 내에 있어야 하며 탐색한 map의 위치의 값이 1이면
재귀적으로 다시 DFS함수를 호출한다. 

메인 함수에서는 str.charAt(j)-'0'을 하면서 String 을 int형으로 바꿔주었다.<br>
또 ArrayList를 만들어주면서 카운팅 한 것을 list에 추가한다.<br>
ArrayList를 오름차순으로 정렬한 후 출력을 해주었다.
