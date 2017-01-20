package _2017_01_20;

import java.util.Scanner;

public class AccountEx3_main {
	public static void main(String[] args) {
		AccountEx3 account = new AccountEx3();
		
		Scanner sc = new Scanner(System.in);
		
		// 예금하기
		System.out.print("금액을 입력하세요 : ");
		account.deposit(sc.nextInt());
		System.out.println("예금액 : "+ account.getBalance());
		
		// 출금하기
		System.out.print("금액을 입력하세요 : ");
		try {
			account.withdraw(sc.nextInt());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			return;
		}
		System.out.println("정상적으로 처리되었습니다.");
		System.out.println("예금 잔액 : "+ account.getBalance());
	}

}
