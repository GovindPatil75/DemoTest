package Test1;

public class ABC implements Bank_B{

	public static void main(String[] args) {
		Bank_B c=new ABC();
		c.Test();
	}

	@Override
	public void Test() {
		System.out.println("Hello");
		
	}

	

}
