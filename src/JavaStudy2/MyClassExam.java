package JavaStudy2;

public class MyClassExam {

	public static void main(String[] args) {
		MyClass mycl = new MyClass();
		
		mycl.method1();
		mycl.method2(10);
		int val = mycl.method3();
		System.out.println("m3: " + val);
		mycl.method4(5, 10);
		int val2 = mycl.method5(55);
		System.out.println(val2);
		
	}

}
