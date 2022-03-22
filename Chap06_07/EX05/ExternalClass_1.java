package chap06_07.Ex05;

class B {		// �ܺ� Ŭ���� : public�� �� �� ����. default �� ���� �Ǿ� �ִ�.
				// �ٸ� ��Ű���� Ŭ���������� ������ �Ұ�, ���� ��Ű�� �������� ���� ����
	
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


public class ExternalClass_1 {

	public static void main(String[] args) {
		
		B b = new B();			// default ���� �����ڰ� class �̸��� �Ҵ�/ ���� Ŭ������ �����ϹǷ� B Class�� ������ �� �ִ�.
		
		Bb bb = new Bb();		// public ���� ������, ���� ��Ű�� ������ ���� 
	
		// ���� ��Ű���� �ٸ� Ŭ�������� ����
		
		//�ʵ� ����
	//	bb.a = 10;				// private : a �� Bb Ŭ���� ���ο����� ���. <���� �߻� : ���� �Ұ�>
		bb.b = 20;				// default : ���� ��Ű���� Ŭ�������� ������ ���
		bb.c = 30;				// protected : default �� ���� + << �ٸ� ��Ű������ ������ ���������� ��� ������ ���� >>
		bb.d = 40;				// public : protected �� ���� + �ٸ� ��Ű������ ���� ����
		
		//�޼ҵ� ����
	//	bb.print1();			// pivate	: ���� �߻�, Ŭ���� ���ο����� ȣ��
		bb.pirnt2();			// default
		bb.pirnt3();			// protected
		bb.pirnt4();			// public
		
	}
}
