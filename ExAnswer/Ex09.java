package ExAnswer;
public class Ex09 {
	public static void main(String[] args) {
		
		double c = (double) Math.random();		// ���� �߻��� ( ������ ���� �ڵ����� �߻���Ŵ )
			// 0.0000XXX ~ 0.9999XXX  <-- ������ ������ ���� �߻���Ŵ.
		System.out.println(c);
		
		int d = (int)(Math.random() * 10);		// 0 ~ 9 ������ ������ ���� ����
		int e = (int)(Math.random() * 10 + 1);	// 1 ~ 10 ������ ������ ���� ����
		
		System.out.println("0���� 9������ ������ �� : " + d);
		System.out.println("1���� 10������ ������ �� : " + e);
		
		// 1���� 100������ ������ �߻���Ŵ
		int f = (int) (Math.random() * 100 + 1);
		System.out.println("1���� 100 ������ ������ �� : " + f);
		
				
				
		
		
		
		
		
		
		
		
		
		
		
	}
}
