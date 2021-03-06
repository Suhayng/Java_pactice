package chap06_07.Ex05;

import chap06_07.Ex06.Bcd;			// ctrl + shift + o : 자동 import

//import chap06_07.Ex06.Abc;		// Abc class에 접근 제한자가 default : 외부 패키지에서 접근 불가

public class Exteranl_Abc extends Bcd {	
	// External_Abc 클래스(자식 클래스)는 Bcd 클래스(부모 클래스)를 상속 설정
	
	public static void main(String[] args) {
		
	// Abc abc2 = new Abc ();		// class 접근 제어자가 default 여서 접근 불가.
		
	Bcd bcd1 = new Bcd();					// 부모 클래스 객체
	Exteranl_Abc ext = new Exteranl_Abc();	// 자식 클래스
		
	// 다른 패키지에서 필드 호출 : 1. import ( public : 클래스 접근 지정자 ), 
						 // 2. 객체 생성, 3. 접근 지정자 확인 후 접근 ( 필드, 메소드 )
	
	bcd1.a = 1000;		 // public : 다른 패키지에서 접근 가능 
//	bcd1.b = 2000;		 // protected : 다른 패키지에서 상속 관계에 있을 때 접근 가능
	ext.b = 2000;		 // 자식 클래스에서 부모 클래스의 protected 를 다른 패키지에서 접근 ( 상속 관계 )
	
	
	
	}
}
