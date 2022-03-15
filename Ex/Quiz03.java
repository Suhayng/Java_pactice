package Ex;

class Student {
				// �ڹٴ� ���� ����� �Ұ�, �ڹ��� ��� Ŭ������ Object Ŭ������ �ڽ� Ŭ�����̴�.
							// Object Ŭ�������� ������ �ʵ峪 �޼ҵ带 ���� �� �� �ִ�. 
	String name ;		// �л� �̸�
	int studentID;		// �й�
	int kor;			// ��������
	int eng;			// ��������
	int math;			// ��������
	
	int sum;			// ���� ��
	double avg;			// ���� ���
	
	void hobby () {
		System.out.println("�� �л��� ��� �Դϴ�.");
	}

	@Override
	public String toString() {		// Object Ŭ������ �޼ҵ�, ��ü ��ü�� ����� ��, [��Ű����.Ŭ������@�ؽ��ڵ�]
		return "�̸� : " + name + " , �й� : " + studentID + " , ���� : " + kor 
				+ " , ���� :" + eng + " , ���� : " + math + " , ���� �հ� : " + sum + " , ���� ��� : " + avg ;
	}
}

class S_ö�� extends Student {

	
	S_ö��(String name, int studnetID, int kor, int eng, int math){ // ������ : 1. Ŭ���� ��� ����, 2. ���� Ÿ���� ������Ѵ�.
		super.name = name;				// super : �θ� Ŭ����, this : �ڽ��� ��ü
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
	
		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;	// ����� ��� �� ���� (double)�� ĳ����
	}
	
	@Override
	void hobby() {
		System.out.println("ö���� ��̴� ���� �Դϴ�.");
	}
}

class S_���� extends Student{

	
	S_����(String name, int studnetID, int kor, int eng, int math){
		super.name = name;				// super : �θ� Ŭ����, this : �ڽ��� ��ü
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
	
		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;
	}
	
	@Override
	void hobby() {
		System.out.println("������ ��̴� ������� �Դϴ�.");
	}
	
	
}

class S_���� extends Student{
	
	
	S_����(String name, int studnetID, int kor, int eng, int math){
		super.name = name;				// super : �θ� Ŭ����, this : �ڽ��� ��ü
		super.studentID = studentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
	
		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;
	}
	
	@Override
	void hobby() {
		System.out.println("������ ��̴� ��ȭ���� �Դϴ�.");
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		
	
		
		Student SS1 = new S_ö��("ö��", 8888, 90, 80, 95);
		Student SS2 = new S_����("����", 8787, 95, 100, 90);
		Student SS3 = new S_����("����", 7878, 85, 90, 85);
		
		Student[] array = {SS1, SS2, SS3};
		
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);	
			array[i].hobby();
		}
		
		System.out.println("====================");
	 
		for ( Student k : array ) {
			System.out.println(k);
			k.hobby();
		}
	}
}