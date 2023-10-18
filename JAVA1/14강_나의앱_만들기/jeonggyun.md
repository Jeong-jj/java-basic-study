# 14강 나의 앱 만들기
- 2023/09/29
- java 1 강의에서 배운 내용으로 간단한 앱 만들기

- 이 앱을 통해 기본 개념 이해
    - 조건문
    - 배열
    - 반복문
    - 메소드
    - 클래스
    - 인스턴스

<br/>

## 이론과 실습

- 앱 만들기
    - 공급가(Value of supply): 10000.0
    - 부가가치세(VAT): 10%
    - 비용(Expense): 공급가에 30%
    - 수익(income): 공급가 - 비용
    - 동업자 배분: 5 : 3 : 2

```java
public class AccountingApp{
    public static void main(string[] args){
        System.out.println("Value of supply" + 10000.0);
        System.out.println("VAT" + (10000.0 * 0.1));
        System.out.println("Expense" + (10000.0 * 0.3));
        System.out.println("income" + (10000.0 - 10000.0 * 0.3));
        System.out.println("dividend1" + ((10000.0 - 100000.0 * 0.3)*0.5));
        System.out.println("dividend2" + ((10000.0 - 100000.0 * 0.3)*0.3));
        System.out.println("dividend3" + ((10000.0 - 100000.0 * 0.3)*0.2));
        
}
```

조금 더 간단히 정리하기 위해  `"변수"` 도입
```java
//Extract Local Variable 기능을 통해 변수화 가능
public class AccountingApp {
 
    public static void main(String[] args) {
 
        double valueOfSupply = 10000.0;
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = income * 0.5;
        double dividend2 = income * 0.3;
        double dividend3 = income * 0.2;
 
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
 
    }
 
}
```
- `제어문`: 프로그램의 실행이 조건에 따라 바뀌는 것
    - 자바에 제어문은 `반복문`과 `조건문`이 존재
    - ex. 수익(income)이 10000.0이 넘을 경우 수익 배분을 유지하고 만약 10000.0보다 이하라면 모든 수익은 1번에게 간다라는 조건이 들어간다면 이때 `조건문`을 사용한다.

    ```java
    if(income>10000.0){
        dividend1 = income * 0.5;
        dividend2 = income * 0.3;
        dividend3 = income * 0.2;
    else{
        dividend1 = income * 1.0;
        dividend2 = income * 0;
        dividend3 = income *0;
    }
    }
    ```
- `배열(array)`: 배열은 같은 타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스(index)를 부여해놓은 자료구조입니다.
    - why: 변수는 하나의 데이터를 저장하는데 만약 데이터 양이 커진다면 변수에 갯수 또한 많아진다 따라서 관리도 힘들고 비효율 적이기 떄문에 배열을 사용
    - 앞서 배운 main 메소드에 있는 `args` 파라미터는 String 자료를 여러 개 담을 수 있는 `문자열 배열` 
    ```java
    //각 사람의 권리를 변수화
    double rate1 = 0.5;
    double rate2 = 0.3;
    double rate3 = 0.2;
    //...
    double dividend1 = income * rate1;
    double dividend2 = income * rate2;
    double dividend3 = income * rate3;
    //만약 rate가 많아지거나 만약 rate사이에 엄청 많은 다른 코드들이 존재한다면 관리가 힘들어진다 따라서 이때 사용하는게 배열[]

    double[] dividendrates = new double[3];
    dividendrates[0] = 0,5;
    dividendrates[1] = 0.3;
    dividendrates[2] = 0.2;

    double dividend1 = income * dividendrates[0];
    double dividend2 = income * dividendrates[1];
    double dividend3 = income * dividendrates[2];
    // 변수가 3개에서 1개로 됨 따라서 변수가 오염 될 가능성도 낮아진다.
    ```

