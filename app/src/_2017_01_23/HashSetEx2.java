package _2017_01_23;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
		// 총 객체수 : 1   ,  이유 : 객체가 두개로 만들어 지지만, HashSet의 특성으로 Member class 의 equals()와 hashCode()를 오버라이드 해서 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장 ( 중복 배제 )
	}
}
