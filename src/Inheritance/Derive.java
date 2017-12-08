package Inheritance;

public class Derive extends Base{
	
	public void myMethod(){
		System.out.println("Child class");
	}
	
	public Derive(String input ){
		System.out.println("Derive Overloaded Constructor");
	}
	
	public Derive(){
		System.out.println("Derive Constructor");
	}

}
