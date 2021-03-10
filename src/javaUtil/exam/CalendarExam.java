package javaUtil.exam;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5); // 5시간 후
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		
	}
}

//import java.util.*;
//import java.util.Calendar;
//
//public class CalendarExam{
//    public String hundredDaysAfter(){
//        Calendar cal = Calendar.getInstance();
//        
//        int yyyy = cal.get(Calendar.YEAR);
//        int MM = cal.get(Calendar.MONTH) + 1;
//        int dd = cal.get(Calendar.DATE);
//        
//        cal.add(Calendar.DATE , 100);
//        
//        String nowdate = yyyy + "년" + MM + "월" + dd + "일";
//        
//        return nowdate;
//        
//    }
//    public static void main(String[] args){
//        CalendarExam cE = new CalendarExam();
//        System.out.println(cE.hundredDaysAfter());
//    }
//}
