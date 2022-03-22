package Chap12.EX01;

// 
abstract class D {				// Ŭ���� ���ο� �߻� �޼ҵ尡 �� ��� abstract Ŭ������ �Ǿ�� �Ѵ�.
								// �ڽ� Ŭ�������� �ݵ�� ���� ���� �޼ҵ带 ������ �ϴ� ���� ����.

	abstract void print();		// �߻� �޼ҵ�, �����ΰ� ����, ���� �� �޼ҵ� 
}

class E extends D {				// �ڽ� Ŭ������ �߻� Ŭ������ �޼ҵ带 ������.
	
	@Override
	void print() {
		System.out.println("E Ŭ������ print()");
		
	}				
}

public class AbstractClass_3 {
	public static void main(String[] args) {
		// 1. ��üȭ �ؼ� ���. 	(��ü 3�� ���� �� print () �޼��� ���)
			D d1 = new E();
			D d2 = new E();
			D d3 = new E();
			
			d1.print();
			d2.print();
			d3.print();
			
			System.out.println("==================");
		
		// 2. �͸� Ŭ������ �����ؼ� ��� ( print() �޼��� 3�� ���)
			// ��ü ���� ���� �ӽ÷� ����ϴ� ���
			
			
			// �߻� Ŭ������ ��üȭ �� �� ����. �͸� Ŭ������ ������ ��� ����
			D dd1 = new D() {	
				// D �߻� Ŭ������ �ڽ� Ŭ���� ���� (�͸� (Ŭ���� �̸��� ����) Ŭ���� )
			@Override
			void print() {
				System.out.println("�͸� Ŭ���� 1");
				}
			};
			
			D dd2 = new D() {
				@Override
				void print() {
					System.out.println("�͸� Ŭ���� 2");
				}
			};
			
			D dd3 = new D() {
				@Override
				void print() {
					System.out.println("�͸� Ŭ���� 3");
				}
			};
			
			dd1.print();
			dd2.print();
			dd3.print();
		
		
	}
}
