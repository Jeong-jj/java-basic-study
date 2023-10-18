# 8강 변수의 정의와 효용 및 변환

- 2023/09/23
- 8강 변수의 정의 및 표현, 데이터 타입의 변환(csatin)

<br/>

## 이론과 실습
 
### 1) 변수의 정의

- 변수는 값을 담는 그릇
- 변수를 지정할 때 변수의 데이터 타입을 먼저 선언한다.

### 2) 자바에서 변수의 표현

- 정수 데이터 integer, `int`
- 실수 데이터 `double`
- 문자열 데이터 `string`

### 3) 변수의 효용

- 변수의 재사용
    - 데이터는 여려번 사용하기 때문에 변수로 사용하면 편히라게 사용이 가능하다
- 코드의 가독성
    - 코드의 흐름과 의미를 파악하는데 도움이 된다.

### 4) 데이터 타입 변환(casting)
- 정수와 실수 간에 차이
```java
double a = 1; //실수가 더 큰 범위이므로 가능
int b = 1.1; //더 작은 범위이므로 불가 0.1이 손실
```
- 정수 및 실수 를 문자열로 변환하기
``` java
string c = integer.tostring(1);
string d = double.tostring(2);
```

## 참고 및 실습코드
``` java

public class Jeonggyun {

	public static void main(String[] args) {
		// Variable
		int a = 1; // Number -> integer  정수
		System.out.println(a);
		
		double b = 1.1; // real number -> 실수
		System.out.println(b);
		
		String c = "Hello World"; // String -> 문자
		System.out.println(c);
		
		// latter 변수 이
		String name = "leezche";
		System.out.println("Hello, "+name+" ... "+name+" ... egoing ... bye");

		double VAT = 10.0;
		System.out.println(VAT);
		//double w = 1.1;
		//double q = 1;
		//double q2 = (double) 1;

		System.out.println(b);

		// int e = 1.1;
		//double r = 1.1;
		int e = (int) 1.1;
		System.out.println(e);

		// 1 to String 
		String f = Integer.toString(1);
		System.out.println(f.getClass());
	}
	
}

```

<br/>

## 복기

<br/>

## 추가 공부
### 참고 링크