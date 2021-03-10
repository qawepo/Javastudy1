package JavaStudy2;

public interface TV {
	public int MIN_VOLUME=0;
	public int MAX_VAOLUME=0;
	
	public void turnOn();
	public void tunrOff();
	public void chgVol(int volume);
	public void chgChan(int channel);
}
