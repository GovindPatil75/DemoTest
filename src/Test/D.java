package Test;

public class D {

	  int a=20;
	final void m() {
		a=40;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
        D d=new D();
        d.m();
	}

}
