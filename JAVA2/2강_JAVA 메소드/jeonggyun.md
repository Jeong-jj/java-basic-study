# 2강_메소드
- 2023/10/18(수)
- 메소드의 기본형식과 의미 입력과 출력을 확인

<br/>

## 이론과 실습

### `메소드`
- 메소드란 클래스와 관련된 함수
- `main메소드`는  특수한 메소드 우리가 클래스를 실행할때 어떠한 명령을 더 내리지 않아도 main메소드는 실행한다.
- `equal`, `floor`, `contain`등 다 메소드다

### 메소드의 기본구조와 변형
- ```JAVA
    public static void printTwoTimesA() {
        System.out.println("-");
        System.out.println("a");
        System.out.println("a");
    }

    // 여기서 매개변수(parameter를 넣어 줄 수 있음
    // parameter -> 메소드에서 통용되는 변수


    public static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);

    // 첫번째로 오는 인자(agument)가 text호출
    // 두번째로 오는 인자(agument)가 dlimiter를 호출

     printTwoTimes("a", "-");
            // 100000000
            printTwoTimes("a", "*");
            // 100000000
            printTwoTimes("a", "&");
            printTwoTimes("b", "!");
    ```

### 값을 반환하는 메소드
- ```JAVA
    import java.io.FileWriter;
    import java.io.IOException;

    public class WhyMethod { 

	public static void main(String[] args) throws IOException {
		String out = twoTimes("a", "-");
		System.out.println(out);
		FileWriter fw = new FileWriter("out.txt");
		fw.write(out);
		fw.close();
		System.out.println(twoTimes("a", "*"));
	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
    }
```




