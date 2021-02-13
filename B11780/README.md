# 백준 11780 플로이드2

플로이드 1을 변형한 문제이다. 역추적을 통해 지나는 정점을 구해야 했다. <br>
역시 그 정점들을 구하기 쉽지 않아 블로그들을 참고했다. <br>
역추적을 위해 map을 구할때 다음과 같은 코드를 추가해주었다.<br>
<pre>
<code>
next[i][j] = next[k][j];
</code>
</pre>

<pre>
<code>
 for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                if(next[i][j]==INF)
                    System.out.println(0);

                else {
                    int pre = j;
                    stack.push(j);
                    while(i != next[i][pre]) {
                        pre = next[i][pre];
                        stack.push(pre);
                    }
                    System.out.print((stack.size()+1)+" ");
                    System.out.print(i+" ");
                    while(!stack.empty())
                        System.out.print(stack.pop()+" ");
                    System.out.println();
                }
            }
}            
</code>
10000001 1 1 1 3 
5 10000001 1 2 4 
3 5 10000001 3 3 
5 5 1 10000001 4 
5 5 1 2 10000001 
</pre>

참고:https://velog.io/@pss407/%EB%B0%B1%EC%A4%8011780-%ED%94%8C%EB%A1%9C%EC%9D%B4%EB%93%9C-2-9sgpwdkg
