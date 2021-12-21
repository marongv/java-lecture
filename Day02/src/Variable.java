// 변수
// 변수 명령 규칙은 단봉낙타 

public class Variable {
	public static void main(String[] args) {
		
		//자료형 변수명 = 데이터;
		
		int a = 10;
		int x;
		int myAge = 20;
		
		System.out.println(a);
		System.out.println(a + a);
		System.out.println(a * a);
		
		x = 9;
		x = a - x;
		
		System.out.println(x + myAge);
		
		// 변수의 문법적 특징
		// 1. 변수의 시작은 숫자일 수 없다.
		// int 0name; -- error
		// int name0; -- 정상
		
		// 2. 변수의 이름은 예약어는 안됨
		// int class; -- 자바 컴파일러가 이미 사용하고있음. 예약어인 class는 사용불가
		
		// 3. 공백을 허용하지 않는다.
		// int iAmSam -- 사용가능
		// int i am sam -- error
		
		// 4. 같은 Scope(블록 { --- })에 같은 이름의 변수는 허용되지 않는다.
		// int im = 10;
		// int im;
		
		// 5. 대소문자 구분한다.
		// int imABoy = 10;
		// int imaBoy = 9; -- 별개로 인식
		
	}

}
