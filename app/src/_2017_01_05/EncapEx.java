package _2017_01_05;
/*
접근제어자(Modifiers)
	- 객체의 사용을 제어하기 위한 제어자
종류)
	- private, default(friendly), protected, public
	private : 정의 된 클래스 내에서만 쓰고 모든 외부 클래스의 접근을 제한한다.
	default : 다른 패키지에 소속 된 클래스의 접근을 제한한다.
	rpotected : 자식 클래스는 허용하고, 다른 패키지에 소속 된 클래스의 접근을 제한한다.
	public : 모두 허용 
형식)
	- 클래스 표현
		[접근지정자] class 클래스명
	- 메소드 표현
		[접근지정자][자료형] 메소드 명(인자들) {
		}
	- 변수 표현
		[접근지정자][자료형] 변수명 = 데이터;
	- 생성자 표현
		[접근지정자] 클래스 명(인자들) {
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
		int su1 = new Encap().a; // 전체 접근(공유)
		int su2 = new Encap().b; // 같은패키지, 상속
		int su3 = new Encap().c; // 같은패키지
		
		System.out.println(su1 + " " + su2 + " " +su3);
	}
}