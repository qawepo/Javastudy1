package JavaStudy2;

public class ExceptionExam3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		int k;
		try {
			k = divide(i, j);		System.out.println(k);
		} catch (IllegalAccessException e) {
			System.out.println(e.toString());
		}

		}

	private static int divide(int i, int j) throws IllegalAccessException{
		if(j== 0) {
			throw new IllegalAccessException("0으로 나눌 수 없습니다.");
		}
		int k = i/j;
		return k;
	}

}
