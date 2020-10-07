# 백준 9251 LCS

이번 문제도 풀지 못하여 블로그를 거의 참고했다. 블로그에서는 2차원 배열을 만들어 풀어야 한다고 설명했다.<br>
DP가 증가하는 원리를 잘 몰라서 공식처럼 사용하기로 하였다.

## 공식

만약 X번째 원소와 Y번째 원소가 같다면 (X-1,Y-1)의 LCS길이 + 1 이된다.<br>
그렇지 않다면 이전 행의 원소 또는 열 원소 중 '큰 것'을 기준으로 채운다.<br>

## toCharArray

<pre>
<code>
char[] str1 = in.nextLine().toCharArray();
</code>
toCharArray()는 문자열을 char[] 배열로 반환해주는 메소드라는 것을 배웠다.
</pre>

* 외부링크: <https://st-lab.tistory.com/139>
