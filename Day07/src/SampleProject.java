import java.util.*;

public class SampleProject {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);;
		//String input;
		int input;
		String[] arrMonthName =  { 
				"Jan",
				"Feb",
				"Mar",
				"Apr",
				"May",
				"Jun",
				"July",
				"Aug",
				"Sep",
				"Oct",
				"Nov",
				"Dec"				
		};
		
		
		while(true) {
			System.out.print("숫자를 입력해주세요.(종료 0) > ");
			input = sc.nextInt();
			
			if(input== 0)  	break;
			System.out.println(input + "월은 영어로 " + arrMonthName[input-1] + "입니다.");
		
		
//		
//		while(true) {
//			System.out.print("문자열을 입력해 주세요 > ");
//			input = sc.nextInt();
//			
//			if(input.indexOf("quit") >= 0) {
//				System.out.println("프로그램 종료.");
//				break;
//			}			
			
			System.out.println("입력값은 '" + input + "' 입니다.");
			
			
			
		}

		sc.close();
		System.out.println("프로그램 종료.");
		
	}

}
