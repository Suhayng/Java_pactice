package Chap14.EX09;

class MyAllException extends Exception { 	// �Ϲ� ���� ( checked Exception )	- ���� ���� ( ���� ó�� )
	public MyAllException() {
		super();
	}
	public MyAllException(String message) {	// ���� �޼��� , e.getMessage()
		super(message);
	}
}

class B { // ���� Ŭ����
	// private : ĸ��ȭ, ��ü ���� �� �ٷ� ���� ���� ���ϵ��� ����
		// ������, setter <== ������ �ʵ��� ���� �Ҵ�
	
	private String season; 	// ��, ����, ����, �ܿ� ( ���� �߻�: ��, ���� , ����, �ܿ︸ �Է��ϼ��� )
	private String week;	// ��,ȭ,��,��,��,��,�� ( ���� �߻� : ��, ȭ, ��, ��, ��, ��, �ϸ� �Է��ϼ��� )
	private int scoreKor;	// 0 ~ 100 ���� �Է� ( ���� �߻� :  0 ~ 100���� ������ �Է��ϼ��� )
	private int scoreEng;	// 0 ~ 100 ���� �Է� ( ���� �߻� :  0 ~ 100���� ������ �Է��ϼ��� )
	private String userID;	// 12�� �̻� 20�� ������ ���� ( ���� �߻� : 12�� �̻� 20�� ������ ���ڸ� �������� )

	// �ϳ��� �޼���� ó��
	void studentInfo(String season, String week, int scoreKor, int scoreEng, String userID) throws MyAllException {
		if (season != "��" && season != "����" && season != "����" && season != "�ܿ�" ) {
			throw new MyAllException("���� �߻�: ��, ���� , ����, �ܿ︸ �Է��ϼ���");
		} else if (week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" && week != "��" && week != "��" ) {
			throw new MyAllException("���� �߻� : ��, ȭ, ��, ��, ��, ��, �ϸ� �Է��ϼ���");
		} else if (scoreKor <= 0 || scoreKor >= 100) {
			throw new MyAllException("���� �߻� :  0 ~ 100���� ������ �Է��ϼ���");
		} else if (scoreEng <=0 || scoreEng >= 100) {
			throw new MyAllException("���� �߻� :  0 ~ 100���� ������ �Է��ϼ���");
		} else if (userID.length() <= 12 || userID.length() >= 20 ) {
			throw new MyAllException("���� �߻� : 12�� �̻� 20�� ������ ���ڸ� ��������");
		} else {
			System.out.println("���������� ���� ��� �� �ԷµǾ����ϴ�.");
			this.season = season ;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
		}
		System.out.println(season + ", " + week + ", " + scoreKor + ", " + scoreEng + ", " + userID);
	}
}

public class UserException {
	public static void main(String[] args) {
		B b = new B();

		// ��� �ʵ��� ���� ����
		try {
			b.studentInfo("��", "ȭ", 90, 100, "aaaaaaaaaaaaa");
		} catch (MyAllException e) {
			//e.printStackTrace();	// void
			System.out.println(e.getMessage()); // Retrun String
		}
		System.out.println("=================================");
		
		// season �ʵ� �׽�Ʈ 
		try {
			b.studentInfo("��", "��", 90, 100, "aaaaaaaaaaaaa");
		} catch (MyAllException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
