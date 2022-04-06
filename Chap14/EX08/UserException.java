package Chap14.EX08;

/* �ּ� Ȯ�� chap15-Ex10 ����
1. Exception �� ��� �޴� ����� ���� - �Ϲ� ����
	1-1. ������ ������ ��� ����
	1-2. ������ 100���� �ʰ� �ϴ� ��� ����
*/

class MinusException extends Exception {	
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception {
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

class AAA {
	int score;
	
	void checkScore (int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("���� �߻� : ������ ���� �� �����ϴ�.");
		} else if (score > 100) {
			throw new OverException("���� �߻� : 100���� �Ѵ� ���� �Է��� �� �����ϴ�.");
		} else {
			System.out.println("���������� �� �Է� �Ǿ����ϴ�.");
			this.score = score;
			System.out.println("������ : " + this.score);
		}
	}
}

public class UserException {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		
		try {
			aaa.checkScore(-100);
		} catch (MinusException | OverException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("================================");
		
		try {
			aaa.checkScore(200);
		} catch (MinusException | OverException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("================================");
		
		try {
			aaa.checkScore(80);
		} catch (MinusException | OverException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}