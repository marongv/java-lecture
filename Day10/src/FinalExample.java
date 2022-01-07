// final
// 클래스, 메서드, 속성
// ex) 클래스에 final = 상속 안하겠다.
// ex) 메서드에 final = 오버라이딩을 허용 안하겠다.
// ex) 속성에 final = 값을 변경할 수 없게 하겠다.
// final class 클래스명
// final 리턴타입 메서드명 (매개변수)
// final 데이터타입 변수명 = 값

//-- 상수명
//final static 데이터타입 상수명 = 10;
//final static double PI = 3.1451234523; -> 상수명은 대문자로

public class FinalExample {
	static final double PI = 3.141592653; //static과 final의 위치는 바뀌어도 상관없음
	public static void main(String[] args) {
//		A0 a0 = new B0();
//		a0.printName();
	}

}


//-- final 메소드 예제
//class A0{
//	void printName() {
//		System.out.println("노노노");
//	}
//}

//class B0 extends A0{
//	final void printName() {
//		System.out.println("나나나");
//	}
//}

// 아버지 B0의 메서드가 final이므로, 메서드 중첩(오버라이딩)을 할 수 없다.
//class C0 extends B0{
//	void printName() {//error
//		
//	}
//}


//-- final 속성(변수)예제
// final 속성/ 변수는 한번 초기화(값이 들어간이후) 변경이 불가능하다.
// 다만 생성자를 통한 초기화의 경우만 예외로 한다.
//class A0{
//	final int grade;
//	A0(int grade){
//		this.grade = grade;
//	}
//}

//class B0 extends A0{
//	void changeGrade() {
//		//값 직접입력은 불가능
//		//this.grade = 5;
//	}
//}


//-- final 클래스 예제
//final class A0{
//	String name = "노노노";
//}
//
////final class는 상속을 할 수 없으므로 에러를 발생시킨다
//class B0 extends A0{ }