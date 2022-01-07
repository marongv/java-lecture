
public class AccessExample2 {

}


class A {
	String name = "박경란";
	int age = 10;
}

class B extends A{
	void printAClassMember() {
		this.name = "노노노";
	}
}