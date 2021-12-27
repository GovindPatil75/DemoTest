package Test;

public class MethodOverloading {
	
	//1.name of method same
	// 2.same class
	//3.method arguments ---diffrent----> sequnce,type,no of arguments
	
	void show(int a) {
		System.out.println("1");
	}
	void show(String b) {
		System.out.println("2");
	}

	public static void main(String[] args) {
		
		MethodOverloading a=new MethodOverloading();
		a.show(10);
		a.show("abc");
	}

}
