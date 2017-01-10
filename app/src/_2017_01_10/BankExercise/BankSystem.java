package _2017_01_10.BankExercise;

import java.util.Scanner;


/*	Create by ���ѱ�	
	- ��� ����
	��	0. ����ȭ�� ���
	��	1. ȸ������(�������Է�)	// �н����� ���Է��ϰ� �ϱ� Ʋ���� �繰��	// ���̵� �ߺ�X
		( �����, �Ϲݰ� ) 
	��	2. Ư�� ȸ�� ���� �˻�
	��	3. ��ü ȸ�� ���� �˻�	�н����� ����
	��	4. �Ա�
	��	5. ��� <- ������ ����( �Ϲݰ� : 500�� , ����� : 300�� )
		6. ������ü
	    7. ������ ���� ���
		8. ������ ���
	��	9. ���α׷� ����

 */
public class BankSystem {
	private Member[] memberArray;
	private Scanner sc;
	
	public BankSystem() {
		memberArray = new Member[100];
		sc = new Scanner(System.in);
	}
	
	public void choice() {
		boolean run = true;
		
		while(run) {
			System.out.println("================================================");
			System.out.println("[1]. ������ �Է�");
			System.out.println("[2]. Ư�� ������ ���");
			System.out.println("[3]. ��ü ������ ���");
			System.out.println("[4]. �ݾ� �Ա�");
			System.out.println("[5]. �ݾ� ���");
			System.out.println("[6]. ������ü");
			System.out.println("[7]. ���α׷� ����");
			System.out.println("================================================");
			System.out.print("���� : ");
			int input = sc.nextInt();	
				
			if(input == 1){
				System.out.println("[1]. ������ �Է��� �����ϼ̽��ϴ�.");
				register();
			} else if(input == 2){
				System.out.println("[2]. Ư�� ������ ����� �����ϼ̽��ϴ�.");
				memberInfo();
			} else if(input == 3){
				System.out.println("[3]. ��ü ������ ����� �����ϼ̽��ϴ�.");
				allMemberList();
			} else if(input == 4){
				System.out.println("[4]. �ݾ� �Ա��� �����ϼ̽��ϴ�.");
				deposit();
			} else if(input == 5){
				System.out.println("[5]. �ݾ� ����� �����ϼ̽��ϴ�.");
				withdraw();
			} else if(input == 6){
				//System.out.println("[6]. ������ü�� �����ϼ̽��ϴ�.");
				System.out.println("����� �������� �ʾҽ��ϴ�.");
			} else if(input == 7){
				run = false;
				System.out.println("[7]. ���α׷� ���Ḧ �����ϼ̽��ϴ�.");
				
			} else {
				exception();			
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	// [1]. �� ���� �Է�
	public void register() {
		boolean idRun = true;
		System.out.println("================================================");
		while(idRun) {

		System.out.print("���̵� : ");
		String id = sc.next();			
		
		// ���̵� �ߺ� Ȯ��
		Member member = createMember(id);
		
		if(member != null) {
				System.out.println("���̵� �ߺ��˴ϴ�. �ٽ� �Է����ּ���.");
				System.out.println("================================================");
				continue;
		}
		System.out.print("ȸ���̸� : ");
		String name = sc.next();
		System.out.print("��й�ȣ : ");
		String password = sc.next();
		
		boolean pwRun = true;
		
		while(pwRun){
			System.out.print("��й�ȣ ���Է� : ");
			String password2 = sc.next();
			if(password2 == "0"){
				choice();
			} else if(password.equals(password2) == false){
				System.out.println("================================================");
				System.out.println("ȸ�������� ��� �Ͻ÷��� 0���� �Է����ּ���.");
				System.out.println("��й�ȣ�� �����ʽ��ϴ�. �ٽ� �Է����ּ���.");
				System.out.println("================================================");
			} else {
				pwRun = false;
			}
		}
		
		System.out.print("�ʱ� �Աݾ� : ");
		long balance = sc.nextLong();
		System.out.println("����� �������ּ���.");
		System.out.println("[ �Ϲ�ȸ�� : 1 ], [ ���ȸ�� : 2 ]");
		System.out.print("��� : ");
		int rank = sc.nextInt();
		
		Member newMember = new Member(id, name, password, balance, rank);
		
		for(int i = 0; i < memberArray.length; i++) {
			if(memberArray[i] == null) {
				memberArray[i] = newMember;
				System.out.println("------------------------------------------------");
				System.out.print(name + "���� "); rankSelect(newMember.getRank());
				System.out.println(name + "���� ȸ�������� �Ϸ��Ͽ����ϴ�.");
				break;
			}
		}
		idRun = false;
		} // end idRun
	}
	
	// [1].-1 ���̵� �ߺ�Ȯ��
	public Member createMember(String id) {
		
		Member member = null; 
		
		for(int i = 0; i < memberArray.length; i++){
			if(memberArray[i] != null) {
				String dbId = memberArray[i].getId();
				if(dbId.equals(id)){
					member = memberArray[i];
					break;
				}
			}
		}
		return member;
	}
		
	// [2]. Ư�� ������ ���
	public void memberInfo() {
		System.out.println("================================================");
		System.out.println("Ư�� ������ ���");
		System.out.println("------------------------------------------------");
		System.out.print("���̵� : ");
		String id = sc.next();
		
		Member member = findMember(id);
		
		if(member == null) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			return;
		} else {
			System.out.println(member.getId() + "���� �����Դϴ�.");
			System.out.println("================================================");
			System.out.println("���̵�: " + member.getId());
			System.out.println("�̸�  : " + member.getName());
			System.out.println("�ܾ�  : " + member.getBalance() + " ��");
			rankSelect(member.getRank());
			System.out.println("------------------------------------------------");
		}
	}
	
	// [2].-1 ���̵� �˻�
	public Member findMember(String id) {
		Member member = null; 
		for(int i = 0; i < memberArray.length; i++){
			if(memberArray[i] != null) {
				String dbId = memberArray[i].getId();
				if(dbId.equals(id)){
					member = memberArray[i];
					break;
				}
			}
		}
		return member;
	}
		
	// [3]. ��ü ������ ���
	public void allMemberList() {
		System.out.println("================================================");
		System.out.println("��ü ������ ���");
		System.out.println("------------------------------------------------");
		for(int i = 0; i < memberArray.length; i++) {
			Member member = memberArray[i];
			if(memberArray[0] == null) {
				System.out.println("�������� �����ϴ�.");
				break;
			} else if(member != null) {
				System.out.println("���̵�: " + member.getId());
				System.out.println("�̸�  : " + member.getName());
				System.out.println("�ܾ�  : " + member.getBalance() + " ��");
				rankSelect(member.getRank());
				System.out.println("------------------------------------------------");
			} else {
				break;
			}
		}
	}

	// ����� ����
	public Member authMember(String id, String pw) {
		Member member = null; 
		for(int i = 0; i < memberArray.length; i++){
			if(memberArray[i] != null) {
				String dbId = memberArray[i].getId();
				String dbPw = memberArray[i].getPassword();
				if(dbId.equals(id) && dbPw.equals(pw)){
					member = memberArray[i];
					break;
				}
			}
		}
		return member;
	}
	
	// [4]. �ݾ� �Ա�
	public void deposit() {
		System.out.println("================================================");
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("��й�ȣ : ");
		String password = sc.next();
		
		// ����� ����
		Member depositAuth = authMember(id, password);

		if(depositAuth != null) {
			System.out.println(depositAuth.getName()+"�� �����Ǿ����ϴ�.");
			System.out.println("�����Ͻ� �ݾ��� �Է����ּ���.");
			System.out.print("���ݾ� : ");
			long balance = sc.nextLong();
			
			depositAuth.addBalance(balance);
			System.out.println(depositAuth.getName() + "���� �ܾ��� " + depositAuth.getBalance() + "�� �Դϴ�.");
		} else {
				System.out.println("------------------------------------------------");
				System.out.println("�Էµ� ������ �ùٸ��� �ʽ��ϴ�.");
			}
		}
	
	// [5]. �ݾ� ���
	public void withdraw() {
		System.out.println("================================================");
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("��й�ȣ : ");
		String password = sc.next();
		
		// ����� ����
		Member withdrawAuth = authMember(id, password);
		
		if(withdrawAuth != null) {
			System.out.println(withdrawAuth.getName()+"�� �����Ǿ����ϴ�.");
			if(withdrawAuth.getRank() == 1){
				System.out.println("����Ͻ� �ݾ��� �Է����ּ���. [������ 500��]");
			} else {
				System.out.println("����Ͻ� �ݾ��� �Է����ּ���. [������ 300��]");
			}
			System.out.print("��ݾ� : ");
			long balance = sc.nextLong();
			System.out.println("------------------------------------------------");
			
			withdrawAuth.withdrawBalance(balance);
			
			System.out.println(withdrawAuth.getName() + "���� �ܾ��� " + withdrawAuth.getBalance() + "�� �Դϴ�.");
		} else {
				System.out.println("------------------------------------------------");
				System.out.println("�Էµ� ������ �ùٸ��� �ʽ��ϴ�.");
			}
	}
	
	// [����ó��]
	public void exception() {
		System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
	}
	
	
	
	// [6]. ������ü
//	public void transfer() {
//		System.out.println("================================================");
//		System.out.print("���̵� : ");
//		String id = sc.next();
//		System.out.print("��й�ȣ : ");
//		String password = sc.next();
//		
//		for(int i = 0; i < memberArray.length; i++) {
//				Member member = memberArray[i];
//			if(member.getId().equals(id) && member.getPassword().equals(password)) {
//				System.out.println(member.getName()+"�� �����Ǿ����ϴ�.");
//				System.out.println();
//				System.out.println("��ü���� ���̵� �Է��ϼ���.");
//				String transfer_id = sc.next();
//				
//				Member transforMember = findMember(transfer_id);
//				
//				if(transforMember == null) {
//					System.out.println("���̵� �������� �ʽ��ϴ�.");
//					return;
//				} else {
//					System.out.println("��ü�ϽǺ��� ������ "+ member.getName() + "���� �½��ϱ�?");
//					System.out.println("������ Y, �ƴϸ� N");
//					String yn = sc.next();
//					switch(yn) {
//						case "y" :
//						case "Y" :
//							System.out.println("��ü�Ͻ� �ݾ��� �Է��ϼ���. ");
//							System.out.print("��ü�ݾ� : ");
//							long balance = sc.nextLong();
//							member.withdrawBalance(balance);
//							break;
//						
//						case "n" :
//						case "N" :
//						
//						
//							break;
//					}
//				}
//				if(member.getRank() == 1){
//					System.out.println("����Ͻ� �ݾ��� �Է����ּ���. [������ 500��]");
//				} else {
//					System.out.println("����Ͻ� �ݾ��� �Է����ּ���. [������ 300��]");
//				}
//				
//				System.out.print("��ݾ� : ");
//				long balance = sc.nextLong();
//				System.out.println("------------------------------------------------");
//				member.withdrawBalance(balance);
//				break;
//			} else {
//				System.out.println("------------------------------------------------");
//				System.out.println("�Էµ� ������ �ùٸ��� �ʽ��ϴ�.");
//				break;
//			}
//		}
//	}
	
	
	// ��� ����
	public void rankSelect(int rank) {
		if(rank == 1){
			String Rank1 = "�Ϲ�ȸ��";
			System.out.println("���  : " + Rank1);
		} else {
			String Rank2 = "���ȸ��";
			System.out.println("���  : " + Rank2);
		}
	}

	public static void main(String args[]) {
		BankSystem banksystem = new BankSystem();
		banksystem.choice();
	}
}
