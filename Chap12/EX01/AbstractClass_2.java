package Chap12.EX01;

// 2. 추상 메서드를 사용하는 2번째 방법 : 자식 클래스 생성 없이 익명 클래스를 활용하는 방법
	// 1번만 임시적으로 사용할 때, 이벤트 처리
	// - 장점 : 자식 클래스 생성을 하지 않아서 임시적으로 사용할 경우 유용
	// - 단점 : 여러개의 객체를 생성해야 할 경우 코드가 길어짐 ( 1번 방법 사용 )

abstract class AAA {
	abstract void abc ();	 	// 추상 메소드
}


public class AbstractClass_2 {
	public static void main(String[] args) {

		// 1. 익명 객체 생성 
		AAA aaa = new AAA() {	// 익명 객체를 활용한 추상 메서드를 클래스 생성없이 구현
			// @override
			void abc() {
				System.out.println("방법2 : 객체 생성 없이 익명 클래스로 추상 메소드 구현");
			}
		};	
		
		AAA aaa1 = new AAA() {
			void abc() {
				System.out.println("방법2 : 객체 생성 없이 익명 클래스로 추상 메소드 구현");
			}
		};	// 추상 클래스는 객체 생성 불가, 익명 클래스 생성 후 메소드 재정의해서 출력
		
		AAA aaa2 = new AAA() {
			void abc() {
				System.out.println("방법2 :");
			}
		};
		
		// 2. 메소드 호출
		aaa.abc();
		aaa1.abc();
		aaa2.abc();
	}
}
