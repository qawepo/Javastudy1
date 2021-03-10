package JavaStudy2;

public class BusExam {

	public static void main(String[] args) {
		Car c = new Bus();
		c.run();
	//	c.fgfg(); // 참조형이 Car라서 Bus의 fgfg함수는 사용불가능
	
		Bus bus = (Bus) c ;
		bus.run();
		bus.fgfg();
	}
	
}
