package JavaStudy2;

public class WrapperExam {
	public static void main(String[] args) {
		int i1 = 5;
		
		Integer i2 = new Integer(5);
		Integer i3 = 5;		//오토박싱
		
		int i4 = i3.intValue();
		int i5 = i3;		//오토언박싱
	}
}
