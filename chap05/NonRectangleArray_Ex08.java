package chap05;
public class NonRectangleArray_Ex08 {
	public static void main(String[] args) {
		//비정방형 ( NonRectangle ) 선언과 값 대입 방법 1
				// 비정방형이란? 행에 따라서 열의 개수가 각각 다르다.
		int[][] array1 = new int[2][]; 	// 행의 개수만 생성해서 방의 크기를 만든다.
		array1[0] = new int[2];			// inex 0 행의 열의 방 2개 생성
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[1] = new int[3];			// index 1 행의 열의 방 3개 생성
		array1[1][0] = 3;
		array1[1][1] = 4;
		array1[1][2] = 5;
		
		System.out.print(array1[0][0] + " " + array1[0][1]);
		System.out.println();
		System.out.print(array1[1][0] + " " + array1[1][1]+ " " + array1[1][2]);
		System.out.println();
		System.out.println("=========================");
		
		int[][] array2 = new int [2][];
		array2[0] = new int[] {1, 2};
		array2[1] = new int[] {3, 4, 5};
		
		System.out.print(array2[0][0] + " " + array2[0][1]);
		System.out.println();
		System.out.print(array2[1][0] + " " + array2[1][1]+ " " + array2[1][2]);
		System.out.println();
		System.out.println("=========================");
		
		//비정방형 ( NonRectangle ) 선언과 값 대입 방법 2
		int[][] array3 = new int[][] {{1,2}, {3,4,5}};
		
		System.out.print(array3[0][0] + " " + array3[0][1]);
		System.out.println();
		System.out.print(array3[1][0] + " " + array3[1][1]+ " " + array3[1][2]);
		System.out.println();
		System.out.println("=========================");
		
		int[][] array4; 
		array4 = new int[][] {{1,2}, {3,4,5}};
		
		System.out.print(array4[0][0] + " " + array4[0][1]);
		System.out.println();
		System.out.print(array4[1][0] + " " + array4[1][1]+ " " + array4[1][2]);
		System.out.println();
		System.out.println("=========================");
		
		
		// 비정방형 ( NonRectangle ) 선언과 값 대입 방법 3.
		int[][] array5 ={{1,2}, {3,4,5}};
		
		System.out.print(array5[0][0] + " " + array5[0][1]);
		System.out.println();
		System.out.print(array5[1][0] + " " + array5[1][1]+ " " + array5[1][2]);
		System.out.println();
		System.out.println("=========================");
		
		/*
		int[][] array6;
		array6 ={{1,2}, {3,4,5}};		// 오류 발생
		
		System.out.print(array6[0][0] + " " + array6[0][1]);
		System.out.println();
		System.out.print(array6[1][0] + " " + array6[1][1]+ " " + array6[1][2]);
		System.out.println();
		System.out.println("=========================");
		*/
		
		
		
		
		
		
		
	}
}
