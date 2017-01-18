package _2017_01_18;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";

		//how1 : ��ü ��ū ���� ��� for������ ����
		StringTokenizer st = new StringTokenizer(text, "/");// �ǵڿ� true �� ���� /�� token�� ���� ��Ų��.
		int countTokens = st.countTokens();
		System.out.println(st.countTokens());
		
		for(int i = 0; i < countTokens; i++) {	// ���ǻ��� : st.countTokens()
			//int countTokens = st.countTokens(); �� ���� �ʰ� �ٷ� for���� st.countTokens() �� ���ٸ�,
			// for ���� �ѹ� �� ������ st.countTokens()�ȿ� �ִ� 5���� ��ū�� �ϳ��� ��ȯ �Ǿ� �������ϱ� 
			// �̼�ȫ���� token���� ���´ٸ� i = 3, st.countTokens() = 3 �� �Ǿ������.
			// ���� �̼�ȫ �ڿ� /�ڿ����� �Ⱥ���
			String token = st.nextToken();	
			System.out.println(token);
		}
		System.out.println(st.countTokens());
		System.out.println();
		
		// how2 : ���� �ִ� ��ū�� Ȯ���ϰ� while ������ ����
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
