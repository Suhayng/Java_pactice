package Chap06_07_Ex02;
import java.util.Scanner;
public class Example {
	public static void main(String[] args) {


		// [����] : ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ��� .. >>
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �������� �Է��Ͻÿ�.");		
		
		int[] arr = new int[] {};
		int sum = 0;		
		int avg = 0;
		
		for (int i = 0; i < arr.length ; i++) {
			sc.nextInt();
			sum += arr[i];
			avg = sum / i+1;
		}
		    
		System.out.println(arr);
		System.out.println("���� : " + sum);
		System.out.println("����� : " + avg);
		
	}
}
