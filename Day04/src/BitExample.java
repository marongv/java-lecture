
//��Ʈ����
public class BitExample {
	public static void main(String[] args) {
		int a = 10, b = 11;
		//-- 2���� ���
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		//---
		System.out.println("a | b = " + (a | b));
		System.out.println("a & b = " + (a & b));
		System.out.println("a ^ b = " + (a ^ b));
		
		//----
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(-2));
		
		// Shift ����
		// >>, <<, >>>
		byte x = 10; // -> 00001010 (8bits)
					 // -> 00000010
		System.out.println("x >> 2 = " + (x >> 2));
		
		//-- ���� Shift
		x = -10;
		System.out.println("-10 = " + Integer.toBinaryString(x));
		System.out.println("-10 >> 5 = " + Integer.toBinaryString(x >> 5));
		
		//-- ���� Shift
		System.out.println("-10 << 5 = " + Integer.toBinaryString(x << 5));
		
		byte z = 1;
		System.out.println("1 << 7 = " + ((byte)(z << 7)));
		
	}

}
