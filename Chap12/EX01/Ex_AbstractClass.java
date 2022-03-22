package Chap12.EX01;

abstract class Abc {
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc {
	
	@Override
	void cry() {
		System.out.println("�߿���");
	}
	@Override
	void fly() {
		System.out.println("����̴� ���� ���Ѵ�.");
	}
}

class Eagle extends Abc{
	
	@Override
	void cry() {
		System.out.println("���");
	}
	@Override
	void fly() {
		System.out.println("�������� �� �� �ִ�.");
	}
	
}


public class Ex_AbstractClass {
	public static void main(String[] args) {
		// 1. �ڽ� Ŭ���� Cat, Eagle Ŭ������ ���� �� ���
		
		Abc a1 = new Cat();
		Abc a2 = new Eagle();
		
		a1.cry();
		a1.fly();
		a2.cry();
		a2.fly();
		
		System.out.println();
		System.out.println("==================");
		
		// 2. �͸� Ŭ���� ���� �� 
		
		Abc aa1 = new Abc() {
			void cry() {
				System.out.println("�߿���");
			} void fly() {
				System.out.println("����̴� ���� ���Ѵ�.");
			}
		};
		
		Abc aa2 = new Abc() {
			void cry() {
				System.out.println("���");
			} void fly() {
				System.out.println("�������� �� �� �ִ�.");
			}
		};
		
		aa1.cry();
		aa1.fly();
		aa2.cry();
		aa2.fly();
	}
}
