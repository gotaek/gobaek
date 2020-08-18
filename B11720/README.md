# 백준 11720 숫자의 합

---------------
## str.charAt()
<pre>
<code>
str.charAt(0)-'0'
</code>
아스키 값을 구해주는 함수 -'0'를 해줌으로써 int형으로 바꾸어 주었다.
</pre>

--------------
## s.next()와 s.nextLine()의 차이점

1.s.next()함수는 공백 이후를 scan하지 않지만 s.nextLine()함수는 Enter가 입력될 때 까지 scan을 받는다.


2.nextLine()함수 위쪽에 nextInt()를 사용한 경우 Enter가 아직 남아 있는 경우를 볼 수 있다. 따라서 next()함수를 이용해 버퍼를 삭제하였다.

