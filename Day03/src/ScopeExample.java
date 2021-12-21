
public class ScopeExample {
	
	static String name = "진짜 졸립다.";
	//Scope 
	public static void main(String[] args) {
		String name = "박경란";
		System.out.println(name);
		printName();
				
	}
	
	public static void printName(){
		System.out.println(name);
	}

}
