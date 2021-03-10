package JavaStudy2;

public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		StringBuffer sb2 = new StringBuffer();
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb3 = sb2.append("hello");
		if(sb2 == sb3) {
			System.out.println("sb2 같음 sb3");
		}//자기 자신의 메소드를 호출하여 자기 자신의 값을 바꿔나가는 것을 메소드체이닝 이라고 한다.
		
		System.out.println(str);
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
	}
}
