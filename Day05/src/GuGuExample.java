
public class GuGuExample {
	public static void main(String[] args) {
		
		//for(int x = 2; x <= 10; x++)
		System.out.println("for문으로 작성");
		for(int x = 2; x <= 9; x++) {
			
			//if(x % 2 != 0) continue; // continue는 밑의 수식을 무시하고 처음으로 돌아감 그래서 홀수일때는 돌아가서 출력이 되지않음
			
			for(int y = 1; y <= 9; y++) {
				System.out.println(x + "*" + y + "=" + (x*y));
				if(y == 3) break;
			}
			
			if(x == 5) break;
		}
		
		//while문으로 바꾸기
		
//		System.out.println("while 문으로 작성");
//		int x = 2, y = 1;
//		
//		while(x <= 9) {
//			while(y <= 9) {
//				System.out.println(x + "*" + y + "=" + (x*y));
//				y++;
//			}
//			y = 1;
//			x++;
//		}
		
		System.out.println("출력");
		System.out.println("출력2");
		
		System.out.print("출력3\t");
		System.out.print("출력4");
		
	}
	
	
}
