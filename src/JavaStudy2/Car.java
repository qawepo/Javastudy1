package JavaStudy2;

public class Car {
	//필드 선언: 타입 필드명
	String name;
	int number;
	
	public Car() {
		
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car(String name, int num) {
		this.name = name;
		this.number = num;
	}
	
	public void run() {
		System.out.println("Car is 달리다.");
	}
}
