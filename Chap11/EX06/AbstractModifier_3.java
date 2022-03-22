package Chap11.EX06;

abstract class Animal {				// �߻� Ŭ���� : �߻� �޼ҵ尡 �ϳ� �̻� ���ԵǾ� �ִ� ���
	String name;					// �ڽ� Ŭ������ �θ� Ŭ������ �޼ҵ带 ������ ������ ����
	int age;
	
	abstract void cry();		// �߻� �޼ҵ� : �����ΰ� ���� �޼ҵ�
		// void cry(){}		<== �Ϲ� �޼ҵ� : ���� Ÿ�� �޼ҵ� �̸� (�Է¸Ű�����) {�����ڵ�}
	abstract void run();

	@Override
		public String toString() {
			return "�̸� : " + name + " , ���� : " + age;
		}
}

class Cat extends Animal {			// Cat�� Animal ��� �Ϻθ� ����� ��� �߻� Ŭ����
	Cat(String name, int age){		// ��� �߻� �޼ҵ带 ������ ���� ��ũ��Ʈ(������ ������) Ŭ����
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {					// �߻� �޼ҵ带 ������ �޼ҵ�	
		System.out.println("�߿�");
	}
	
	@Override
	void run() {
		System.out.println("�ֿ˾ֿ�");
	}

}

class Tiger extends Animal {
	Tiger(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("������");
	}
	
	@Override
	void run() {
		System.out.println("�����ϰ� ��ϴ�.");
	}

}
class Eagle extends Animal {
	Eagle(String name, int age){
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("����");
	}
	
	@Override
	void run() {
		System.out.println("������ ����");
	}

}

public class AbstractModifier_3 {
	public static void main(String[] args) {
		Animal a1 = new Cat ("�����" , 10);
		Animal a2 = new Tiger ("ȣ����", 5);
		Animal a3 = new Eagle ("������", 15);
		
		// 1. Animal �迭 ��ü
		
		Animal[] arr = {a1, a2, a3};
	
		// 2. For ���� ����ؼ� ��ü�� ��½� �̸��� ���̸� ��� .cry() , .run()
		
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);		// ��ü ���, Animal�� toString()
			arr[i].cry();					// ��ü�� �������̵��� �޼ҵ� ���
			arr[i].run();					// Animal�� cry(), run() ====> �������̵� (�ڽ��� cry(), run() 
			System.out.println("=====================");
		}
		
		System.out.println();
		System.out.println("=====================");
		
		// 3. Enhanced For ���� ����ؼ� �̸��� ���̸� ��� .cry() , .run()
		
		for ( Animal k : arr) {
			System.out.println(k);
			k.cry();
			k.run();
		}
		
	}
}
