package Chap12.EX01;

abstract class Abc {
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc {
	
	@Override
	void cry() {
		System.out.println("야오옹");
	}
	@Override
	void fly() {
		System.out.println("고양이는 날지 못한다.");
	}
}

class Eagle extends Abc{
	
	@Override
	void cry() {
		System.out.println("고옥");
	}
	@Override
	void fly() {
		System.out.println("독수리는 날 수 있다.");
	}
	
}


public class Ex_AbstractClass {
	public static void main(String[] args) {
		// 1. 자식 클래스 Cat, Eagle 클래스를 생성 후 출력
		
		Abc a1 = new Cat();
		Abc a2 = new Eagle();
		
		a1.cry();
		a1.fly();
		a2.cry();
		a2.fly();
		
		System.out.println();
		System.out.println("==================");
		
		// 2. 익명 클래스 생성 후 
		
		Abc aa1 = new Abc() {
			void cry() {
				System.out.println("야오옹");
			} void fly() {
				System.out.println("고양이는 날지 못한다.");
			}
		};
		
		Abc aa2 = new Abc() {
			void cry() {
				System.out.println("고옥");
			} void fly() {
				System.out.println("독수리는 날 수 있다.");
			}
		};
		
		aa1.cry();
		aa1.fly();
		aa2.cry();
		aa2.fly();
	}
}
