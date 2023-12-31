# 6강 데이터 타입과 연산

- 2023/09/17
- 6.1 ~ 6.5강 Number와 String 데이터 타입과 연산

<br/>

## 이론과 실습

### Number & String

- 참고 및 실습 코드

  1. 데이터의 작성

  ```java
    System.out.println(6); // Number 6
    System.out.println("6"); // String 6

    System.out.println("Six"); // String
  ```

  2. 데이터의 연산

  ```java
    System.out.println(6+6); // 12
    System.out.println("6"+"6"); // 66 문자열에서는 결합 연산자로써 문자열을 합쳐줌

    System.out.println(6*6); // 36
    // System.out.println("6"*"6"); // 문자열의 곱하기는 연산 불가
  ```

  3. Number operator

  - **Operator:** 사칙연산 연산자를 일컫는다.
    - 작성 방법: `-`, `+`, `*`, `/`

  4. String타입 더 알아보기

  ```java
  	System.out.println("Hello"); // String
  	System.out.println('H'); // Character

  	// new line
  	System.out.println("Hello \nWorld");
  	// escape
  	System.out.println("Hello \"World\""); // Hello "World"

  	// ============= String Operator
  	System.out.println("Hello [name] ... bye.".replace("[name]", "Java"));
  ```

<br/>

## 복기

1. java에서 string과 number의 데이터 특징은 내가 사용하는 javascript와 유사함
   - java에서 사칙연산의 연산자는 내가 사용하는 javascript와 같음
2. 새롭게 안 점은 javascript에서는 홑 문자도 `""`안에 작성 가능했지만 java에서는 `Char`라는 별도의 타입으로 인식되고, 사용할 때도 `''`안에 작성해야 한다.

<br/>

## 추가 공부

- ~이 궁금해서 더 찾아봄
