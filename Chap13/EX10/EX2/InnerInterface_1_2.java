package Chap13.EX10.EX2;

class abc {		// 1. ��ü ���� �� �ʵ忡 ���� ���� �Ҵ� (d1)	 
				// 2. �����ڸ� ���ؼ� �� �Ҵ� (d2) 
				// 3. setter�� ���ؼ� �� �Ҵ� (d3)
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
				System.out.println("�޷���");
			}
			
			@Override
			public void fly() {
				System.out.println("���ƶ�");
			}
		};
		d1.ghi();
		
		System.out.println("===============");
			
		
		abc d2 = new abc(
			new abc.Def() {
				
				@Override
				public void run() {
					System.out.println("�޸��� �׸�");
				}
				
				@Override
				public void fly() {
					System.out.println("���� �׸�");
				}
			}
		);
		d2.ghi();
		

		System.out.println("===============");
		
		abc d3 = new abc();
		d3.setDef(new abc.Def() {
			
			@Override
			public void run() {
				System.out.println("�޸��ϴ�.");
			}
			
			@Override
			public void fly() {
				System.out.println("���ϴ�.");
			}
		});
		d3.ghi();
		
	}
}
