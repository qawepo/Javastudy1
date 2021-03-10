package JavaStudy2;

public interface Calculator {
	public int plus(int x, int y);
	public int multiple(int x, int y);
	
	default int exec(int x, int y) {
		return x+y;
	}
	
	public static int exec2(int x, int y) {
		return x*y;
	}
}
