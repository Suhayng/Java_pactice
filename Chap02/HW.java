package Chap02;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		System.out.println("�������� �Է��ϼ���?");
		Scanner sc = new Scanner(System.in);
		
		/*int value1 = sc.nextInt();
		if (value1 % 3 == 0) {
			System.out.println("3�� ����Դϴ�." );			
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");			
		}*/
		
		int value2 = sc.nextInt();
		System.out.println(( value2 % 3 == 0) ? "3�� ����Դϴ�." : "3�� ����� �ƴմϴ�."); 
		
		/* int value1 = (value1 % 3 == 0) ? 6 : 9;			// ������ �����̹Ƿ� value1�� 9�� �����.
		System.out.println(value1); */
		
		
		
	}

}


