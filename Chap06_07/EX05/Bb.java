package chap06_07.Ex05;

public class Bb {		// Ŭ���� �̸� : public ( ���� ��Ű������ ���� ���� , �ٸ� ��Ű���� Ŭ�������� ������ ���� )

	private int a = 1;				// private : ���� Ŭ���� �������� ���
	int b = 2;						// default : ���� ��Ű�� ���� �ٸ� Ŭ�������� ���� ����
	protected int c = 3;			// protected : default ���� + �ٸ� ��Ű���� ���� ���� ( ��ӵ� ��츸 ���� )
	public int d = 4;				// public : �ٸ� ��Ű������ ������ ����
	
		// private < default < protected < public 
	
	private void pirnt1 () {		// ���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void pirnt2 () {		// ���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void pirnt3 () {		// ���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void pirnt4 () {		// ���� Ŭ������ �����ϴ� �޼ҵ�
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
}
