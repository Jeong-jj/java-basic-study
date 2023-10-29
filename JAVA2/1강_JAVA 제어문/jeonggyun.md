# 1강_JAVA 제어문
- 2023/10/11 (수)
- 제어문 
    - Boolean data type
    - 비교 연산자
    - 조건문
    - 반복문+배열
<br/>

## 이론과 실습
### `제어문`
    1.  제어문이란 프로그램의 동작 흐름 조건/반복을 사용하여 제어(변화) 할 수 있는 실행문
        - 프로그램은 위에서 아래 오른쪽에서 왼쪽으로 읽어나감
    2. 제어구조
        - 순차처리: 위에서 아래
        - 조건처리: if, if~else, swich
        - 반복처리: for, while

- `Boolean data type`
    - 참(true) 과 거짓(false)을 표현하는 데이터 타입
        ```java
        System.out.println(true);
        System.out.println(false);

        String foo = "Hello world";
        // contalins 문자열 객체 메소드
        System.out.println(foo.contains("world")); //true
        System.out.println(foo.contains("egoing")); // false
        ```
    - `비교연산자`
        - a > b : a가 b보다 큼
        - a < b : a가 b보다 작음
        - a >= b : a가 b보다 크거나 같음 
        - a <= b : a가 b보다 작거나 같음
        - a == b : a가 b와 같음
        - a != b : a가 b와 같지 않음
        ```java
        System.out.println(1 > 1); // false
        System.out.println(1 == 1); // true
        System.out.println(1 < 1); // false
        System.out.println(1 >= 1); // true
        ```

<br/>

### 조건문 - `if문`
- 조건에 따라 작업을 실행하거나 실행하지 않게함
- 구성요소
    - if
    - 조건식
    - 코드블럭(실행코드)
    - else if
    - else
    ```java
    if (조건식) {
      // code 조건식에는 boolean 타입만 들어감
    } else if (조건식) {
    } else {
    }
     ```

### 조건연산자 - `&&`, `||`
- boolean 데이터를 연산하기 위해 조건연산자 사용
- `&&`: 전항과 후항이 모두 참이면 참을 반환
- `||`: 전항과 후항중 하나라도 참이면 참을 반환, 모두 거짓이면 거짓을 반환
- `&&` 가 `||`보다 우선순위가 높음 
```java
public class AuthApp {
 
    public static void main(String[] args) {
         
        String id = "Jeonggyun";
        String inputId = args[0];
         
        String pass = "1111";
        String inputPass = args[1];
         
        System.out.println("Hi.");
         
        if(inputId.equals(id) && inputPass.equals(pass)) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }       
 
    }
 
}
```

### 연산자 `==` VS 메소드 `equals`
- 원시적데이터타입(자바)
    - `boolean`, `byte`, `char`, `short`, `int`, `long`, `float`, `double`
    - 원시적데이터타입은 선언되면 `메모리{Stack)`에 공간이 할당
    - 메모리 공간안에는 `실제 값`이 들어가게됨
    - 따라서 원시데이터 경우 연산자 `==`는 변수가 가리키는 값을 통해 비교하게 됨 
- `클래스`에서 파생된 다른 모든 클래스는 원시데이터 타임 X
    - 클래스는 `NEW ` 키워드를 사용하여 인스턴스가 만들어짐
    - 또 다른 메모리 구역(`Heap`)에서 새로운 공간에 할당

- <img width="637" alt="스크린샷 2023-10-29 오후 2 06 31" src="https://github.com/Jeong-jj/java-basic-study/assets/144773042/33b5b753-cef4-4c51-9459-a45f373364ae">

- <img width="853" alt="스크린샷 2023-10-29 오후 2 08 58" src="https://github.com/Jeong-jj/java-basic-study/assets/144773042/1ec2af45-784c-446b-9ed3-75c0a0068631">


### 논리연산자 `!`
- `!`는 NOT를 나타내며 참, 거짓을 반전시킴

### 반복문 while, for 그리고 배열
- `whlie` 문
    - 조건식이 참일 동안 까지 반복함
    - 조건식이 true일 경우 무한으로 반복됨
    - ```JAVA
        while(i < 3) {
            System.out.println(2);
            System.out.println(3);
        ```

- `for` 문
    1. 변수의 초기화
    2. 조건식
    3. 1회 반복을 끝내고 수행할 연산
    - ```JAVA
        for(int j=0; j < 3; j++) {
            System.out.println(2);
            System.out.println(3);
        }
        ```

- 배열
    - 같은 데이터타입을 여려개 묶어 놓은 데이터

- 반복문 + 배열
    ```JAVA
    
    public class AuthApp3 {

	public static void main(String[] args) {
		//String[] users = {"egoing", "jeonggyun", "jeongjun"};
		String [][] users = {
				{"egoing", "1111"},
				{"jeonggyun", "2222"},
				{"jeongjun", "3333"}
		};
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(
					current[0].equals(inputId) &&
					current[1].equals(inputPass)
			){
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi, ");
		if(isLogined) {
			System.out.println("Master!!");
		} else
			System.out.println("Who are you?");
		}
    } 
	
    ```