package Ex;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		
		System.out.println("���� ���� 10���� �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		for( int i = 0 ; i < array.length ; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("3�� ����� : ");
		for( int j = 0 ; j < array.length ; j++) {
			if(array[j] % 3 == 0) {
				System.out.print(array[j] + " ");
			}
		}
		sc.close();
	}
}
