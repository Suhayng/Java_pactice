package Chap06_07_Ex02;

public class Car {

	String company ;
	String model ;
	String color ;
	int maxSpeed ;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {		// RAM의 값을 부여할 때 setter
		this.company = company;						// this : 자신의 객체
	} // 메소드에 인풋되는 변수명, 인풋되는 변수를 를 받는 변수명, 메모리에 로드할 변수명 (this.												
	public String getModel() {
		return model;
	}
	public void setModel(String model) {			// 인풋, 인풋을 받는 변수, 메모리에 로드할 변수가
		this.model = model;							// 모두 다를 때는 this 키워드를 생략 가능.
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
