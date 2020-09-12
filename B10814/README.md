#  백준 101814 나이순 정렬

객체들을 저장하여 리스트로 만들 수 있는 ArrayList를 배웠다.<br>
<pre>
선언 
<code>
ArrayList<Judge> members = new ArrayList<Judge>(n);
</code>
추가
<code>
members.add(new Judge(temp, des));
</code>

출력
<code>
System.out.print(members.get(i).age + " " + members.get(i).name + "\n");
</code>
</pre>

이번에는 Arrays.sort가 아닌 Collections.sort를 사용하였다. 사용법은 Arrays.sort와 비슷하였다.<br>
Arrays.sort는 배열을 정렬해주는 데 용이한 반면 Collections.sort는 클래스의 객체를 정렬하는데 사용된다.
