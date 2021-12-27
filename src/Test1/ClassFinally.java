package Test1;

public class ClassFinally {
	
		public static void main(String[] args) {
		
		
		try {
			// code
			int a=1/0; // Arthamatic 
			System.out.println("1");
		}catch(Exception e) {
			//
			System.out.println("2");
		}finally {
			System.out.println("3");
		}

	}

}
