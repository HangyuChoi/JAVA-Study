package _2017_01_10;

public class InnerClassEx { // A class

	public String msg = "A";

	public void print() {	// 2
		BC bc = new BC();	
		bc.print();
	}

		public class BC {	// ���� Ŭ����
			public String msg = "B";

			public void print() {	// BC�� ���� print 3
				C c = new C();	// 3
				c.print();
			}

			public void aa(){
				System.out.println("aaaa");
			}
	       
				public class C {	
					public String msg = "C";

					public void print() {	// 4
						System.out.println(msg);
						System.out.println(this.msg);
						System.out.println(C.this.msg);
						System.out.println(BC.this.msg);
						System.out.println(InnerClassEx.this.msg);
						BC.this.aa();
						// BC.aa(); ��� ����
					}
				}
		}

	public static void main(String[] args) {
		InnerClassEx inner = new InnerClassEx();
		inner.print();	// 1
	}
}
