package Ex;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};		
	
		System.out.println("�ݾ��� �Է��Ͻÿ� >> ");
		int m = sc.nextInt();
		
		for(int i = 0 ; i < unit.length ; i++) {
			if( m / unit[i] >= 1 ) 
			System.out.println(unit[i] + "�� ¥�� : " + m / unit[i] + "��");
			m = m % unit[i];	
			
		}
		sc.close();
	}
}
