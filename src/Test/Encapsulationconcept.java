package Test;

public class Encapsulationconcept {

	// 1.variables----private
	//2.public getter and setter methods----> to  view and modify variables
	
	private int balance;    // data hiding
	
	private String name;
	
	private String id;
	
	public int getBalance() {
		//validation
		return balance;
		
	}
	
	public void setBalance(int money) {
		//validationif
		if(money>0) {
			this.balance=this.balance+money;
		}
		else {
			System.out.println("invalid amount");
		}
	}
	
	public static void main(String[] args) {
		Encapsulationconcept e=new Encapsulationconcept();
		e.setBalance(0);
		
		System.out.println(e.getBalance());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
