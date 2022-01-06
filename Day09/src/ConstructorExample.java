
public class ConstructorExample {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.printMyNum();
		Bus bus2 = new Bus(1000);
		bus2.printMyNum();
		
	}
	
}


// 생성자를 선언하는 방법. - 변수초기화, 생성자 오버로딩
// 클래스명(매개변수) {..내용..}
class Bus extends Vehicle{ // 가장 하위 클래스
	
	int num = 503; // 속성/멤버/필드
	
	//-- 생성자 선언-------------
	Bus(){
		super();
		num = 200;
	}
	
	Bus(int num){
		super(4); // new Vehicle(4); 바로 위의 아버지 클래스 호출
		this.num = num;
	}
	
//	Bus(double bus_num){
//		this.num = (int)bus_num;
//	}
	
	//--------------------------
	
	void printMyNum() {
		System.out.println(num);
	}
}

// 탈것 클래스 
class Vehicle{
	int wheelCnt;
	Vehicle(){}
	Vehicle(int wheelCnt){
		this.wheelCnt = wheelCnt;
	}
}