public class jeonggyun {

	public static void main(String[] args) {
		System.out.println(6); // Number
		System.out.println("six"); // String
		
		System.out.println("6"); // String 6
		
		System.out.println(6+6); // 12
		System.out.println("6"+"6"); // 66
		
		System.out.println(6*6); // 36
//		System.out.println("6"*"6"); -> 실행불가 문자 곱하기 문
		
		System.out.println("1111".length()); // 4
//		System.out.println(1111.length()); -> String에서 길이를 확인 따라서 따음표 필요
		
		System.out.println("Hello World"); //String 문자열
		System.out.println('H'); //Char 문자
		System.out.println("H");
		
		// Operator
		System.out.println(6 + 2); // 8
		System.out.println(6 - 2); // 4
		System.out.println(6 * 2); // 12
		System.out.println(6 / 2); // 3

		System.out.println(Math.PI); // 3.141592653589793
		System.out.println(Math.floor(Math.PI));
		System.out.println(Math.ceil(Math.PI));

		
		// Character VS String 
		System.out.println("Hello World"); // String
		System.out.println('H'); // Character
		
			
		System.out.println("Hello "
						+ "World");
				
		// new line
		System.out.println("Hello \nWorld");
				
		// escape
		System.out.println("Hello \"World\"");// Hello "World"
		
		// later
		System.out.println("Hello World".length()); // 11
		System.out.println("Hello, [[[name]]] ... bye. ".replace("[[[name]]]", "duru"));
	}

}
