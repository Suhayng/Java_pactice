package chap06_07.Ex06;

import chap06_07.Ex05.Bb;	// �ٸ� ��Ű���� Ŭ�������� Ŭ������ ȣ�� �� �� public ���� �����ڰ� �ο� �Ǿ� �־�� �Ѵ�.

// import chap06_07.Ex05.*;					// class B �� Ŭ���� ���� �����ڰ� default �̱� ������ �ٸ� ��Ű������ ���� �Ұ�.

public class ExternalClass_2 {

	public static void main(String[] args) {

	//	B b = new B();
		
		// �ٸ� ��Ű���� Ŭ�������� Bb Ŭ������ ���� �ϴ� ���
			// 1. impor �� ���� ���.
			// 2. Bb Ŭ������ Ŭ���� ���� �����ڴ� public
			// 3. �ʵ�, �޼ҵ��� ���� �����ڿ� ���� ������ ���� ( protected(��Ӱ���), public), �Ұ���(private, default)
			
		
		Bb bb = new Bb();	// �ٸ� ��Ű���� Ŭ���� : 1. Ŭ���� ���� �����ڿ� public
		
	//	bb.a = 10;		// private : ���� Ŭ���� �������� ����
	//	bb.b = 20;		// default : ���� ��Ű�� ������ ���� ����	
	//	bb.c = 30;		// protected : default ���� + �ٸ� ��Ű������ ���� ���� (��Ӱ���)
		bb.d = 40;		// public : protected + �ٸ� ��Ű������ ���� ���� 
		
		// << �޼ҵ� ���� >> 
	//	bb.print1();	// private
	//	bb.print2();	// default 
	//	bb.print3();	// protected
	//	bb.print4(); 	// public
		
		
	}
}
