package _2017_01_19;

import java.util.Calendar;

public class Calendar_Ex2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int Year = 2005;
		int Month = 0;
		int Day = 1;
		
		for(int i = 0; i < Month; i++){	// 12�� �迭�� �ֱ�
			Month = i; 
		}

		// now.getFirstDayOfWeek()); //�� ���� ù���� ����
		for(int i = 0; i < Month; i++) {
			System.out.println("\n\n\t\t	" + Year + "��  " +(i+1)+"��\n\n");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			now.set(Year, Month+i, Day+i);
			
			int maxDay_for = now.getActualMaximum(Calendar.DAY_OF_MONTH); 	// ������ ��
			int startWeek_for = now.get(Calendar.DAY_OF_WEEK);	// ���ۿ���  1 = �Ͽ��� , 7 = �����
			
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