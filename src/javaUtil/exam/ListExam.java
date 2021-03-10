package javaUtil.exam;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// list에 3개의 문자열을 저장합니다.
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size()); // list에 저장된 자료의 수를 출력(중복을 허용하므로 3 출력)
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
