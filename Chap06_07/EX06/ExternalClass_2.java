package chap06_07.Ex06;

import chap06_07.Ex05.Bb;	// 다른 패키지의 클래스에서 클래스를 호출 할 때 public 접근 제한자가 부여 되어 있어야 한다.

// import chap06_07.Ex05.*;					// class B 는 클래스 접근 제어자가 default 이기 때문에 다른 패키지에서 접근 불가.

public class ExternalClass_2 {

	public static void main(String[] args) {

	//	B b = new B();
		
		// 다른 패키지의 클래스에서 Bb 클래스를 접근 하는 경우
			// 1. impor 를 먼저 사용.
			// 2. Bb 클래스의 클래스 접근 제한자는 public
			// 3. 필드, 메소드의 접근 제한자에 따라서 접근이 가능 ( protected(상속관계), public), 불가능(private, default)
			
		
		Bb bb = new Bb();	// 다른 패키지의 클래스 : 1. 클래스 접근 제어자에 public
		
	//	bb.a = 10;		// private : 같은 클래스 내에서만 접근
	//	bb.b = 20;		// default : 같은 패키지 내에서 접근 가능	
	//	bb.c = 30;		// protected : default 포함 + 다른 패키지에서 접근 가능 (상속관계)
		bb.d = 40;		// public : protected + 다른 패키지에서 접근 가능 
		
		// << 메소드 접근 >> 
	//	bb.print1();	// private
	//	bb.print2();	// default 
	//	bb.print3();	// protected
	//	bb.print4(); 	// public
		
		
	}
}
