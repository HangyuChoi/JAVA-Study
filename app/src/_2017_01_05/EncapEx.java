package _2017_01_05;
/*
����������(Modifiers)
	- ��ü�� ����� �����ϱ� ���� ������
����)
	- private, default(friendly), protected, public
	private : ���� �� Ŭ���� �������� ���� ��� �ܺ� Ŭ������ ������ �����Ѵ�.
	default : �ٸ� ��Ű���� �Ҽ� �� Ŭ������ ������ �����Ѵ�.
	rpotected : �ڽ� Ŭ������ ����ϰ�, �ٸ� ��Ű���� �Ҽ� �� Ŭ������ ������ �����Ѵ�.
	public : ��� ��� 
����)
	- Ŭ���� ǥ��
		[����������] class Ŭ������
	- �޼ҵ� ǥ��
		[����������][�ڷ���] �޼ҵ� ��(���ڵ�) {
		}
	- ���� ǥ��
		[����������][�ڷ���] ������ = ������;
	- ������ ǥ��
		[����������] Ŭ���� ��(���ڵ�) {
		}
*/

class Encap {
	public int a = 10;
	protected int b = 20;
	int c = 30;
	//private int d = 40;
}
public class EncapEx {

	public static void main(String[] args) {
		int su1 = new Encap().a; // ��ü ����(����)
		int su2 = new Encap().b; // ������Ű��, ���
		int su3 = new Encap().c; // ������Ű��
		
		System.out.println(su1 + " " + su2 + " " +su3);
	}
}