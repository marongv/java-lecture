
public class InterfaceExeExample {
	
	public static void main(String[] args) {
		
		// 1. 추상클래스는 new로 객체생성이 불가능
		// 이유는 구현이 안되어 있어서
		// 2. 인터페이스도 new로 객체생성 불가능
		// 이유는 a) interface는 class가 아니라서 객체생성이 불가능  b)  구현이 없어서
		// !) interface는 너와 나의 통신규약을 만드는 것
		
		InterfaceExample im = new SKInternet();
		InterfaceExample im2 = new LGInternet();
		
		im.connect();
		im2.connect();
		
		Father fa = new ImCC();
		AA aa = new ImCC();
		BB bb = new ImCC();
		CC cc = new ImCC();
		
	}

}

class Father{
	
}

class ImCC extends Father implements AA, BB, CC{

	public void aa() {
		
	}

	public void bb() {
		
	}
	
	public void cc() {
		
	}
}

interface AA{
	void aa();
}
interface BB {
	void bb();
}
interface CC {
	void cc();	
} // extends BB