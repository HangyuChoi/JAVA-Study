package _2017_01_10.BankExercise;

import java.util.Scanner;


/*	Create by 최한규	
	- 기능 정의
	완	0. 선택화면 출력
	완	1. 회원가입(고객정보입력)	// 패스워드 재입력하게 하기 틀리면 재물음	// 아이디 중복X
		( 우수고객, 일반고객 ) 
	완	2. 특정 회원 정보 검색
	완	3. 전체 회원 정보 검색	패스워드 은닉
	완	4. 입금
	완	5. 출금 <- 수수료 포함( 일반고객 : 500원 , 우수고객 : 300원 )
		6. 계좌이체
	    7. 이자율 정보 출력
		8. 이자율 계산
	완	9. 프로그램 종료

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
			System.out.println("[1]. 고객정보 입력");
			System.out.println("[2]. 특정 고객정보 출력");
			System.out.println("[3]. 전체 고객정보 출력");
			System.out.println("[4]. 금액 입금");
			System.out.println("[5]. 금액 출금");
			System.out.println("[6]. 계좌이체");
			System.out.println("[7]. 프로그램 종료");
			System.out.println("================================================");
			System.out.print("선택 : ");
			int input = sc.nextInt();	
				
			if(input == 1){
				System.out.println("[1]. 고객정보 입력을 선택하셨습니다.");
				register();
			} else if(input == 2){
				System.out.println("[2]. 특정 고객정보 출력을 선택하셨습니다.");
				memberInfo();
			} else if(input == 3){
				System.out.println("[3]. 전체 고객정보 출력을 선택하셨습니다.");
				allMemberList();
			} else if(input == 4){
				System.out.println("[4]. 금액 입금을 선택하셨습니다.");
				deposit();
			} else if(input == 5){
				System.out.println("[5]. 금액 출금을 선택하셨습니다.");
				withdraw();
			} else if(input == 6){
				//System.out.println("[6]. 계좌이체를 선택하셨습니다.");
				System.out.println("기능이 구현되지 않았습니다.");
			} else if(input == 7){
				run = false;
				System.out.println("[7]. 프로그램 종료를 선택하셨습니다.");
				
			} else {
				exception();			
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("프로그램을 종료합니다.");
	}
	
	// [1]. 고객 정보 입력
	public void register() {
		boolean idRun = true;
		System.out.println("================================================");
		while(idRun) {

		System.out.print("아이디 : ");
		String id = sc.next();			
		
		// 아이디 중복 확인
		Member member = createMember(id);
		
		if(member != null) {
				System.out.println("아이디가 중복됩니다. 다시 입력해주세요.");
				System.out.println("================================================");
				continue;
		}
		System.out.print("회원이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		boolean pwRun = true;
		
		while(pwRun){
			System.out.print("비밀번호 재입력 : ");
			String password2 = sc.next();
			if(password2 == "0"){
				choice();
			} else if(password.equals(password2) == false){
				System.out.println("================================================");
				System.out.println("회원가입을 취소 하시려면 0번을 입력해주세요.");
				System.out.println("비밀번호가 맞지않습니다. 다시 입력해주세요.");
				System.out.println("================================================");
			} else {
				pwRun = false;
			}
		}
		
		System.out.print("초기 입금액 : ");
		long balance = sc.nextLong();
		System.out.println("등급을 선택해주세요.");
		System.out.println("[ 일반회원 : 1 ], [ 우수회원 : 2 ]");
		System.out.print("등급 : ");
		int rank = sc.nextInt();
		
		Member newMember = new Member(id, name, password, balance, rank);
		
		for(int i = 0; i < memberArray.length; i++) {
			if(memberArray[i] == null) {
				memberArray[i] = newMember;
				System.out.println("------------------------------------------------");
				System.out.print(name + "님의 "); rankSelect(newMember.getRank());
				System.out.println(name + "님의 회원가입을 완료하였습니다.");
				break;
			}
		}
		idRun = false;
		} // end idRun
	}
	
	// [1].-1 아이디 중복확인
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
		
	// [2]. 특정 고객정보 출력
	public void memberInfo() {
		System.out.println("================================================");
		System.out.println("특정 고객정보 목록");
		System.out.println("------------------------------------------------");
		System.out.print("아이디 : ");
		String id = sc.next();
		
		Member member = findMember(id);
		
		if(member == null) {
			System.out.println("아이디가 존재하지 않습니다.");
			return;
		} else {
			System.out.println(member.getId() + "님의 정보입니다.");
			System.out.println("================================================");
			System.out.println("아이디: " + member.getId());
			System.out.println("이름  : " + member.getName());
			System.out.println("잔액  : " + member.getBalance() + " 원");
			rankSelect(member.getRank());
			System.out.println("------------------------------------------------");
		}
	}
	
	// [2].-1 아이디 검색
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
		
	// [3]. 전체 고객정보 출력
	public void allMemberList() {
		System.out.println("================================================");
		System.out.println("전체 고객정보 목록");
		System.out.println("------------------------------------------------");
		for(int i = 0; i < memberArray.length; i++) {
			Member member = memberArray[i];
			if(memberArray[0] == null) {
				System.out.println("고객정보가 없습니다.");
				break;
			} else if(member != null) {
				System.out.println("아이디: " + member.getId());
				System.out.println("이름  : " + member.getName());
				System.out.println("잔액  : " + member.getBalance() + " 원");
				rankSelect(member.getRank());
				System.out.println("------------------------------------------------");
			} else {
				break;
			}
		}
	}

	// 사용자 인증
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
	
	// [4]. 금액 입금
	public void deposit() {
		System.out.println("================================================");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		// 사용자 인증
		Member depositAuth = authMember(id, password);

		if(depositAuth != null) {
			System.out.println(depositAuth.getName()+"님 인증되었습니다.");
			System.out.println("예금하실 금액을 입력해주세요.");
			System.out.print("예금액 : ");
			long balance = sc.nextLong();
			
			depositAuth.addBalance(balance);
			System.out.println(depositAuth.getName() + "님의 잔액은 " + depositAuth.getBalance() + "원 입니다.");
		} else {
				System.out.println("------------------------------------------------");
				System.out.println("입력된 정보가 올바르지 않습니다.");
			}
		}
	
	// [5]. 금액 출금
	public void withdraw() {
		System.out.println("================================================");
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		
		// 사용자 인증
		Member withdrawAuth = authMember(id, password);
		
		if(withdrawAuth != null) {
			System.out.println(withdrawAuth.getName()+"님 인증되었습니다.");
			if(withdrawAuth.getRank() == 1){
				System.out.println("출금하실 금액을 입력해주세요. [수수료 500원]");
			} else {
				System.out.println("출금하실 금액을 입력해주세요. [수수료 300원]");
			}
			System.out.print("출금액 : ");
			long balance = sc.nextLong();
			System.out.println("------------------------------------------------");
			
			withdrawAuth.withdrawBalance(balance);
			
			System.out.println(withdrawAuth.getName() + "님의 잔액은 " + withdrawAuth.getBalance() + "원 입니다.");
		} else {
				System.out.println("------------------------------------------------");
				System.out.println("입력된 정보가 올바르지 않습니다.");
			}
	}
	
	// [예외처리]
	public void exception() {
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
	}
	
	
	
	// [6]. 계좌이체
//	public void transfer() {
//		System.out.println("================================================");
//		System.out.print("아이디 : ");
//		String id = sc.next();
//		System.out.print("비밀번호 : ");
//		String password = sc.next();
//		
//		for(int i = 0; i < memberArray.length; i++) {
//				Member member = memberArray[i];
//			if(member.getId().equals(id) && member.getPassword().equals(password)) {
//				System.out.println(member.getName()+"님 인증되었습니다.");
//				System.out.println();
//				System.out.println("이체받을 아이디를 입력하세요.");
//				String transfer_id = sc.next();
//				
//				Member transforMember = findMember(transfer_id);
//				
//				if(transforMember == null) {
//					System.out.println("아이디가 존재하지 않습니다.");
//					return;
//				} else {
//					System.out.println("이체하실분의 성함이 "+ member.getName() + "님이 맞습니까?");
//					System.out.println("맞으면 Y, 아니면 N");
//					String yn = sc.next();
//					switch(yn) {
//						case "y" :
//						case "Y" :
//							System.out.println("이체하실 금액을 입력하세요. ");
//							System.out.print("이체금액 : ");
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
//					System.out.println("출금하실 금액을 입력해주세요. [수수료 500원]");
//				} else {
//					System.out.println("출금하실 금액을 입력해주세요. [수수료 300원]");
//				}
//				
//				System.out.print("출금액 : ");
//				long balance = sc.nextLong();
//				System.out.println("------------------------------------------------");
//				member.withdrawBalance(balance);
//				break;
//			} else {
//				System.out.println("------------------------------------------------");
//				System.out.println("입력된 정보가 올바르지 않습니다.");
//				break;
//			}
//		}
//	}
	
	
	// 등급 선택
	public void rankSelect(int rank) {
		if(rank == 1){
			String Rank1 = "일반회원";
			System.out.println("등급  : " + Rank1);
		} else {
			String Rank2 = "우수회원";
			System.out.println("등급  : " + Rank2);
		}
	}

	public static void main(String args[]) {
		BankSystem banksystem = new BankSystem();
		banksystem.choice();
	}
}
