
public class GuGuExample {
	public static void main(String[] args) {
		
		//for(int x = 2; x <= 10; x++)
		System.out.println("for������ �ۼ�");
		for(int x = 2; x <= 9; x++) {
			
			//if(x % 2 != 0) continue; // continue�� ���� ������ �����ϰ� ó������ ���ư� �׷��� Ȧ���϶��� ���ư��� ����� ��������
			
			for(int y = 1; y <= 9; y++) {
				System.out.println(x + "*" + y + "=" + (x*y));
				if(y == 3) break;
			}
			
			if(x == 5) break;
		}
		
		//while������ �ٲٱ�
		
//		System.out.println("while ������ �ۼ�");
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
		
		System.out.println("���");
		System.out.println("���2");
		
		System.out.print("���3\t");
		System.out.print("���4");
		
	}
	
	
}
