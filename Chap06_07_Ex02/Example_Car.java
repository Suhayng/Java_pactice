package Chap06_07_Ex02;

public class Example_Car {

	public static void main(String[] args) {
		// Car class 를 객체화해서 5개의 객체를 생성해서 값을 할당해서 출력 해보세요.
		
		Car sonata = new Car ();	// 객체화 , 
		
		// 각 변수의 값을 할당하고 출력해보세요. (메모리를 직접 사용/ setter를 통해서 값을 할당) 
		
		// 변수의 값을 직접 할당, 권장 사항은 아니다. 메모리에 원치 않는 값을 직접 할당.
		// private 변수명 : 캡슐화, 직접 변수의 값을 할당하지 못하도록 한다.
		// setter 를 통해서 값을 부여 : 변수의 입력되는 값을 제어 할 수 있다.
		
		sonata.company = "현대자동차";
		sonata.model = "소나타";
		sonata.maxSpeed = 100;		// - , 700 값 이상을 넣을 수 없도록 제어
				
		// =============================
		
		System.out.println(sonata.company);
		System.out.println(sonata.model);
		
		// ===============================
		
		// setter 를 통해서 값을 할당 : 메모리(RAM)의 값을 부여할 때 사용.
		sonata.setCompany("현대자동차");
		sonata.setModel("sonata");
		sonata.setColor("black");
		sonata.setMaxSpeed(100);
		
		// getter 는 메모리의 값을 출력 할 때 사용.
		System.out.println(sonata.getCompany());
		System.out.println(sonata.getModel());
		System.out.println(sonata.getColor());
		System.out.println(sonata.getMaxSpeed());
		System.out.println();
		
		Car G = new Car ();
		
		G.setCompany("KIA");
		G.setModel("G");
		G.setColor("blue");
		G.setMaxSpeed(120);
		
		System.out.println(G.getCompany());
		System.out.println(G.getModel());
		System.out.println(G.getColor());
		System.out.println(G.getMaxSpeed());
		System.out.println();
		
		Car B = new Car ();
		
		B.setCompany("BMW");
		B.setModel("B");
		B.setColor("white");
		B.setMaxSpeed(130);
		
		System.out.println(B.getCompany());
		System.out.println(B.getModel());
		System.out.println(B.getColor());
		System.out.println(B.getMaxSpeed());
		System.out.println();

		Car F = new Car ();
		
		F.setCompany("쌍용자동차");
		F.setModel("F");
		F.setColor("Gray");
		F.setMaxSpeed(100);
		
		System.out.println(F.getCompany());
		System.out.println(F.getModel());
		System.out.println(F.getColor());
		System.out.println(F.getMaxSpeed());
		System.out.println();

		Car mini = new Car ();
		
		mini.setCompany("BMW");
		mini.setModel("mini");
		mini.setColor("red");
		mini.setMaxSpeed(110);
		
		System.out.println(mini.getCompany());
		System.out.println(mini.getModel());
		System.out.println(mini.getColor());
		System.out.println(mini.getMaxSpeed());

		// [문제] : 스캐너로 임의의 정수값을 받아서 합계, 평균 .. >>
		
		
		
	
	}
}
