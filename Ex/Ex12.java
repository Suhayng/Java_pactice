package Ex;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String str[] = {"����", "����", "��"};
		int winner = 0;
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.println("���� ���� ��! >> ");
			String user = sc.next();
			if (user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
		int n = (int)(Math.random()*3);
		
		switch (user) {
		case "����" :
			if (str[n].equals("����"))
				winner = 1;
			else if (str[n].equals("����"))
				winner = 2;
			else
				winner =3;
			break;
		case "����" :
			if (str[n].equals("����"))
				winner = 3;
			else if (str[n].equals("����"))
				winner = 1;
			else
				winner =2;
			break;
		case "��" :
			if (str[n].equals("����"))
				winner = 2;
			else if (str[n].equals("����"))
				winner = 3;
			else
				winner = 1;
			break;
		}
		
		if (winner == 1)
			System.out.println("����� = " + user + " , ��ǻ�� = " + str[n] + " , �����ϴ�.");
		else if (winner == 2)
			System.out.println("����� = " + user + " , ��ǻ�� = " + str[n] + " , ��ǻ�Ͱ� �̰���ϴ�.");
		else
			System.out.println("����� = " + user + " , ��ǻ�� = " + str[n] + " , ����ڰ� �̰���ϴ�.");
		}
	}

}
