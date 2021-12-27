package Test;

public class Test extends AbstractTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractTest t=new Test();
		
		t.run();
		t.show();

	}

	@Override
	void show() {
		System.out.println("Hello");
		
	}

}
