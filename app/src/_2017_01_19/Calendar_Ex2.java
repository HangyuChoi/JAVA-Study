package _2017_01_19;

import java.util.Calendar;

public class Calendar_Ex2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int Year = 2005;
		int Month = 0;
		int Day = 1;
		
		for(int i = 0; i < Month; i++){	// 12월 배열로 넣기
			Month = i; 
		}

		// now.getFirstDayOfWeek()); //이 주의 첫날이 뭔지
		for(int i = 0; i < Month; i++) {
			System.out.println("\n\n\t\t	" + Year + "년  " +(i+1)+"월\n\n");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			now.set(Year, Month+i, Day+i);
			
			int maxDay_for = now.getActualMaximum(Calendar.DAY_OF_MONTH); 	// 마지막 일
			int startWeek_for = now.get(Calendar.DAY_OF_WEEK);	// 시작요일  1 = 일요일 , 7 = 토요일
			
			for(int j = 1; j < maxDay_for + startWeek_for; j++){
				if(j < startWeek_for) {
					System.out.print("\t");
					continue;
				}
				System.out.print((j - startWeek_for + 1) + "\t");
				if(j % 7 == 0){
					System.out.println();
				}
			}
		}
	}
}