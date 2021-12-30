import java.util.Scanner;

public class ScanExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해 주세요 > ");
		String input = sc.nextLine(); // next() -> 스페이스, nextline() -> 엔터
		
		System.out.println("입력문자열 : " + input);
		
	}

}
