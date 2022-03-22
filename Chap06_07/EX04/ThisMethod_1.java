package chap06_07.Ex04;

/* 1. this가 키워드로 사용되는 경우 : this.m ( 필드의 m ), this.init() ( 자신 객체의 메소드 init() )
 * 
 * 2. this 메소드로 사용 되는 경우 : 
 * 	  this();    <== 생성자 내에서 다른 생성자를 호출 사용
 * 	  			 <== 반드시 생성자 내부의 첫 줄에 와야한다.
 * 				 <== 메소드 내부에서는 사용할 수 없다. (생성자 내부에서만 사용 가능)					
 * 
 * */

class Abc {
	Abc() {			// 생성자의 매개 변수 값이 없는 생성자
		System.out.println("첫번째 생성자 입니다. ");
	}
	Abc(int a){
		this ();	// 매개 변수가 없는 생성자를 호출, this(); 생성자의 첫 라인에 와야 한다.
		System.out.println("두번째 생성자 입니다. ");
	}

	Abc( int a, String b) {
		this (30);	// this (30) : 매개 변수가 정수 1개가 들어가는 생성자 호출
		System.out.println("세번째 생성자 입니다. ");
	}
	
	/* 오류 발생 (메서드 내부에서는 사용 불가, 생성자 내부에서 사용 가능 (첫 라인에 위치해야한다.)
	void abc () {
		this (); 	// this(); <== 메서드 내에서는 this();를 사용할 수 없다.
					// this(); <== 다른 생성자를 호출 할 때 사용
	}				

 	*/
}



public class ThisMethod_1 {
	public static void main(String[] args) {
		// 1. 객체 생성 
		Abc abc = new Abc ();	// 매개 변수가 없는 생성자 호출
		System.out.println("============================");
		
		Abc abc1 = new Abc(10);	// 매개 변수가 정수 1개인 생성자를 호출, 
		
		System.out.println("============================");
		Abc abc2 = new Abc(10, "안녕하세요");
		
		
	}
}
