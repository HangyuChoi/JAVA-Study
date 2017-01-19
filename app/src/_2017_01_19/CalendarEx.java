package _2017_01_19;

import java.util.Calendar;

public class CalendarEx{

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // +1 의미 : 시작 점이 0으로 잡혀 있기 때문에
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY :
			strWeek = "월";
			break;
		case Calendar.TUESDAY :
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY :
			strWeek = "수";
			break;
		case Calendar.THURSDAY :
			strWeek = "목";
			break;
		case Calendar.FRIDAY :
			strWeek = "금";
			break;
		case Calendar.SATURDAY :
			strWeek = "토";
			break;
		default :
			strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		int hour = now.getMaximum(Calendar.HOUR);
		int minute = now.getMaximum(Calendar.MINUTE);
		int second = now.getMaximum(Calendar.SECOND);
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		//System.out.println(week + "주");
		System.out.println(strWeek + "요일");
		System.out.println(strAmPm);
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		
		now.set(year,  month-1, 1);
		int date = now.get(Calendar.DAY_OF_WEEK);
		int lastday = now.getActualMaximum(Calendar.DATE);
		
		System.out.println("\n\n\t\t	" + year + "년" +month+"월\n\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int j = 1; j < lastday + date; j++){
			if(j < date) {
				System.out.print("\t");
				continue;
			}
			System.out.print((j - date + 1) + "\t");
			if(j%7 == 0){System.out.println();}
		}
	}
}
