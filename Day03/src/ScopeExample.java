
public class ScopeExample {
	
	static String name = "��¥ ������.";
	
	public static void main(String[] args) {
		//����� ������ �߰�ȣ �������� ������ ��������.
		String name = "�ڰ��";
		System.out.println(name);//�ڰ��
		printName();
				
	}
	
	public static void printName(){
		//����� �������� ������, �ڱ� ���� ���� �߰�ȣ�� üũ�Ѵ�.
		System.out.println(name);//��¥ ������.
	}

}
