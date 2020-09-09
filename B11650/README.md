# 백준 11650 좌표 정렬하기

## 1. 객체 정렬하기

좌표를 정렬하기 위해서 객체를 만들어 정렬을 해야했다. Arrays.sort를 활용하지만 객체들이 정렬되도록 구현해야했다.

<pre> sort()함수는 다음과 같이 설정되어 있었다. 
<code>
public static <T> void sort( T[]a,Comparotor<? super T> c)
</code>
인자 값으로 객체를 받으며, <? super T> 는 Comparator 상속관계에 있는 타입만 자료형으로 받겠다는 의미다.<br>
즉, T 타입이 자식클래스가 되고, T의 상속관계에 있는 타입까지만 허용하겠다는 의미다.
</pre>

이 문제에서는 첫 번째 인자에는 배열[]을 넣고 두번째에는 Comparator를 상속받은 객체를 넣어야 한다.

----
Arrays.sort(): ex) int[],byte[],boolean[],T[] 등 object Array<br>
Collentions.cort(): ex) ArrayList, LinkedList 등 List collection 정렬의 경우


## 2. Comparable vs Comparator

### Comparable

정렬 수행 시 기본적으로 오름차순으로 정렬된다. <br>
구현방법: 정렬할 객체에 Comparable interface를 implements 후, compareTo() 메소드를 오버라이드하여 구현한다.<br>
compareTo() 메소드 작성법:<br> 현재 객체<파라미터로 넘어온 객체: 음수 리턴<br> 현재 객체==파라미터로 넘어온 객체: 0 리턴<br> 현재 객체>파라미터로 넘어온 객체: 양수 리턴

### Comparator

Comparator 인터페이스는 내림차순이나 다른 기준으로 정렬하고 싶을 때 사용가능하다.<br>
구현방법: Comparator interface를 implements후 compare()메소드를 오버라이드하여 구현한다.<br>
compare() 메소드 작성법:<br>첫 번째 파라미터로 넘어온 객체<두번째 파라미터로 넘어온 객체 :음수리턴<br>
 첫 번째 파라미터로 넘어온 객체>두번째 파라미터로 넘어온 객체: 양수리턴<br>
 첫 번째 파라미터로 넘어온 객체==두번째 파라미터로 넘어온 객체: 0 리턴<br>
 
 ## 3. 익명 클래스 
 
 상속 받은 클래스가 재사용되지 않고 한번 쓰고 버려질 때 주로 익명클래스를 사용한다.
 <pre>
 Example
 
 <code>
 Test t1 = new Test(){ 
     public int num = 10; 
  
     @Override//오버라이딩을 어노테이션
     public int getNum(){ 
        return this.num; 
    } 
 };
 </code>
 </pre>
 
 ## 4. 정리
 
 <pre>
 <code>
 Arrays.sort(arr,new Comparator<int[]>() { //Comparator 인터페이스 재정의

			@Override//annotation
			public int compare(int[] o1, int[] o2) {
				
					
				 if(o1[0]==o2[0])		
					return Integer.compare(o1[1], o2[1]);
					
					return Integer.compare(o1[0], o2[0]); 
			}		
			
		});
 </code> </pre>
 위의 코드는 함수를 실행한 것이다. 두번 째 인자에 Compoarator<int[]> cp=new Comparator<int[]>()을 축약한 것 뿐이다.<br>
 또한 익명클래스를 이용하여 오버라이딩한 것 뿐이다.

출처 및 참고:<https://st-lab.tistory.com/110>, <https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html>
