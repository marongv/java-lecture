import kr.education.StudentExample;

class Student extends StudentExample {
	String name = "박경란";
	int grade = 2;
	void printMySelf() {
		this.age = 10;
		System.out.println("내 이름은 " + name + "이고, " + grade + "학년 입니다.");
	}
}