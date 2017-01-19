package _2017_01_19;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args) {
		// �⺻ Ÿ�� �� �˻�
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);	// �������� ����
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� ���ؽ� : " + index);
		
		// ���ڿ� �˻�
		String[] names = { "ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);	// �� �� �� ������ ����
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� ���ؽ� : " + index);
		
		// ��ü �˻� - package : _2017_01_19 ���� �ִ� Search_User Ŭ���� ����
		Search_User u1 = new Search_User("ȫ�浿");
		Search_User u2 = new Search_User("�ڵ���");
		Search_User u3 = new Search_User("��μ�");
		
		Search_User u4 = new Search_User("a");
		Search_User u5 = new Search_User("a");
		Search_User[] users = { u1, u2, u3 };
		Arrays.sort(users);
		index = Arrays.binarySearch(users, u1);
		System.out.println("ã�� ���ؽ� : " + index);
		System.out.println();
		// 0 �� ������ ���� ���ڰ� ���� true
		System.out.println(u4.compareTo(u5));	// ���ڿ��� ������ ��ȯ�Ͽ� ���Ѵ�.
		System.out.println();
		System.out.println(u1.compareTo(u2));
		System.out.println(((int)u1.id.charAt(0)) - ((int)u2.id.charAt(0))); // compareTo�� Ǯ���
	}

}
