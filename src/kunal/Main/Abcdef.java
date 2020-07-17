package kunal.Main;

class Abcdef extends Base{
	 
	 void a() {
			System.out.println("Default Method in ABCDEF" + super.a);
			super.a();
		}
	 
	 void c() {
			System.out.println("c Method in ANCDEF");
		}
	 
	 public static void main(String args[]) {
		 Base b = new Abcdef();
//		 Abcdef v = new Base();
		// Abcdef a = (Abcdef) new Base();
		 //a.a();
		 System.out.println("1");
		 b.a();
		 //b.b();
		 System.out.println("2");
		 b.c();
		 Base g = new Base();
		 System.out.println("3");
		 g.c();
		 System.out.println("4");
	 }
}
