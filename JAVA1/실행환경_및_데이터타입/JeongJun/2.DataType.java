public class Datatype {
	public static void main(String[] args) {
		// ============== Number Type
		System.out.println(6); // Number 6
		System.out.println("6"); // String 6
		
		System.out.println("Six"); // String
		
		System.out.println(6+6); // 12
		System.out.println("6"+"6"); // 66 문자열에서는 결합 연산자로써 문자열을 합쳐줌
		
		System.out.println(6*6); // 36
		// System.out.println("6"*"6"); // 문자열의 곱하기는 연산 불가
		
		
		// =============== String Type
		System.out.println("Hello"); // String
		System.out.println('H'); // Character
		
		// new line
		System.out.println("Hello \nWorld");
		// escape
		System.out.println("Hello \"World\""); // Hello "World"
		
		// ============= String Operator
		System.out.println("Hello [name] ... bye.".replace("[name]", "Java"));
	}
}