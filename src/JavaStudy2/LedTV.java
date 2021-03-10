package JavaStudy2;

public class LedTV implements TV { //인터페이스를 구형할때는 implements를 사용

	@Override
	public void turnOn() {
		System.out.println("켠다");

	}

	@Override
	public void tunrOff() {
		System.out.println("끈다");
	}

	@Override
	public void chgVol(int volume) {
		System.out.println("볼륨 조절");
	}

	@Override
	public void chgChan(int channel) {
		System.out.println("채널 지정");
	}

}
