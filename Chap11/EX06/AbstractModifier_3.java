package Chap11.EX06;

abstract class Animal {				// 추상 클래스 : 추상 메소드가 하나 이상 포함되어 있는 경우
	String name;					// 자식 클래스는 부모 클래스의 메소드를 구현시 오류를 방지
	int age;
	
	abstract void cry();		// 추상 메소드 : 구현부가 없는 메소드
		// void cry(){}		<== 일반 메소드 : 리턴 타입 메소드 이름 (입력매개변수) {구현코드}
	abstract void run();

	@Override
		public String toString() {
			return "이름 : " + name + " , 나이 : " + age;
		}
}

class Cat extends Animal {			// Cat은 Animal 상속 일부만 상속한 경우 추상 클래스
	Cat(String name, int age){		// 모두 추상 메소드를 구현한 경우는 콘크리트(완전히 구현된) 클래스
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {					// 추상 메소드를 구현한 메소드	
		System.out.println("야옹");
	}
	
	@Override
	void run() {
		System.out.println("애옹애옹");
	}

}

class Tiger extends Animal {
	Tiger(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("어흥흥");
	}
	
	@Override
	void run() {
		System.out.println("어흥하고 웁니다.");
	}

}
class Eagle extends Animal {
	Eagle(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("독술");
	}
	
	@Override
	void run() {
		System.out.println("독수리 난당");
	}

}

public class AbstractModifier_3 {
	public static void main(String[] args) {
		Animal a1 = new Cat ("고양이" , 10);
		Animal a2 = new Tiger ("호랑이", 5);
		Animal a3 = new Eagle ("독수리", 15);
		
		// 1. Animal 배열 객체
		
		Animal[] arr = {a1, a2, a3};
	
		// 2. For 문을 사용해서 객체를 출력시 이름과 나이를 출력 .cry() , .run()
		
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);		// 객체 출력, Animal의 toString()
			arr[i].cry();					// 객체의 오버라이딩된 메소드 출력
			arr[i].run();					// Animal의 cry(), run() ====> 오버라이딩 (자식의 cry(), run() 
			System.out.println("=====================");
		}
		
		System.out.println();
		System.out.println("=====================");
		
		// 3. Enhanced For 문을 사용해서 이름과 나이를 출력 .cry() , .run()
		
		for ( Animal k : arr) {
			System.out.println(k);
			k.cry();
			k.run();
		}
		
	}
}
