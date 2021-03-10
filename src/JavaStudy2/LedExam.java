package JavaStudy2;

public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.chgVol(8);
		tv.chgChan(39);
		tv.tunrOff();
	}

}
