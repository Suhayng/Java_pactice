package ExAnswer;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};		// ȯ�� �� ���� ������ �迭�� ����
		int money ;			// ��ĳ�ʷ� ��ǲ ���� ���� �����ϴ� ����
		
		System.out.println("ȯ���� ���� �ݾ��� �Է��Ͻÿ� >> ");
		money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			System.out.printf(" %d �� ¥�� : %d �� \n" , unit[i], money/unit[i]);
			//System.out.println(unit[i] + " �� ¥�� : " + money / unit[i] + "��");
			money = money - (money / unit[i] ) * unit[i];
							//ȯ���� ���� ����(1)	* 50000
		}
		
		
		
		
		
		
	}
}