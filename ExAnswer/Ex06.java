package ExAnswer;
public class Ex06 {
	public static void main(String[] args) {
		int max = 0;				// �ִ� ���� �����ϴ� ����
		int[] array = {4,5,1,2,3};
		
		for (int i = 0; i < array.length; i++) {	// �� ���� ���� ��ȯ �ϸ鼭 ������ �´�.
				if( array[i] > max ) {				// ���� ���� max ������ ������ Ŭ ��
					max = array[i];					// max ������ ū ���� ����
			}
		}
		System.out.println("max : " + max);
	}
}
