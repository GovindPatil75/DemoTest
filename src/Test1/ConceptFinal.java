package Test1;

public class ConceptFinal {
	
	//Access modifier/Keyword--Restriction apply-->class,Methods,Variables
	
	//final class--> inherit No
	// final variables----> value no modify 
	// final method()-----> NO override 
	     final int a=10; // variables
	 public final void D() {
		// a=30;
		System.out.println(a);
	 }

	public static void main(String[] args) {
		ConceptFinal y=new ConceptFinal();
		y.D();
		

	}

}
