package Test;

public interface I1 {
	
  void show1() ;

}
class Test3 implements I1{

	@Override
	public void show1() {
		System.out.println("Hello");
		
	}
	public static void main(String[]args) {
		Test3 t=new Test3();
		t.show1();
	}
}