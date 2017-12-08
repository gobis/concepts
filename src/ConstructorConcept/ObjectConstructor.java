package ConstructorConcept;

public class ObjectConstructor {

	
	
	private ObjectConstructor(){
		System.out.println("cons invoked");
	}
	
	
	public static void getInstance(){
		new ObjectConstructor();
	}
	
	
}
