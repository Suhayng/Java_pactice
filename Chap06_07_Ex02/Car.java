package Chap06_07_Ex02;

public class Car {

	String company ;
	String model ;
	String color ;
	int maxSpeed ;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {		// RAM�� ���� �ο��� �� setter
		this.company = company;						// this : �ڽ��� ��ü
	} // �޼ҵ忡 ��ǲ�Ǵ� ������, ��ǲ�Ǵ� ������ �� �޴� ������, �޸𸮿� �ε��� ������ (this.												
	public String getModel() {
		return model;
	}
	public void setModel(String model) {			// ��ǲ, ��ǲ�� �޴� ����, �޸𸮿� �ε��� ������
		this.model = model;							// ��� �ٸ� ���� this Ű���带 ���� ����.
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
