
public class MonthExample {
	
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("usage : java Month ");
		}else {
			String[] arrMonthName =  { // �迭�� ���ÿ� ���Է�
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
			
			int command = Integer.parseInt(args[0]) - 1;
			System.out.println(arrMonthName[command]);
			
		}
		
//		System.out.println(args.length);
		

		
	}

}
