
public class MonthDectectExample {
	
	public static void main(String[] args) {
		
		//--input�� �Է°��� ����
		String input = args[0];
		int command = Integer.parseInt(input);
		
		//System.out.println("�Է°��� " + command + "�Դϴ�.");
		
		// input �̶�� ���ڸ� �޾Ƽ�
		// 1~12�� �� ���ڸ� ��ü�ϴ� ����ܾ ����϶�
		// 12 -> 12���� Dec �Դϴ�.
		// Jan, Feb, Mar, Apr, May, Jun, July, Aug, Sept, Oct, Nov, Dec 
		
		String month_name = "";
		
		//-- if������ �ۼ�
//		if(command == 1) {
//			month_name = "Jan";
//		}else if(command == 2) {
//			month_name = "Feb";
//		}else if(command == 3) {
//			month_name = "Mar";
//		}else if(command == 4) {
//			month_name = "Apr";
//		}else if(command == 5) {
//			month_name = "May";
//		}else if(command == 6) {
//			month_name = "Jun";
//		}else if(command == 7) {
//			month_name = "July";
//		}else if(command == 8) {
//			month_name = "Aug";
//		}else if(command == 9) {
//			month_name = "Sept";
//		}else if(command == 10) {
//			month_name = "Oct";
//		}else if(command == 11) {
//			month_name = "Nov";
//		}else if(command == 12) {
//			month_name = "Dec";
//		}else {
//			month_name = "Nothing";
//		}

		//-- switch case
		switch(command) {
		case 1 : month_name = "Jan";
			break;
		case 2 : month_name = "Feb";
			break;
		case 3 : month_name = "Mar";
			break;
		case 4 : month_name = "Apr";
			break;
		case 5 : month_name = "May";
			break;
		case 6 : month_name = "Jun";
			break;
		case 7 : month_name = "July";
			break;
		case 8 : month_name = "Aug";
			break;
		case 9 : month_name = "Sept";
			break;
		case 10 : month_name = "Oct";
			break;
		case 11 : month_name = "Nov";
			break;
		case 12 : month_name = "Dec";
			break;
		default: month_name = "Nothing";
		}
		
		System.out.println(command + "���� " + month_name + "�Դϴ�.");
		
	}

}
