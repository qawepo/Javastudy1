package JavaStudy2;

public class MyCalExam {
	
	public static void main(String[] args) {
		Calculator ca1 = new MyCal();
		ca1.plus(3, 4);
		int i = ca1.exec(5, 6);
		System.out.println(i);
		
		Calculator.exec2(3, 4);
	}
}
