package JavaIO.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteExam1 {
	public static void main(String[] args) {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		try {
			fo = new FileOutputStream("byte.txt");
			fi = new FileInputStream("src/javaIO/exam/ByteExam1.java");
		
			int readDate = -1;
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
