
public class ScopeExample {
	
	static String name = "��¥ ������.";
	//Scope 
	public static void main(String[] args) {
		String name = "�ڰ��";
		System.out.println(name);
		printName();
				
	}
	
	public static void printName(){
		System.out.println(name);
	}

}
