package _2017_01_20;

import java.util.Scanner;

public class AccountEx3_main {
	public static void main(String[] args) {
		AccountEx3 account = new AccountEx3();
		
		Scanner sc = new Scanner(System.in);
		
		// �����ϱ�
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		account.deposit(sc.nextInt());
		System.out.println("���ݾ� : "+ account.getBalance());
		
		// ����ϱ�
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		try {
			account.withdraw(sc.nextInt());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			return;
		}
		System.out.println("���������� ó���Ǿ����ϴ�.");
		System.out.println("���� �ܾ� : "+ account.getBalance());
	}

}
