package _2017_01_19;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args) {
		// 기본 타입 값 검색
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);	// 내림차순 정렬
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인텍스 : " + index);
		
		// 문자열 검색
		String[] names = { "홍길동", "박동수", "김민수"};
		Arrays.sort(names);	// ㄱ ㄴ ㄷ 순으로 정렬
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인텍스 : " + index);
		
		// 객체 검색 - package : _2017_01_19 내에 있는 Search_User 클래스 참조
		Search_User u1 = new Search_User("홍길동");
		Search_User u2 = new Search_User("박동수");
		Search_User u3 = new Search_User("김민수");
		
		Search_User u4 = new Search_User("a");
		Search_User u5 = new Search_User("a");
		Search_User[] users = { u1, u2, u3 };
		Arrays.sort(users);
		index = Arrays.binarySearch(users, u1);
		System.out.println("찾은 인텍스 : " + index);
		System.out.println();
		// 0 이 나오면 둘의 문자가 같다 true
		System.out.println(u4.compareTo(u5));	// 문자열을 정수로 변환하여 비교한다.
		System.out.println();
		System.out.println(u1.compareTo(u2));
		System.out.println(((int)u1.id.charAt(0)) - ((int)u2.id.charAt(0))); // compareTo를 풀어쓴거
	}

}
