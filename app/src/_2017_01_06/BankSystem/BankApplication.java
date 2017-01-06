package _2017_01_06.BankSystem;

import java.util.Scanner;

public class BankApplication {
	private Account[] accountArray;
	private Scanner sc;
	public BankApplication() {
		accountArray = new Account[100];
		sc = new Scanner(System.in);
	}
	// 더 필요한 기능 : 비밀번호, 회원정보 ( 수정, 삭제 ), 계좌이체, 금액을 더 넣을 수 있도록 타입 변환 ( 현재 : long 타입 )
	public void execute() {
		boolean run = true;
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택> ");	
			int selectNo = sc.nextInt();
		
			if(selectNo == 1) {
				// 계좌생성
				createAccount();
			}
			else if(selectNo == 2) {
				// 계좌목록 
				accountList();
			}
			else if(selectNo == 3) {
				// 예금
				deposit();
			}
			else if(selectNo == 4) {
				// 출금
				withdraw();
			}
			else if(selectNo == 5) {
				// 종료
				break; // run = false;  도 가능
			}
		}
		System.out.println("프로그램 종료 !");
	}
	
	// 계좌생성
	public void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("초기 입금액 : ");
		long balance = sc.nextLong();
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	// 계좌목록보기
	private void accountList() {
		System.out.println("-----------------------");
		System.out.println("계좌목록");
		System.out.println("-----------------------");
		for(int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno( ) + "\t");
				System.out.print(account.getOwner( ) + "\t");
				System.out.print(account.getBalance( ));
				System.out.println();
			} else {
				break;
			}
		}
	}
	
	// 예금
	private void deposit() {
		
		System.out.print("계좌번호 입력 : ");
		String ano = sc.next();
		System.out.print("예금액 입력 : ");
		long money = sc.nextLong();
		
		// use method
		 Account account = findAccount(ano);
/*		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}*/
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : " + account.getOwner() + "님 계좌로 " + "예금 되었습니다.");
	}
	
	// 출금
	private void withdraw() {
		System.out.print("계좌번호 입력 : ");
		String ano = sc.next();
		System.out.print("출금액 입력 : ");
		long money = sc.nextLong();
		
		// use method
		Account account = findAccount(ano);
/*		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}*/
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : " + account.getOwner() + "님 계좌에서 " + "출금 되었습니다.");
	}
	
	// 검색(ano)
	public Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
	
	public static void main(String args[]) {
		
		BankApplication bank = new BankApplication();
		bank.execute();

	}
}
