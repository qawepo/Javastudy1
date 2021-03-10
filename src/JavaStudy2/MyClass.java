package JavaStudy2;

public class MyClass {
//	public 리턴타입 메소드명(매개변수들 ){몸통 }
	
	public void method1() { //매개변수도 없고 리턴값도 없음
		System.out.println("m1 run... ");
	}
	
	public void method2(int x) { //매개변수는 있지만 리턴값은 없음
		System.out.println(x + " run... ");
	}
	
	public int method3() { //매개변수 int형 리턴값 있음
		System.out.println("m3 run... ");
		return 10;
	}
	
	public void method4(int x, int y) { //매개변수 2, 리턴값 없음
		System.out.println(x+y + " run... ");
	}
	
	public int method5(int y) { //매개변수를 받고 리턴값 있음
		System.out.println(y+" run...");
		
		return y*2;
	}
}
