package _2017_01_18;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";

		//how1 : 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");// 맨뒤에 true 를 쓰면 /도 token에 포함 시킨다.
		int countTokens = st.countTokens();
		System.out.println(st.countTokens());
		
		for(int i = 0; i < countTokens; i++) {	// 주의사항 : st.countTokens()
			//int countTokens = st.countTokens(); 를 하지 않고 바로 for문에 st.countTokens() 를 쓴다면,
			// for 문이 한번 돌 때마다 st.countTokens()안에 있는 5개의 토큰중 하나씩 반환 되어 없어지니까 
			// 이수홍까지 token으로 나온다면 i = 3, st.countTokens() = 3 이 되어버린다.
			// 따라서 이수홍 뒤에 /박연수는 안보임
			String token = st.nextToken();	
			System.out.println(token);
		}
		System.out.println(st.countTokens());
		System.out.println();
		
		// how2 : 남아 있는 토큰을 확인하고 while 문으로 루핑
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
