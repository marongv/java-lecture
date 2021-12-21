
public class TypeCastingExample {
	public static void main(String[] args) {
		// 정수형 데이터 타입
		// 명시적 형변환
		int a = 10; // 4 bytes
		short b = (short)a; // 2 bytes
		System.out.println(b);
		
		// 묵시적 형변환
		short c = 100; // 2 bytes
		int d = c; // 4 bytes
		
		//byte x = 128; // 1 bytes 범위가 -128~127
					  // 범위에서 벗어남
		
		//Example
		int a1 = 128;
		byte x1 = (byte)a1;
		System.out.println(x1); //-- 쓰레기값이 들어감 (-128) error
		
		double xa = 3.141562;
		int xb = (int)xa;
		System.out.println(xb);
		
		int ya = 10;
		double yb = ya;
		System.out.println(yb);
	}

}
