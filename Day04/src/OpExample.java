//단항연산자(증감연산)
public class OpExample {
	public static void main(String[] args) {
		
		//1. ++
		int a = 10;
		a ++; // a = a + 1;
		System.out.println("a ++ = " + a);
		++ a; // a = a + 1;
		System.out.println("++ a = " + a); // 12
		
		//System.out.println(a ++); // 결과값 12
		System.out.println(++ a);
		
		int b = 10;
		System.out.println(b++);
		System.out.println(b);
		
		int c = 10;
		System.out.println(++c);
		System.out.println(c);
		
		//2. --
		int d = 10;
		System.out.println(d --);
		System.out.println(d);
		
		int e = 10;
		System.out.println(-- e);
		System.out.println(e);
		
	}

}
