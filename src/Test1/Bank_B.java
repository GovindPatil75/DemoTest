package Test1;

public interface Bank_B {
	
	//methods---> abstract---> implementation no
	void Test();//----byfault public abstract
	
     int c=50;  // Byfault--> public static final
     
     //jdk8 ---->
     default void Out() {
    	 System.out.println("1");
     }
     
     static void Out1() {
    	 System.out.println("2");
     }
    private void Out2() {
    	 System.out.println("3");
     }
}
