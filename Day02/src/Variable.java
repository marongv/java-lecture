// ����
// ���� ��� ��Ģ�� �ܺ���Ÿ 

public class Variable {
	public static void main(String[] args) {
		
		//�ڷ��� ������ = ������;
		
		int a = 10;
		int x;
		int myAge = 20;
		
		System.out.println(a);
		System.out.println(a + a);
		System.out.println(a * a);
		
		x = 9;
		x = a - x;
		
		System.out.println(x + myAge);
		
		// ������ ������ Ư¡
		// 1. ������ ������ ������ �� ����.
		// int 0name; -- error
		// int name0; -- ����
		
		// 2. ������ �̸��� ������ �ȵ�
		// int class; -- �ڹ� �����Ϸ��� �̹� ����ϰ�����. ������� class�� ���Ұ�
		
		// 3. ������ ������� �ʴ´�.
		// int iAmSam -- ��밡��
		// int i am sam -- error
		
		// 4. ���� Scope(��� { --- })�� ���� �̸��� ������ ������ �ʴ´�.
		// int im = 10;
		// int im;
		
		// 5. ��ҹ��� �����Ѵ�.
		// int imABoy = 10;
		// int imaBoy = 9; -- ������ �ν�
		
	}

}
