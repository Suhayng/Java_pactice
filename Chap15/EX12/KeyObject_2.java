package Chap15.EX12;


class A{}
class B{}
class C{}


class MyData {
	// ����ȭ�� �޼ҵ�� Key���� ��� this�� �ڵ����� ���, ������ �Ұ���
		// ����ȭ �޼ҵ�� Key ���� ���� �� ����.
		// �ϳ��� �����尡 ������ �� Key�� ������ ����ȭ�� �޼ҵ带 ���� �����ϴ�.
		// Key�� ��ü�� Ű�� ����� �� �ִ�.
		// ����ȭ ������ Key ���� ���Ƿ� �Ҵ� �����ϴ�.
	synchronized void abc() {	// ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e1) {}	// 0.01�� ������
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1�� ������
		}
	}
	synchronized void bcd() {	// ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(20);} catch (InterruptedException e1) {}	// 0.02�� ������
			System.out.println(i + "��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1�� ������
		}
	}
	 void cde() {	// ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		 
		synchronized (new Object()) { 	// ������ Ű�� ����
		for (int i = 0; i < 3; i++) {
			try {Thread.sleep(30);} catch (InterruptedException e1) {}	// 0.03�� ������
			System.out.println(i + "��°");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}	// 1�� ������
		}
		}
	}
}

public class KeyObject_2 {
	public static void main(String[] args) {


		// ���� ��ü
		MyData myData = new MyData();
		
		// ������ �����尡 ������ �޼ҵ� ȣ��
		new Thread() {				// �͸�Ŭ���� : ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.abc();		// ù��° ������ abc() �޼ҵ� ȣ��
			};
		}.start();
		
		new Thread() {				// �͸�Ŭ���� : ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.bcd();		// bcd() �޼ҵ� ȣ��
			};
		}.start();
		
		new Thread() {				// �͸�Ŭ���� : ������ Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.cde();		// cde() �޼ҵ� ȣ��
			};
		}.start();
		
		
		
	}

}