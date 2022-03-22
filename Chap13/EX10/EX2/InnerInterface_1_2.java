package Chap13.EX10.EX2;

class abc {		// 1. 객체 생성 후 필드에 직접 값을 할당 (d1)	 
				// 2. 생성자를 통해서 값 할당 (d2) 
				// 3. setter를 통해서 값 할당 (d3)
	Def d;
	
	abc () {}
	
	abc(Def d) {
		this.d = d;
	}
	
	public void setDef (Def d) {
		this.d = d;
	}
	
	interface Def {
		void run ();
		void fly ();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
}

public class InnerInterface_1_2 {
	public static void main(String[] args) {

		

		abc d1 = new abc();
		d1.d = (abc.Def) new abc.Def() {
			
			@Override
			public void run() {
				System.out.println("달려라");
			}
			
			@Override
			public void fly() {
				System.out.println("날아라");
			}
		};
		d1.ghi();
		
		System.out.println("===============");
			
		
		abc d2 = new abc(
			new abc.Def() {
				
				@Override
				public void run() {
					System.out.println("달리기 그만");
				}
				
				@Override
				public void fly() {
					System.out.println("날기 그만");
				}
			}
		);
		d2.ghi();
		

		System.out.println("===============");
		
		abc d3 = new abc();
		d3.setDef(new abc.Def() {
			
			@Override
			public void run() {
				System.out.println("달립니다.");
			}
			
			@Override
			public void fly() {
				System.out.println("납니다.");
			}
		});
		d3.ghi();
		
	}
}
