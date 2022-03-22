package Chap13.EX08.EX1;

// 3. 메소드의 매개 변수로 전달 : 
// 3-1 : 객체 생성 후 매개 변수로 전달 ( 클래스명 0 + 참조변수 0 )
// 3-2 : 객체 생성 후 매개 변수로 전달 ( 클래스명 0 + 참조변수 X )

interface A {		// 인터페이스, 추상 메소드를 정의
	public abstract void cry();		// 추상 메소드, public abstract
	void fly();		 
}

class B implements A {	// B 는 A 인터페이스를 구현한 클래스			
	public void cry() {System.out.println("멍멍 : 매개 변수 전달 후 출력");}
	public void fly() {System.out.println("날지못합니다 : 매개 변수 전달");}
}

class C {			// C 객체의 abc 메소드 호출시 A 타입을 매개 변수로 받는다.
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class Anonymous_3_1 {

	public static void main(String[] args) {
		
		// 1. 클래스가 존재 0 + 참조 변수 : 0
		C c = new C();
		A a = new B(); 		// B 를 객체화 해서 A 타입으로 생성, a : 참조 변수
		
		c.abc(a);
		
		// 2. 클래스가 존재 0 + 참조변수 X
		
		
	}

}
