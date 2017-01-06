package _2017_01_06.BankSystem;

import java.util.Scanner;

public class BankApplication {
	private Account[] accountArray;
	private Scanner sc;
	public BankApplication() {
		accountArray = new Account[100];
		sc = new Scanner(System.in);
	}
	// �� �ʿ��� ��� : ��й�ȣ, ȸ������ ( ����, ���� ), ������ü, �ݾ��� �� ���� �� �ֵ��� Ÿ�� ��ȯ ( ���� : long Ÿ�� )
	public void execute() {
		boolean run = true;
		while(run) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("����> ");	
			int selectNo = sc.nextInt();
		
			if(selectNo == 1) {
				// ���»���
				createAccount();
			}
			else if(selectNo == 2) {
				// ���¸�� 
				accountList();
			}
			else if(selectNo == 3) {
				// ����
				deposit();
			}
			else if(selectNo == 4) {
				// ���
				withdraw();
			}
			else if(selectNo == 5) {
				// ����
				break; // run = false;  �� ����
			}
		}
		System.out.println("���α׷� ���� !");
	}
	
	// ���»���
	public void createAccount() {
		System.out.println("----------");
		System.out.println("���»���");
		System.out.println("----------");
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		System.out.print("������ : ");
		String owner = sc.next();
		System.out.print("�ʱ� �Աݾ� : ");
		long balance = sc.nextLong();
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
	// ���¸�Ϻ���
	private void accountList() {
		System.out.println("-----------------------");
		System.out.println("���¸��");
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
	
	// ����
	private void deposit() {
		
		System.out.print("���¹�ȣ �Է� : ");
		String ano = sc.next();
		System.out.print("���ݾ� �Է� : ");
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
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("��� : " + account.getOwner() + "�� ���·� " + "���� �Ǿ����ϴ�.");
	}
	
	// ���
	private void withdraw() {
		System.out.print("���¹�ȣ �Է� : ");
		String ano = sc.next();
		System.out.print("��ݾ� �Է� : ");
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
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("��� : " + account.getOwner() + "�� ���¿��� " + "��� �Ǿ����ϴ�.");
	}
	
	// �˻�(ano)
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
