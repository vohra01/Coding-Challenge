package kunal.Main;

class Abcdef extends Base{
	int a = 222;
	 
	 void a() {
			System.out.println("Default Method in ABCDEF " + super.a);
			super.a();
		}
	 
	 void c() {
			System.out.println("c Method in Abcdef");
		}
	 
	 public static void main(String[] args) {
		 Base b = new Abcdef();
		 //Abcdef v = new Base();			//Not Possible
		// Abcdef a = (Abcdef) new Base();	//Not Possible
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

		 Abcdef abcdef = new Abcdef();
		 System.out.println(abcdef.a);
		 abcdef.a();
		 abcdef.c();

		 Base base = new Base();
		 base.c();

	 }
}
