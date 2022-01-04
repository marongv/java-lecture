
public class Application2 {
	
	public static void main(String[] args) {
//		Korean k = new Korean();
//		k.name = "나는 한국인";
//		k.sayHello();
		
		Person p = new Japanese();
		p.name = "나까무라";
		p.sayHello();
		
	}

}



//class 문법
//[접근한정자] class 클래스명 { // 내용 }
class Person{
	
	String name; // 속성
	
	public void sayHello() { // 메서드
		System.out.println( name + "입니다. 안녕하세요.");
	}
	
}

// 상속은 extends [class명]
class Korean extends Person {
	public void sayHello() {
		System.out.println(name + "입니다. 안녕하세요.");
	}
}

class Japanese extends Person {
	public void sayHello() {
		System.out.println(name + "입니다. 곤니찌와.");
	}
}

class Chinese extends Person {
	public void sayHello() {
		System.out.println(name + "입니다. 니하오.");
	}
}