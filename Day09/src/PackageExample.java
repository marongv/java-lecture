import student.EleStudent;
//student 패키지/폴더에 EleStudent 라는 클래스만 참조할때 

//import student.*;
//student 패키지/폴더에 있는 모든 클래스들을 참조할 수 있다.

public class PackageExample {
	public static void main(String[] args) {
		
		//student.EleStudent ele = new student.EleStudent();
		//import하지않고 사용하는법
		
		EleStudent ele = new EleStudent();
		ele.name = "박경란";
		ele.grade = 5;
		
	}

}
