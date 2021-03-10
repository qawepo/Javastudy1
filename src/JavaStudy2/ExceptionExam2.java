package JavaStudy2;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try{int k = divide(i, j);
		System.out.println(k);
	}catch(Exception e) {
		System.out.println("오류 처리  " + e.toString());
	}
		}

	private static int divide(int i, int j) throws Exception{
		int k = i/j;
		return k;
	}

}
