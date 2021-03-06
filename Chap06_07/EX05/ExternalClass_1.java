package chap06_07.Ex05;

class B {		// 외부 클래스 : public이 올 수 없다. default 가 생략 되어 있다.
				// 다른 패키지의 클래스에서는 접근이 불가, 같은 패키지 내에서만 접근 가능
	
	private int a = 1;				// private : 같은 클래스 내에서만 사용
	int b = 2;						// default : 같은 패키지 내의 다른 클래스에서 접근 가능
	protected int c = 3;			// protected : default 포함 + 다른 패키지에 접근 가능 ( 상속된 경우만 가능 )
	public int d = 4;				// public : 다른 패키지에서 접근이 가능
	
		// private < default < protected < public 
	
	private void pirnt1 () {		// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void pirnt2 () {		// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void pirnt3 () {		// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void pirnt4 () {		// 같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
}


public class ExternalClass_1 {

	public static void main(String[] args) {
		
		B b = new B();			// default 접근 제어자가 class 이름에 할당/ 같은 클래스에 존재하므로 B Class를 생성할 수 있다.
		
		Bb bb = new Bb();		// public 접근 제한자, 같은 패키지 내에서 접근 
	
		// 같은 패키지의 다른 클래스에서 접근
		
		//필드 접근
	//	bb.a = 10;				// private : a 는 Bb 클래스 내부에서만 사용. <오류 발생 : 접근 불가>
		bb.b = 20;				// default : 같은 패키지의 클래스에서 접근을 허용
		bb.c = 30;				// protected : default 를 포함 + << 다른 패키지에서 접근이 가능하지만 상속 관계일 때만 >>
		bb.d = 40;				// public : protected 를 포함 + 다른 패키지에서 접근 가능
		
		//메소드 접근
	//	bb.print1();			// pivate	: 오류 발생, 클래스 내부에서만 호출
		bb.pirnt2();			// default
		bb.pirnt3();			// protected
		bb.pirnt4();			// public
		
	}
}
