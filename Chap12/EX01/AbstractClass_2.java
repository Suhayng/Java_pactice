package Chap12.EX01;

// 2. �߻� �޼��带 ����ϴ� 2��° ��� : �ڽ� Ŭ���� ���� ���� �͸� Ŭ������ Ȱ���ϴ� ���
	// 1���� �ӽ������� ����� ��, �̺�Ʈ ó��
	// - ���� : �ڽ� Ŭ���� ������ ���� �ʾƼ� �ӽ������� ����� ��� ����
	// - ���� : �������� ��ü�� �����ؾ� �� ��� �ڵ尡 ����� ( 1�� ��� ��� )

abstract class AAA {
	abstract void abc ();	 	// �߻� �޼ҵ�
}


public class AbstractClass_2 {
	public static void main(String[] args) {

		// 1. �͸� ��ü ���� 
		AAA aaa = new AAA() {	// �͸� ��ü�� Ȱ���� �߻� �޼��带 Ŭ���� �������� ����
			// @override
			void abc() {
				System.out.println("���2 : ��ü ���� ���� �͸� Ŭ������ �߻� �޼ҵ� ����");
			}
		};	
		
		AAA aaa1 = new AAA() {
			void abc() {
				System.out.println("���2 : ��ü ���� ���� �͸� Ŭ������ �߻� �޼ҵ� ����");
			}
		};	// �߻� Ŭ������ ��ü ���� �Ұ�, �͸� Ŭ���� ���� �� �޼ҵ� �������ؼ� ���
		
		AAA aaa2 = new AAA() {
			void abc() {
				System.out.println("���2 :");
			}
		};
		
		// 2. �޼ҵ� ȣ��
		aaa.abc();
		aaa1.abc();
		aaa2.abc();
	}
}
