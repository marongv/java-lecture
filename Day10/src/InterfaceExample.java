// 인터페이스는
// 접근제한자 interface 인터페이스명

//-- 인터넷 접속용 인터페이스
public interface InterfaceExample {
	void connect();
	void close();
	void speedUp();
	void speedDown();
}

class SKInternet implements InterfaceExample{

	
	public void connect() {
		System.out.println("연결하기(SK)");
	}

	public void close() {
		System.out.println("닫기(SK)");
	}

	public void speedUp() {
		System.out.println("속도 올리기(SK)");
	}

	public void speedDown() {
		System.out.println("속도 내리기(SK)");
	}
	
}

class LGInternet implements InterfaceExample{

	
	public void connect() {
		System.out.println("연결하기(LG)");
	}

	public void close() {
		System.out.println("닫기(LG)");
	}

	public void speedUp() {
		System.out.println("속도 올리기(LG)");
	}

	public void speedDown() {
		System.out.println("속도 내리기(LG)");
	}
	
}