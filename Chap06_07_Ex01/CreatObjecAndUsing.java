package Chap06_07_Ex01;

class AA {
	String name; 				// �ʵ�(���) : �ν��Ͻ�ȭ ���Ѿ� ��� ���� ( Heap ������ ���� ���� )
 	int age;
	String email;
	
	public String getName() {	// �޼ҵ�(���) : �ν��Ͻ�ȭ ���Ѿ� ��� ����
		return name;			// Heap ������ �ּҸ� ����, Ŭ���� ���� ���� �޼ҵ� ������ ����
						// retrun : �޼ҵ带 ȣ���ϴ� ������ ������ ���� �����ش�.
	}
	public void setName(String name) {	// void : ���� ���� ���ٸ� �˷��ִ� �ĺ���
		this.name = name;
	}
	public int getAge() {				
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}


public class CreatObjecAndUsing {
	public static void main(String[] args) {
		
		AA aa = new AA();		// AA Ŭ����(���赵), aa(��ü)�� ����
		
		// ��ü�� �޼ҵ� ȣ��
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		// ��ü�� �ʵ� ȣ��
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		//===============================
		
		// �޼ҵ� ȣ��
		System.out.println("====================");
		
		// setters : ��ü�� �޸𸮿� ���� �Ҵ� �� ��
		aa.setName("ȫ�浿");		// ��ü�� ������ ���� �Ҵ�
		aa.setAge(29);
		aa.setEmail("aaa@aaa.com");
		
		// getters : ��ü�� �޸��� ���� ������ �� ��
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("================");
		
		AA bb = new AA();
		bb.setName("������");
		bb.setAge(50);
		bb.setEmail("bbb@bbb.com");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		System.out.println("================");
		
		AA cc = new AA();
		cc.setName("�Ż��Ӵ�");
		cc.setAge(40);
		cc.setEmail("ccc@ccc.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		System.out.println("================");
		
		
	
	
	
	}
}