- `반복문`: 조건이 참인 한, 해당되는 구간을 계속 반복하는것
    - for문 : 정해진 횟수만큼 반복 실행할 때 사용
    - while 문 : 조건이 참인 동안 반복 실행 반복 횟수가 불확실한 경우에 사용
    - do-while문 : while문과 비슷하지만, 일단 코드 블록을 먼저 실행한 후에 조건을 검사
    ```java
    // 배열과 반복문을 섞어서 사용
    // 만약 동업자가 1억명이라면 배분 코드가 엄청 길어질 것 따라서 반복문을 사용 
    double[] dividendrates = new double[3];
    dividendrates[0] = 0,5;
    dividendrates[1] = 0.3;
    dividendrates[2] = 0.2;
    
    double dividend1 = income * dividendrates[0];
    double dividend2 = income * dividendrates[1];
    double dividend3 = income * dividendrates[2];

    int i = 0; // 몇번 반복 되는지를 i에 기록
    while(i < dividendrates.length){ // dividendrates에 배열의 갯수 만큼 실행 된다.
        System.out.println("Dividend: " + income * dividendrates[i])
        i = i + 1;
    }
    ```

    - `메소드`
    1. 클래스의 동작을 나타내는 함수, 서로 연관된 코드를 그룹핑해서 이름을 붙힌 정리정돈된 상자
    2. 메소드란 입력 값에 따른 결과를 반환하는 코드 묶음
    3. 간단한 호출으로 여러 줄의 코드를 수행할 수 있다.
    4. 호출부와 정의부로 나뉘어 동작
        - 호출부 : 메소드를 사용하는 영역
        - 정의부 : 입력값을 받아서 결과(반환값)를 만드는 코드 묶음
    - why: 중복되는 코드의 반복적인 프로그래밍을 피할 수 있음

    <img width="438" alt="스크린샷 2023-10-12 오후 4 01 56" src="https://github.com/Jeong-jj/java-basic-study/assets/144773042/4aacc96c-bd9f-4d8b-a5a7-8b2f11c49683">
    
    ```java
    //추출하는 방법
    //vat의 값에 해당하는 부분을 블록으로 지정한 후 Refactor - Extract Method를 클릭
    public class AccountingMethodApp {

    public static void main(String[] args) {
 
        ...

        double vat = getVAT(valueOfSupply, vatRate);
        // vat변수는 getVAT메소드를 통해 값을 가져옴

        ...
    }

	public static double getVAT(double valueOfSupply, double vatRate) {
		return valueOfSupply * vatRate;
        //getVAT는 main 메소드의 내부의 변수(지역 변수)인 valueOfSupply와 vatRate를 파라미터로 사용
    //여기서 지역변수를 전역변수로 바꾸면 메소드 안에 파라미터를 없게 할 수 있음
    //getVAT의 아규먼트로 주고 있는 valueOfSupply와 vatRate 변수에서 Refactor - Convert Local Variable to Filed를 클릭 전역 변수는 Field
	}
    ```
- `클래스`: 객체라고 부르기도함, 서로 연관된 변수와 메소드를 그룹핑한 것
    1. `객체(object)`란: 물리적으로 존재 혹은 추상적(생각)으로 존재하는 것 중에서 자신과 다른 것을 식별하는 것
        - 쉽게 사람, 휴대폰으로 본다면
        - 사람
            - 물리적속성: 키, 몸무게, 나이
            - 추상적동작: 생각, 먹기, 말하기
        - 핸드폰
            - 물리적속성: 색상, 크기
            - 추상적동작: 누른다. 받는다
    2. 자바에서 이러한 객체에 속성(field), 동작(method)라고 한다.
    3. 자바는 객체지향프로그램

    ```java
    //window - over view - outline
    ```
    <img width="183" alt="스크린샷 2023-10-12 오후 4 35 11" src="https://github.com/Jeong-jj/java-basic-study/assets/144773042/59a29e69-546c-45da-8c9a-deab08d45a26">

    ```java
    // 클래스에 있는 변수와 메소드를 확인 가능
    // 이걸 정리
    class Accounting{
    //메인에 있는 메소드와 변수를 class로 옮김
    }
    ```
    <img width="178" alt="스크린샷 2023-10-12 오후 4 39 08" src="https://github.com/Jeong-jj/java-basic-study/assets/144773042/ee6fb95e-ba32-40ec-aea3-73b623e63272">

    

    

