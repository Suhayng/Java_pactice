package Chap14.EX08;

/* 주석 확인 chap15-Ex10 까지
1. Exception 을 상속 받는 사용자 예외 - 일반 예외
	1-1. 점수가 음수인 경우 예외
	1-2. 점수가 100점을 초과 하는 경우 예외
*/

class MinusException extends Exception {	
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception {
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

class AAA {
	int score;
	
	void checkScore (int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("예외 발생 : 음수는 넣을 수 없습니다.");
		} else if (score > 100) {
			throw new OverException("예외 발생 : 100점이 넘는 값은 입력할 수 없습니다.");
		} else {
			System.out.println("정상적으로 잘 입력 되었습니다.");
			this.score = score;
			System.out.println("점수는 : " + this.score);
		}
	}
}

public class UserException {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		
		try {
			aaa.checkScore(-100);
		} catch (MinusException | OverException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("================================");
		
		try {
			aaa.checkScore(200);
		} catch (MinusException | OverException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("================================");
		
		try {
			aaa.checkScore(80);
		} catch (MinusException | OverException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
