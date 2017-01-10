package _2017_01_06;


// Bì— ëŒ€í•œ superclass 
class C {
	public C() {
		// ì—¬ê¸°ëŠ” ìƒì†êµ¬ì¡°ê°€ ì—†ê¸°ì— super(); ê°€ ì—†ë‹¤.
		System.out.println("Constructor C");
	}
	int num = 10;
	String msg = "msg...";
	public void method() {
		System.out.println("Method " + num);
	}
	public void method_C() {
		System.out.println("Method_C " + msg);
	}
}

// Cì— ëŒ€í•œ subclass B
// Aì— ëŒ€í•œ superclass 
class B extends C {
	public B() {
		//super();
		System.out.println("Constructor B");
	}
	int num = 50;
	
	public void method() {
		super.method_C();
		this.method_C();
		System.out.println("method " + num);
	}
	public void method_B() {
		System.out.println("Method_B " + msg);
	}
}

// Bì— ëŒ€í•œ subclass A
class A extends B {
	public A() {
		// ì—¬ê¸°ì—ëŠ” super(); ê°€ ìˆ¨ê²¨ì ¸ ìˆë‹¤. ì€ë‹‰
		//super().super();  ë‘ë²ˆ ì—°ì†í•´ì„œ ì“¸ ìˆ˜ ì—†ë‹¤. super ë‘ this ì•ˆë¨
		System.out.println("Constructor A");
	}
	public void method() {	// A,B,C ëª¨ë‘ method() ê°€ ìˆë‹¤. ì˜¤ë²„ë¼ì´ë“œë¥¼ í†µí•´ C B A ìˆœìœ¼ë¡œ ì¬ì •ì˜ ëœë‹¤.
		//System.out.println("method " + super.super.num);
		super.method();
	}
	public void method_A() {
		System.out.println("Method_A " + msg);
	}
}

public class InherEx2 {
	public static void main(String args[]) {
<<<<<<< HEAD
		A a = new A();	// A Å¬·¡½º °´Ã¼ »ı¼º
		B b = a;		// ÀÚµ¿ Çü º¯È¯, ÀÚ½Ä -> ºÎ¸ğ
		C c = b;		// ÀÚµ¿ Çü º¯È¯, ÀÚ½Ä -> ºÎ¸ğ
		a.method();		// ÀçÁ¤ÀÇ µÈ A ÀÇ method(); ½ÇÇà   ÇÑ¹ø ÀçÁ¤ÀÇ°¡ ÀÏ¾î³ª¸é ¿ø·¡ÀÇ ±â´ÉÀ¸·Î µ¹¾Æ°¥ ¼ö¾ø´Ù.
//						// µû¶ó¼­ b.method(); ³ª c.method(); ¸¦ ÇØµµ AÀÇ method(); °¡ ½ÇÇà
//						// ÇÏÁö¸¸ super. À¸·Î Á¢±ÙÇÏ¸é ¾µ ¼ö ÀÖ´Ù. ( °´Ã¼·Î½á )
//		a.method_A();
//		a.method_B();	// »ó¼Ó¹ŞÀº BÀÇ ¸Ş¼Òµå¿¡ Á¢±ÙÇÒ ¼ö ÀÖ´Ù.
//		a.method_C();	// »ó¼Ó¹ŞÀº BÀÇ ¸Ş¼Òµå¿¡ Á¢±ÙÇÒ ¼ö ÀÖ´Ù.
//		System.out.println(a.num);	// numÀÇ °æ¿ì È£ÃâÇÑ a ¿Í °¡±î¿î °É ¾´´Ù. ¸Ö¸®ÀÖ´Â cÀÇ numÀº Àº´ĞµÈ´Ù.
		
=======
		A a = new A();	// A í´ë˜ìŠ¤ ê°ì²´ ìƒì„±
		B b = a;		// ìë™ í˜• ë³€í™˜, ìì‹ -> ë¶€ëª¨
		C c = b;		// ìë™ í˜• ë³€í™˜, ìì‹ -> ë¶€ëª¨
		a.method();		// ì¬ì •ì˜ ëœ A ì˜ method(); ì‹¤í–‰   í•œë²ˆ ì¬ì •ì˜ê°€ ì¼ì–´ë‚˜ë©´ ì›ë˜ì˜ ê¸°ëŠ¥ìœ¼ë¡œ ëŒì•„ê°ˆ ìˆ˜ì—†ë‹¤.
						// ë”°ë¼ì„œ b.method(); ë‚˜ c.method(); ë¥¼ í•´ë„ Aì˜ method(); ê°€ ì‹¤í–‰
						// í•˜ì§€ë§Œ super. ìœ¼ë¡œ ì ‘ê·¼í•˜ë©´ ì“¸ ìˆ˜ ìˆë‹¤. ( ê°ì²´ë¡œì¨ )
		a.method_A();
		a.method_B();	// ìƒì†ë°›ì€ Bì˜ ë©”ì†Œë“œì— ì ‘ê·¼í•  ìˆ˜ ìˆë‹¤.
		a.method_C();	// ìƒì†ë°›ì€ Cì˜ ë©”ì†Œë“œì— ì ‘ê·¼í•  ìˆ˜ ìˆë‹¤.
		System.out.println(a.num);	// numì˜ ê²½ìš° í˜¸ì¶œí•œ a ì™€ ê°€ê¹Œìš´ ê±¸ ì“´ë‹¤. ë©€ë¦¬ìˆëŠ” cì˜ numì€ ì€ë‹‰ëœë‹¤.
>>>>>>> origin/master
	}
}
