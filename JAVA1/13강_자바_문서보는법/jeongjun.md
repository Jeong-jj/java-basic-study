# 13강 java문서 보는 법과 Instance, Inheritance

- 2023/10/02
- 13강 java문서 보는 법과 Instance에 대해 이해하기

<br/>

## 이론과 실습

[java api documentation](https://docs.oracle.com/javase/8/docs/api/)에 접속하면 java의 api를 확인할 수 있다.

- 이곳에서 원하는 기능과 관련된 class 등을 찾는다.

<br/>

### Class의 Instance

- `instance`란 class 생성자로 만들어진 객체이다.
  - 각 instance는 같은 class로 만들어졌어도, 각자의 상태를 가진다.
  - instance는 `contructor`를 통해 만들 수 있다.
    - instance를 만들 떈 해당 instance가 어떠한 값이 될 수 있는지 규제하기 위해 앞에 class를 붙여준다.
    ```java
    PrintWriter p1 = new PrintWriter("result1.txt");
    ```

> **언제 instance를 만드느냐?**
>
> - 일회용으로 class를 사용할 땐 필요가 없지만 계속해서 같은 class의 응용이 연달아 이어진다면 instance의 생성이 더 효율적이다.

<br/>

### Inheritance(상속)

이미 있는 class의 값을 그대로 받은 채 새로운 변수나 메소드를 추가하고자 할 때 상속의 개념을 사용할 수 있다.

- 만약 상속받은 class(자식)와 상속한 class(부모)에 동일한 변수나 메소드가 있다면?
  - 자식에서 정의된 변수나 메소드로 덮어쓰기 된다.

<br/>

## 복기

- `package`는 관련있는 `class`가 묶인 것
  - `class`는 관련있는 `변수`와 `메소드`가 묶인 것
- javascript와 동일하게 instance와 상속의 개념이 있어서 이를 생각하며 이해해봄
- class간 상속관계는 api문서를 통해서도 확인할 수 있다.
