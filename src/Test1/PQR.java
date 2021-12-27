package Test1;

public class PQR {
	int a; // instance variable
	
	void Setprice(int a) {
		this.a=a;
	}
	void getprice() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PQR r=new PQR();
		r.Setprice(10);
		r.getprice();

	}

}
