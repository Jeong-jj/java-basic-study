# 4.1강 실행 - Hello World

- 2023/09/27
- 4.1강 Hello World 출력
    - 1강 - 3강 수업 소개 및 실행환경 세팅이므로 생략

<br/>

## 이론과 실습

- Hello World 출력원리

    1. `class` 이름은 파일 이름과 동일하게 작성한다.
        - 실행 시 파일이름과 같은 class를 찾기 때문
    2. class안에 `main` 메소드가 있음
        - 이 main은 약속되어있는 이름
    3. `java` 를 실행하면 `class` 파일로 컴파일 된다.
    4. `JVM(Java Virtual Machine)`이 알아들을 수 있는 Class  파일로 만드는것

    따라서 HelloWorldApp 이라는 class 안에 있는 main이라는 메소드를 출력하여 보여주는 것
- 참고 및 실습코드

```java
public class HelloWorldApp {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
```
(
```javascript
function NA(a) {
    console.log(a)
}

NA()
```

```typescript
function NA(a: string): void {
    console.log(a)
}

function JO(a: number): string {
    return String(a)
}
```

<br/>

## 복기

<br/>

## 추가 공부
### 참고 링크
