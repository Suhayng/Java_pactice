package Chap06_07_Ex02;

public class Example_Car {

	public static void main(String[] args) {
		// Car class �� ��üȭ�ؼ� 5���� ��ü�� �����ؼ� ���� �Ҵ��ؼ� ��� �غ�����.
		
		Car sonata = new Car ();
		
		// �� ������ ���� �Ҵ��ϰ� ����غ�����. (�޸𸮸� ���� ���/ settor�� ���ؼ� ���� �Ҵ�) 
		
		sonata.setCompany("�����ڵ���");
		sonata.setModel("sonata");
		sonata.setColor("black");
		sonata.setMaxSpeed(100);
		
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
		
		F.setCompany("�ֿ��ڵ���");
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

		
		
		
	
	}
}
