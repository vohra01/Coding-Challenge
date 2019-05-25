package kunal.Test;

class Abcdef extends Base{
	 
	 void a() {
			System.out.println("Default Method " + super.a);
			super.a();
		}
	 
	 void c() {
			System.out.println("c Method");
		}
	 
	 public static void main(String args[]) {
		 Base b = new Abcdef();
		// Abcdef a = (Abcdef) new Base(); 
		 //a.a();
		 b.a();
		 //b.b();
		 b.c();
	 }
}
