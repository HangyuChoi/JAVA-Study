package _2017_01_06;

/*
 * ���(inheritance)
  - ����̶� �ڽ��� �θ� ������ �ִ� ����̳� �Ƿ��� �����޴´ٴ� �ǹ�.
  - Ư��(�ڽ�) Ŭ������ �ٸ�(�θ�) Ŭ������ ������ �ִ� ��� ��������� ����޼ҵ带 ����� �� ����.
  - ��� ���迡�� �ڽ�Ŭ������ ��ü�� ���� �Ͽ��� �� �θ� Ŭ������ ��ü�� �����Ǿ� ��.
  - ��� ���� ǥ������ extends keyword�� �����.
  - ��� ���� ���� super, ����, �θ� class �� sub, ����, �ڽ� class�� ��� ��.
  - ����� ���信�� super�� this�� ������.
  - �޼��带 ���� �� �� ����. ( method override)
  - ���� ���(�ڹٿ����� ���� ���x)
  - extends �� implements�� �԰� ����� �� ����.
  
  ����)
  class A extends B {
  	���屸��;
  }
 */

// �����ε带 ���� ������ 
// ex) �ڵ����� ���ε�� �ڵ������� Ŭ������ ǥ���� ��, �� ������ ���� ��ǰ�� �������ְ�, �ٸ� ��ǰ�� �� ���� �ִµ�,
// Ÿ�̾ ���ε�� �����ε带 ����Ͽ�, ���� ��ǰ�� �״�� ��ӹ޾� ���ų�, �ٸ���ǰ�� ���� ��ǰ�� ������ ���� ����� �ȴ�. �׷��� �����ε带 ��.

// ��� ���
public class InherEx extends SuperClass {	// extends SuperClass �� ���� SuperClass �� �ִ°� ����ó�� ����.
	//������
	int age = 1;
	int age2;
	public InherEx() {
		super(); // �̰� ������ �ִ�.  <- super �� �������� �ֻ�ܿ� ��ġ �ؾ��Ѵ�.
		System.out.println("subClass " + this.age);	// ��ӵ� ���¿��� this.��ü��Ҵ� ����� �������� ã�� ������ �θ� ���
		System.out.println("subClass " + super.age);
	}
	
	public InherEx(int age) {
		System.out.println("subClass2");
	}
	
	public void methodA() {
		System.out.println("methodA");
	}
	
	public static void main(String[] args) {
		InherEx inder = new InherEx(); // �ܺ� SuperClass ���
		//SuperClass sc = new SuperClass();
		System.out.println("age : " +inder.age);	// ���к�����. inder.age�� �θ��� age�� ������ �� age�� ��.
		System.out.println("name : " +inder.name);
		
		//4) �������̵� ���
		//sc.methodA();
		inder.methodA();
		
		
		// ����ȯ�� ���  �⺻Ÿ���� ����ȯ�� ������ �ս��� ���� �� �ֱ� ������ �� �Ⱦ�����, !! ��üŸ�Կ����� ������ �ս��� ���� ������ ���� ���� ����.
		// �� ��ȯ	// ��Ӱ��迡 ���� ���� �����ϴ�.
		SuperClass supercalss = inder;	// �ڽ� Ÿ�Կ��� ū Ÿ������ �ڵ����� �� ��ȯ.
		//System.out.println(supercalss.age2); // �θ�Ÿ������ ��ȯ �� ���� �ִµ� age2�� �θ� ���� ������ �� ������.
		
		// ���� �� ��Ȳ ( ����� �� ��ȯ )
		InherEx inder2 = (InherEx) supercalss;	// �׷��� �θ�Ÿ������ ���� age2 �� ���� ���ؼ��� �ٽ� �ڽ� Ÿ������ ����� �� ��ȯ�� �ʿ��ϴ�.
		System.out.println(inder2.age);	// ������ �θ�Ÿ���̳�.. �׷� �ٽ� �� Ÿ���� �ٲ㼭 �о��¡¡��
		
		// super() ���
		// this() ���
		// super.��ü���
		// this.��ü���
		
		/*
		 	1) �� ��ȯ
		 	2) ĳ����
		 	3) Object �� ��ȯ
		 	4) �������̵� ���
		 	5) ���к��� ���
		 */
	}
}
class SuperClass {
	int age;
	String name;
	
	public void methodB() {
		System.out.println("methodA");
	}
	
	public SuperClass() {	// SuperClass �ʱ�ȭ
		System.out.println("superClass");
		age = 10;
		name = "ȫ�浿";
	}
}	// ���� ���� : SuperClass -> ������ -> main�޼ҵ�


// ���� ��

/*public class IngerEx extends SuperClass {
	public static void main(String[] args) {
		SuperClass superclass = new SuperClass(); // �ܺ� SuperClass ����
		System.out.println("age : " +superclass.age);
		System.out.println("name : " +superclass.name);
	}
}

class SuperClass {
	int age;
	String name;
	
	public SuperClass() {	// SuperClass �ʱ�ȭ
		age = 10;
		name = "ȫ�浿";
	}
}*/