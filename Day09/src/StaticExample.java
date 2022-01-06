//1. static은 메모리의 일정공간을 미리 만들어 놓고 모든 객체들이 공유하는 공간이다.
//2. static은 객체생성(new)을 필요로 하지 않는다.
//클래스명.속성 / 클래스명.메서드()
//3. static은 속성, 메서드 등에서 사용될 수 있다.


public class StaticExample {
	public static void main(String[] args) {
		/* BoardObject bd = new BoardObject();
		bd.read();
		bd.read();
		bd.read();
		bd.read();
		
		System.out.println("\nbd2 객체생성");
		BoardObject bd2 = new BoardObject();
		bd2.read(); */
		
		BoardObject.count = 10;
		BoardObject.count ++;
		System.out.println("BoardCount : " + BoardObject.count);
		
		BoardObject.printHello();
		
		BoardObject bd = new BoardObject();
		bd.read();
		
	}

}

class BoardObject {
	static int count = 0;	// static 멤버변수(속성)
	void read() {
		
		this.count ++; //-- 이해를 위해 작성했지만 거의 쓰지않는 방식임
		System.out.println("읽은 수 : " + count);
	}
	
	static void printHello() { // static 메서드
		System.out.println("Hello");
	}
}