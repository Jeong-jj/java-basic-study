# 11강 입력과 출력

- 2023/09/24
- 프로그램의 입력(`input`)과 출력(`output`)
- 아규먼트(`arguments`), 파라미터(`parameter`)
<br/>

## 이론과 실습

- 실습코드
```java
import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeinput {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a id");
		String brigth = JOptionPane.showInputDialog("Enter a brigth level");
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);

		JG = {
			name: string,
			age: number,
			height: number
		}
		JG jeonggyun = {
			name: 'JG',
			age: 29,
			height: 'asd'
		}
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" mood Lamp");
		moodLamp.setBright(Double.parseDouble(brigth));
		moodLamp.on();

	}


}
```

### 1) 프로그램이 입력을 받을 수 있게 하기 -> `input`
- `JOptionPane` 객체 안에 있는 `showInputDialog` 메소드를 사용하여 다이어로그 창을 입력해 id를 받을 수 있다.
    - import 구문으로 `객체` 를 부른다
    - ```java
        import javax.swing.JOptionPane;
         ```

- `showInputDialog` 메소드를 이용하여 정보를 입력받고 스트링 데이터로 바꾼다
    - ```java
        import javax.swing.JOptionPane;
        String id = JOptionPane.showInputDialog("Enter a id");
        ```

### 2) arguments 와 parameter
- 앞에 프로그램에서 우리는 id값을 받아 출력하였다 이때 매번 입력하는게 귀찮다면? 이클립스에서는 이런 번거로운 행동을 줄여주는 arguments라는게 존재
    - run 버튼 팝업안에 configurations
    - arguments 값을 미리 정함
    - args(parameter)는 아규먼트 값을 받음
    - id부분을 args[0]; 으로 수정
    - ```java
         Sring id = args[0]; // 프로그램에서는 0이 시작
         String bright = args[1];
        ```


<br/>

## 복기

<br/>

## 추가 공부
### 참고 링크