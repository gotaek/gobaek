# 백준 1541 잃어버린 괄호

어떻게 풀어야할 지 감이 안와 블로그를 참고했는데 생각보다 간단한 문제였다.<br>

더하기 먼저 해주고 빼기를 나중에 하면 최솟값을 구할 수 있는 것이였다.<br>
문자열은 -를 기준으로 나누고 첫번째 그룹을 먼저 계산한다.<br>
그 후 나머지 그룹들을 계산하여 모두 더한 후 첫번째 그룹에서 빼면 최솟값을 구할 수 있다.<br>
String [] sub=문자열.split("-")를 사용하면 "-"를 기준으로 나눌 수 있다.<br>
 '+', '[', ']', '(', ')' 의 문자열에서는 앞에 \\을 붙여야 한다는 것도 배웠다.<br>
 

