package ConstructorConcept;

public class Driver {

	
	public static void main(String[] args) {
		
		/*ObjectConstructor obj =*/ ObjectConstructor.getInstance();;
		
		try {
			ObjectConstructor obj2 = ObjectConstructor.class.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
