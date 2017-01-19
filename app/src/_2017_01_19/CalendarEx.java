package _2017_01_19;

import java.util.Calendar;

public class CalendarEx{

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // +1 �ǹ� : ���� ���� 0���� ���� �ֱ� ������
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY :
			strWeek = "��";
			break;
		case Calendar.TUESDAY :
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY :
			strWeek = "��";
			break;
		case Calendar.THURSDAY :
			strWeek = "��";
			break;
		case Calendar.FRIDAY :
			strWeek = "��";
			break;
		case Calendar.SATURDAY :
			strWeek = "��";
			break;
		default :
			strWeek = "��";
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		int hour = now.getMaximum(Calendar.HOUR);
		int minute = now.getMaximum(Calendar.MINUTE);
		int second = now.getMaximum(Calendar.SECOND);
		
		System.out.println(year + "��");
		System.out.println(month + "��");
		System.out.println(day + "��");
		//System.out.println(week + "��");
		System.out.println(strWeek + "����");
		System.out.println(strAmPm);
		System.out.println(hour + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");
		
		now.set(year,  month-1, 1);
		int date = now.get(Calendar.DAY_OF_WEEK);
		int lastday = now.getActualMaximum(Calendar.DATE);
		
		System.out.println("\n\n\t\t	" + year + "��" +month+"��\n\n");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
