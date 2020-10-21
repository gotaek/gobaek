# 백준 9375 패션왕 신해빈

## 1. 풀이방법
만약 모자 3, 상의 2, 하의 2 이라면 안 입는 경우의 수를 포함시켜 4 * 2 * 3을 해주어야 한다. 그 후 모두 안 입는 경우 한가지를 빼준다.<br>
그러면 위의 상황에선 23가지의 경우의 수가 나온다. 

## 2.HashMap
이 문제를 해결하기 위해서는 옷의 종류가 기존에 있던 것인지 아닌지를 확인하면서 업데이트를 해주어야 풀 수 있다. <br>
이를 어떻게 해결해야 할 지 몰라 블로그를 참고했더니 HashMap을 사용해야 한다는 것을 깨달았다.<br>

<pre>
<code>
HashMap<String,Integer> set=new HashMap<>();
</code>
위와 같이 HashMap을 선언해줄 수 있다. Key값은 String 형이고, Value는 Integer형이라는 HashMap을 만든다는 의미이다.
</pre>

<pre>
<code>
set.containsKey(type)
</cdoe>
이 코드는 set에 type이라는 Key가 존재하는지 확인하는 함수이다. 옷의 종류가 이미 있는지 확인하기 위해 사용했다.
</pre>
<pre>
<code>
int add=set.get(type);
set.put(type,add+1)
</code>
type이라는 Key를 사용해 add에 Value를 받아오고 add에 1을 더한 값을 새롭게 업데이트한다.<br>
만약 입력되는 키 값이 HashMap 내부에 존재한다면 기존의 값은 새로 입력되는 값으로 대체 된다고 한다.
</pre>
<pre>
<code>
set.values()
</code>
HashMap의 value들을 가져오기 때문에<code>for(int val:set.values())</code>와 같이 사용할 수 있다.
</pre>
