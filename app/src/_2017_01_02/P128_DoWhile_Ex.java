package _2017_01_02;
public class P128_DoWhile_Ex {
	public static void main(String args[]) {
		int i = 2;
		do {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			i++;
			System.out.println();
		} while ( i < 9);
	}
}




/******************************************/

// do-while �� �⺻
/*//�ݺ��� (do ~ while ��)
		 ǥ��)
			do {
				���౸��;
			} while (���ǽ�);
		 
		
		int count = 0;
		do {
			count++;
			System.out.println("���౸�� " + count);
		} while ( count < 10);*/

/******************************************/

// ������ ���� ���
/*int i = 2;
do {
	for(int j = 1; j < 10; j++) {
		System.out.println(i + " * " + j + " = " + (i*j));
	}
	i++;
	System.out.println();
} while ( i < 9);*/

/******************************************/

// ������ ���� ���
/*int i = 1;
for(int k = 2; k <10; k++){
	System.out.print(k + "��\t\t");
}
System.out.println();
do {
	for(int j = 2; j < 10; j++) {
		System.out.print(j + " * " + i + " = " + (j*i) + "\t");
	}
	i++;
	System.out.println();
} while ( i < 9);*/

/******************************************/