
public class StringExample {
	public static void main(String[] args) {
		
		// ���� ����, ���
		// ������Ÿ��(�ڷ���) ������; <- ����
		// ������Ÿ��(�ڷ���) ������ = ��; <- ����� ���ÿ� �ʱ�ȭ
		
		// String name = "�ڰ��";
		String name;
		String home;
		String description;
		
		name = "�ڰ��";
		home = "��õ";
		
		//description = name + "�� ���� " + home + "�̴�.";
		description = String.format("%s�� ���� %s�̴�.", name, home);
		
		char c_name = description.charAt(0);
		
		// �������� "������"
		
		System.out.println(description);
		System.out.println(c_name);
				
	}

}
