
// 반복문은 컴퓨터가 프로그램을 읽는 방식에서 역행(위로 다시 돌아가서 읽게하는)하는 유일한 도구이다.
public class LoopExample {
	
	//for(가장 많이씀), while, do while
	public static void main(String[] args) {
		
		//for(할당식/초기화 ; 조건비교식; 증감연산) {
		//     --여기가 반복실행
		// }
		
		int i = 2;
		
		for( ; i < 10; ) {
			System.out.println(i++);
		}
		
		System.out.println("최종 i값은 " + i + "입니다");
		
		//-- 2. while
		// while(조건식) {
		// 참이면 실행
		// }
		
		System.out.println("while");
		
		int x = 10;
		while(++x < 20) {
			System.out.println(x);
			//if(x++ <20) break;
		}
		
		//-- 3. do while
		//-- do{
		//
		//-- } while(조건식);
		
		x = 10;
		System.out.println("do ~ while");
		do {
			System.out.println(x);
		} while(++x < 20);
		
	}

}
