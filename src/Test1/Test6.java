package Test1;

public class Test6 extends Test5{

	int a=30;
	void d() {
		super.d();
		System.out.println("d2");
	}
	void t() {
		
		System.out.println(super.a); // 10
	}
	public static void main(String[] args) {
		Test6 b=new Test6();
		System.out.println(b.a);
		b.t();
		b.d(); 
		

	}

}
