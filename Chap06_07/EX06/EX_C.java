package chap06_07.Ex06;

import chap06_07.Ex05.C;	// ctrl + shift + o
							// class�� ���� ������ public
public class Ex_C {

	public static void main(String[] args) {
		
		
		// �ٸ� Ŭ������ ������ / public �� ����/ model, color, �޸𸮷� ���� �Ұ�
		// model�� color�� setter �� public ���ؼ� �Ҵ� �� ��� 
	
		C c = new C(); 		// �ٸ� ��Ű���̹Ƿ� import

		// company, model, color�� �ٸ� ��Ű������ ���� �Ұ�, setter�� ���ؼ� �޸� ���� �Ҵ��ϵ��� ����
		c.maxSpeed = 300;	// �ٸ� ��Ű���� Ŭ���������� public, protected (��� ����)
	
		//setter�� ���ؼ� �޸��� ���� �ο�
		c.setModel("����");
		c.setColor("������");
		c.setMaxSpeed(100);
	
		c.print();
	
	
	}
}
