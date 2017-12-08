package WrapperClassConcept;



public class Inhertitance {

	public static void main(String []args){
		
		A obj = new B();
		 // this function will call primitive type first , in case Primitive type missing then it will call Object (Auto Boxing)
		obj.getExample(5); 
		
		obj.getExample(new Integer(5));
		
	}
	
	
}

class A{

	// this is valid function overloading 
	// same function has input param of primitive and wrapper class
	
	public void getExample(Integer i){
		System.out.println("Class A :Object Value" + i);
	}
	
	public void getExample(int i){
		System.out.println("Class A :Primitive Value" + i);
	} 
	
};

class B extends A{
	
	public void getExample(int i){
		System.out.println("Class B :Primitive Value" + i);
	}
	
};




