package Chap14.EX05;

// �ڵ� ���ҽ�(��ü) ����
	// 1. AutoCloseable �������̽��� ����
	// 2. close() �޼ҵ� ������ 

// �ʵ��� �� �Ҵ�. ������ ȣ��� �ʵ��� ���� �ο�, 
class Abc implements AutoCloseable{
	
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg;		// ��� ��� 
	
	Abc (String name, int studentID, int kor, int eng, int math){
		this.name=name; this.studentID=studentID; this.kor=kor;
		this.eng=eng; this.math=math; this.avg=(double)(kor+eng+math)/3; 
		}
	
	@Override
	public void close() throws Exception {
			// �ʱ�ȭ ���� �޸��� ���� ���
		if(name != null || studentID != 0 || kor != 0 || eng != 0 || math!=0 || avg!=0.0) {							// **���� �� �Ҵ�
			name = null; studentID = 0; kor = 0; eng = 0; math =0; avg=0.0;	
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
			
			// �ʱ�ȭ ���� �޸��� ���� ���		
			System.out.println("========================");
		}
	}
}

public class EX_TryWithResource_3 {
	public static void main(String[] args) {
		// 1. ��ü�� ��� �ʵ带 �ʱ�ȭ�ϰ� �ڵ����� close ();
		try ( Abc a1 = new Abc("ȫ�浿", 3333, 90, 90, 90);){

		} catch (Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}	// close() ȣ�� ���̵� �ڵ����� close()
		
		
		
		// 2. ���� close() , finally ������� close() ȣ��
		
		Abc a2 = null;
		try {
			a2 = new Abc("�̼���", 2222, 80, 90, 100);
		} catch (Exception e) {
			
		} finally {
			if (a2.name != null || a2.studentID != 0 || a2.kor != 0 || a2.eng != 0 || a2.math!=0 || a2.avg!=0.0 ) {
				
			} try {
				a2.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
