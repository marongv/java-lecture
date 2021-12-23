
public class MathExample {
	//산술연산
	public static void main(String[]args) {
		
		// +,-,*,/,%
		
		int a = 10;
		int b = 20;
		
		//-- 변수사용시 a(4bytes) + b(4bytes) = 8bytes (더 효율적임)
		System.out.println(a + b + a + b + b);		
		//-- 토탈 사용 바이트는 4 * 5 = 20바이트
		//System.out.println(10 + 20 + 10 + 20 + 20);
		
		System.out.println(a - b);
		
		System.out.println(a * b);
		
		System.out.println("a / b = " + (a / b));
		// 나눗셈 (0.5지만 기본 정수형은 int이기 때문에 0을 출력한다.)
		
		int c = 15;
		
		System.out.println("c % a =" + (c % a)); // 나눗셈 후 나머지값 구하기
		
	}

}
