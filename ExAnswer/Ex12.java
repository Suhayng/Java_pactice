package ExAnswer;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		
		/*
		int n = (int)(Math.random() * 3);		// * 3 --> n�� 0, 1, 2�� �����.
			// Math.random() : 0.000000xxx ~ 0.999999xxx
		System.out.println(n);
		*/
		
		Scanner sc = new Scanner(System.in);
		String[] str = {"����", "����", "��"};
		String uSelect, comSelect ; 			// uSelect : ����� �� ��(��ĳ�ʷ� ��ǲ) 
											// comSelct : ��ǻ�Ͱ� �� ��(���� �߻���(Math.random())���� ��ǲ)
		
		int n ; 		// ��ǻ�Ͱ� �� �� (0 , 1 , 2), 0 : ����, 1 : ����, 2 : ��
		
		System.out.println("��ǻ�Ϳ� \'���� ���� ��\' ������ �մϴ�. ");
		
		do {
			System.out.println("���� ���� �� !! >>> ");
			uSelect = sc.next();					// ����� ���� �� : ��ǲ
			if ( uSelect.equals("�׸�")) 
				break;								// '�׸�' : do while ���� ���� ���´�.
			
			n = (int)(Math.random() * 3 );			// ��ǻ�Ͱ� ���� �� : 0, 1, 2
			comSelect = str[n];						// ��ǻ�Ͱ� ���� �� 0 : ����, 1 : ���� , 2 : ��
			
			// ����ڰ� ������ ��
			if ( uSelect.equals("����" )) {
				if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " �����ϴ�. " );
				} else if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�. ");
				} else if (comSelect.equals("��")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ����� �̰���ϴ�. ");
				}
			}	
			// ����ڰ� ������ ��
			 else if (uSelect.equals("����")) {
				if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ����� �̰���ϴ�. " );
				} else if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " �����ϴ�. ");
				} else if (comSelect.equals("��")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�. ");
				}
			 }	
			// ����ڰ� ���� ��
			 else if (uSelect.equals("��")) {
				if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ��ǻ�Ͱ� �̰���ϴ�. " );
				} else if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " ����� �̰���ϴ�. ");
				} else if (comSelect.equals("��")) {
					System.out.println("����� = " + uSelect + " , ��ǻ�� = " + comSelect + " �����ϴ�. ");
				}
			}
			
		}while (true);
		
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
}
