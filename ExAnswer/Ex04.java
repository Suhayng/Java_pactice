package ExAnswer;
public class Ex04 {
	public static void main(String[] args) {
		
		int lineCount; 	// ���� �������� ���� ����
		int stopCount; 	// ���� ����ϴ� ����
		
		for (lineCount = 0 ; lineCount < 4 ; lineCount++) {
			for (stopCount = 0 ; stopCount <= lineCount ; stopCount++ ) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
