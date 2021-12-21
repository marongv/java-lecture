
public class LiteralExample {
	public static void main(String[] args) {
		
		//-- 리터럴(이스케이프 시퀀스)
		String desc = "\"집에\"\n 가고\n 싶\t다";
		System.out.println(desc);
		
		// 집에 가고 싶다.
		// "집에" 가고 싶다. -> "\"집에\" 가고 싶다"
		// "집에"\n (뉴라인)
		// 가고
		// 싶      다 -> 싶\t다 (탭)
		
	}

}
