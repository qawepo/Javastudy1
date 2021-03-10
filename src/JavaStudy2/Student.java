package JavaStudy2;

public class Student {
	String name;
	String number;
	int birthyear;
	

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthyear=" + birthyear + "]";
	}




	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "홍길동";
		st1.number="1234";
		st1.birthyear = 1995;
		
		Student st2 = new Student();
		st2.name = "홍길동";
		st2.number = "1234";
		st2.birthyear = 1995;
		
		if(st1.equals(st2)) {
			System.out.println("st1 == st2");
		}else {
			System.out.println("st1 != st2");
		}
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		
		System.out.println(st1);
		System.out.println(st1.toString());
		}
	}






