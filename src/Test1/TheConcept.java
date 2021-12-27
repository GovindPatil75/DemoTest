package Test1;

public class TheConcept {
	void m() {
		System.out.println("1");
	}
	void m2() {
		this.m();// m()
		System.out.println("2");
	}

	public static void main(String[] args) {
		TheConcept c=new TheConcept();
		//c.m(); //1
		c.m2(); // 2

	}

}
