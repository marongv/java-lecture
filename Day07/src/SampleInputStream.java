import java.io.*; //input과 output을 다루는 패키지

public class SampleInputStream {
	
	public static void main(String[] args) throws Exception{
		
		System.out.print("문자를 입력해 주세요 > ");
		InputStream in = System.in; // 입력받는 라인
		//int input = in.read();
		byte[] b = new byte[5];
		int input = in.read(b);
		
		//System.out.println("ASCII Code : " + input + " CharValue : " + (char)input);
		
		for(int i=0; i<b.length; i++) {
			System.out.println("ASCII Code : " + b[i] + " CharValue : " + (char)b[i]);
		}
		
	}
	
}
