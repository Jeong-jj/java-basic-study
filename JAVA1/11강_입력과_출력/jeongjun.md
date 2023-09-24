# 11강 Input/Output & Parameter/Arguments

- 2023/09/24
- 11강 Input과 Output & eclipse에서 Arguments 설정하기

<br/>

## 이론과 실습

### Input받기

- Java에서 사용자에게 직접 input을 받아서 main메소드에 전달할 수 있다.

  - 이 땐 외부 라이브러리를 import해서 사용한다.  
    우리 수업에서는 `swing`을 사용함.
    > 원하는 기능이 있을 때는 검색을 하자!

  ```java
  import javax.swing.JOptionPane;

  public class OkJavaGoinHomeInput {

  public static void main(String[] args) {
  	String id = JOptionPane.showInputDialog("Enter a ID");

    // Elevator call
  	Elevator myElevator = new Elevator(id);
  	myElevator.callForUp(1);

    // ... code 생략
  }
  ```

  - 이제 input을 통해 받은 값을 `id`로 저장하고, 이는 아래 작성한 class들에서 사용된다.

### Parameter조건 맞추기

- 메소드, 함수를 작성하면서 parameter(매개변수)의 타입을 지정하게 된다. 그렇기 때문에 arguments(인자)로 받으려는 값이 이 parameter의 타입과 다르면 에러가 발생한다.

  - input으로 받은 인자의 타입이 매개변수와 다르다면 변환을 통해 실행할 수 있다.

  #### 1) Error 예시: type이 맞지 않음

  ```java
  import javax.swing.JOptionPane;
  import org.opentutorials.iot.*;

  public class OkJavaGoinHomeInput {

  	public static void main(String[] args) {
  		String id = JOptionPane.showInputDialog("Enter a ID");
  		String bright = JOptionPane.showInputDialog("Enter Bright");

  		// Input 받은 bright 사용
  		DimmingLights moodLamp = new DimmingLights(id + " mood Lamp");
  		moodLamp.setBright(bright);
      //       ~~~~~~~~~~ Type Error
  		moodLamp.on();
  	}
  }
  ```

  - 위 예시에서 밑줄 친 부분에서 에러가 발생한다.
    - setBright메소드에 들어가야할 매개변수의 타입은 `double`이어야 하는데 넣어주는 인자의 타입은 `string`이기 때문
    - 이제 이결 변환하여 해결해보자.

  #### 2) Type 변환

  ```java
  import javax.swing.JOptionPane;
  import org.opentutorials.iot.*;

  public class OkJavaGoinHomeInput {

  	public static void main(String[] args) {
  		String id = JOptionPane.showInputDialog("Enter a ID");
  		String bright = JOptionPane.showInputDialog("Enter Bright");

  		// Input 받은 bright 사용
  		DimmingLights moodLamp = new DimmingLights(id + " mood Lamp");
  		moodLamp.setBright(Double.parseDouble(bright)); // double로 변환
  		moodLamp.on();
  	}
  }
  ```

  - 👀실행 결과:
    ![실습 결과](https://github.com/Jeong-jj/java-basic-study/assets/96231175/5b06fb79-b5fd-46ce-95f9-bd3800f6f64a)
    - id input은 홍길동 입력
    - bright input은 33입력

<br/>

## 복기

- parameter에 맞게 arguments를 넣어주자.
- 단, 원한다면 형변환으로 맞춰줄 수 있다.
  - 이번 수업에서 `Double.parseDouble();`이라는 형변환 메소드를 하나 알게 되었다.
  - 그치만 이 경우엔 여러 side effect가 있을 수 있을 것 같다.
    - 예를 들어 예시에선 `"33"`이라는 숫자로된 string 입력받아서 메소드를 통해 `33` double로 변환하였지만, 만약 사용자가 `"삼십삼"`과 같이 문자열을 입력한다면? 고려해야할 점들이 많이 생길 것이다.
