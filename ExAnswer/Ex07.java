package ExAnswer;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[10];				// ���� ������ ����
		
		System.out.println("���� ���� 10���� �Է��Ͻÿ� >> ");
		
		for ( int i = 0; i < arr1.length; i++) {	// for ���� ����ؼ� �� �濡 ��ĳ�ʿ��� ���� ���� ����
			arr1[i] = sc.nextInt();
		}
		
		// 3�� ����� ���
		System.out.print("3�� ����� : ");
		for (int i = 0; i < arr1.length; i++) { 	// �迭�� ������ ���� ������ �ͼ� 
			if ( arr1[i] % 3 == 0) {				// �迭�� ���� ���� �����ͼ� �������� 0�� ���
				System.out.print(arr1[i] + " ");
			}
				
		}
		
		
		
	}
}
