package _2017_01_03;
import java.util.Scanner;

public class ArrayEx1 {
	/*
	 * �迭 Array 
	 	- ���� �ڷ����� �����͸� ���� �� �����ϱ� ���� �޸� ������ ����.
	 	- ������ �޸� ������ index�� �̿��Ͽ� �� �����Ҹ� ������.
	 	- �迭ũ��� length�� ����Ͽ� ����.
	 	
	   ǥ��)
	 	- int[] arr = new int[n]; // n�� ��ŭ 0���� �ʱ�ȭ.  ���Ŀ� �ݵ�� �����͸� �־�����Ѵ�. ex) arr[0] = 1; arr[1] = 2; arr[2] = 3;
	 	- int[] arr = {1, 2, 3};  // �迭�� �ʱ�ȭ�԰� ���ÿ� ���� �ִ´�.
	 	  // int ���� 3���� ����� ���� �Ͱ� ���� �ϱ� ������ �迭 ���� �����ʹ� �ٲ� ���ִ�.
	 	
	 	- int[] arr = new int[]{1, 2, 3}; // �� �Ⱦ���. ���� �ΰ� ��ģ�� ��� ����
	 	
	 	// ����� Ÿ�԰� �´� �����͸� ���� �� �ִ�.
	 	 * �ʱ⿡ ����� �迭�� ũ��� �ٲ� �� ����.
	 	���ڿ��� ��üŸ��
	 	String a;	// a = null
		a = "A";	// a(stack) = "A"(heap)
	 */
	
	/*Scanner scan;
	public static void main(String args[]){
		new ArrayEx1().scan.next();*/
	// ��Ÿ�� �μ��� ( �� ������ �μ��� ) 'scan�� ������' �ٵ� �װ� null �̶󼭰�üŸ�Կ����� �� ������ �μ��� ��
	
	public static void main(String args[]){
	/* 1���� �迭------------------------*/
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		// int arr[] = {1,2,3};    = 1, 2, 3
		// int arr[] = new int[]{1,2,3}; // = 1, 2, 3
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2] + "\n");  // = 1, 2, 3
		
		arr[1] = 20;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2] + "\n");  // = 1, 20, 3
		
		String[] str = new String[3];
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2] + "\n");
		
		int arr2[] = {10, 20 ,30};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2] + "\n");  // = 10, 20, 30
		
		arr2[2] = 100;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2] + "\n");  // = 10, 20, 100
	}
}





















