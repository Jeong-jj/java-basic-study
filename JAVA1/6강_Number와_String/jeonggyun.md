# 6강 테이터 타임과 연산

- 2023/09/17
- 6.1 ~ 6.5 테이터 타임과 문자열을 왜 나누고 어떻게 연산되는지 확인한다

<br/>

## 이론과 실습
- 자바에는 기본적인 사직연산 미적분 등 다양한 수학적 사용이 가능하다
- Datatape
	1. `Number`은 그 차제로 사용
	2. ""로 표현하면 `string`
	3. 단어 하나만 표현 할 경우 '' -> `char`
	4. `Math`에서 PI는 내림, ceil 올림
	5. `length` 문자의 길이
	6. 컴퓨터는 기본적으로 `0`부터 시작
### Number & String

- 참고 및 실습코드

```java
public class Datatype {

	public static void main(String[] args) {
		System.out.println(6); // Number
		System.out.println("six"); // String
		
		System.out.println("6"); // String 6
		
		System.out.println(6+6); // 12
		System.out.println("6"+"6"); // 66
		
		System.out.println(6*6); // 36
//		System.out.println("6"*"6"); -> 실행불가 문자 곱하기 문
		
		System.out.println("1111".length()); // 4
//		System.out.println(1111.length()); -> String에서 길이를 확인 따라서 따음표 필요
		
		System.out.println("Hello World"); //String 문자열
		System.out.println('H'); //Char 문자
		System.out.println("H");
		
		// Operator
		System.out.println(6 + 2); // 8
		System.out.println(6 - 2); // 4
		System.out.println(6 * 2); // 12
		System.out.println(6 / 2); // 3

		System.out.println(Math.PI); // 3.141592653589793
		System.out.println(Math.floor(Math.PI));
		System.out.println(Math.ceil(Math.PI));

		
		// Character VS String 
		System.out.println("Hello World"); // String
		System.out.println('H'); // Character
		
			
		System.out.println("Hello "
						+ "World");
				
		// new line
		System.out.println("Hello \nWorld");
				
		// escape
		System.out.println("Hello \"World\"");// Hello "World"
		
		// later
		System.out.println("Hello World".length()); // 11
		System.out.println("Hello, [[[name]]] ... bye. ".replace("[[[name]]]", "duru"));
	}

}
``````

<br/>

## 복기

<br/>

## 추가 공부
### 참고 링크