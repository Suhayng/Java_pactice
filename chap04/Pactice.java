package chap04;

public class Pactice {

	public static void main(String[] args) {
		int num1 = 10 ;
		int num2 = 2 ;
		char operator = '9' ;
		
		int result = 0;
		
		case
		if ( operator == '+' ) {
			result = num1 + num2 ;
		}else if ( operator == '-') {
			result = num1 - num2;
		}else if ( operator == '*') {
			result = num1 * num2;
		}else if ( operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("������ �����Դϴ�.");
			return;
		}
		
		System.out.println( "��� ���� :" + result + " �Դϴ�.");
		
	}

}
