package JavaStudy2;

public class VariableScopeExam {
	int globalScope = 10;
	static int staticval = 7;

	public void scopeTest(int val) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(val);
		
	}
	
	public void scopeTest2(int val2) {
		System.out.println(globalScope);
//		System.out.println(localScope); // scopeTest에 있음
//		System.out.println(val); //  scopeTest에 있음
		System.out.println(val2);
	}
	
	
	public static void main(String[] args) {
//		System.out.println(globalScope); // static하지 않은 변수를 불러옴
		System.out.println(staticval);
		
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticval = 50;
		v2.staticval = 100;
		System.out.println(v1.staticval);
		System.out.println(v2.staticval);
		System.out.println(VariableScopeExam.staticval);
	}

}
