# 4.1강 실행 - Hello World

- 2023/09/17
- 4.1강 Hello World 출력해보기
  - 1강부터 3강까지는 수업 소개 및 실행환경 세팅이므로 정리 생략

<br/>

## 이론과 실습

- java 프로젝트는 어떻게 실행 되는가?

  1. `class` 이름은 파일 이름과 동일하게 작성한다.
     - 실행 시 파일이름과 같은 class를 찾기 떄문
  2. 그리고 class안에는 `main`이라는 이름의 메소드를 작성한다.
     - 이 main이라는 이름은 약속되어 있는 이름이다.
  3. `java`파일을 실행시키면 이는 `class`로 컴파일 된다.
     - 이 class파일은 컴퓨터가 인지할 수 있는 코드로 되어 있다.

- 참고 및 실습 코드

```java
public class Test {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```

<br/>

## 복기

- java에는 약속된 규칙같은 것이 있다.
  - 이를 기반으로 java app이 실행된다.
- `sysout`를 입력하고 `ctrl + space` 단축어를 통해 `System.out.println()` 출력 명령어를 쉽게 작성할 수 있다.

<br/>

## 추가 공부

- console에 찍기 위해 사용한 `println`은 무슨 뜻일까 싶어서 찾아보았다.
  - 뜻을 찾진 못했지만 console을 찍을 수 있는 다른 방법을 찾게 됨

### console 방법 정리

1. `print`: 데이터 타입에 구애 받지 않고 문자 자체로 출력한다.
   - 개행 문자 등을 인식하지 못하기 때문에 줄바꿈이 필요없는 단순한 문자 출력시 사용
2. `println`: print와 차이는 `\n`과 같은 개행문자를 인식한다.
3. `printf`: 파라미터로 **String형태 서식** & **서식에 들어갈 값**을 받고 이 서식에 값을 넣은 결과를 출력한다.
   - 서식을 작성하는 규칙 문자도 존재한다. 이는 첨부하는 링크 참고.
     - 넣고자 하는 값들의 format을 서식에 규칙 문자로 작성하는 것
   - 아마 `f`는 function의 약자인 것 같다.
   - ```java
     public class PrintF {
       public static void main(String[] args) {
         double d = 3.14;
         int i = 2;
         System.out.printf('%f X %d = %.2f', d, i, (d*i));
       }
     }
     ```
     - `%f`: 부동 소수점 10진수 출력
     - `%d`: 정수 출력
     - `%.2f`: 부동 소수점 10진수이지만 `.2`라는 숫자를 넣어 소수점을 2자리로 제한
       - 출력 결과는 **3.14 X 2 = 6.28**

---

### 참고 링크

1. https://starrecode.tistory.com/10
2. https://beingdesigner.tistory.com/10
