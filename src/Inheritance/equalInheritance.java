package Inheritance;

public class equalInheritance {

	
	public static void main(String []args){
		
		derived obj = new derived();
		obj.testprint();
		
		Parent p1 = new Parent(2);
		Parent p2 = new Parent(5);
		p1.equals(p2);
		
	}
	
}



class Parent{
	
	public int id ;
	
	public Parent(int _id){
		id = _id;
	}

	public boolean equals(Parent other) {
		System.out.println("Parent equals called");
		boolean result = false;
	    if (other instanceof Parent) {
	    	Parent that = (Parent) other;
	        result = (this.id == that.id);
	    }
	    return result;
	}
	
	
	 @Override
	public boolean equals(Object other) {
		System.out.println("Object equals called");
		boolean result = false;
	    if (other instanceof Parent) {
	    	Parent that = (Parent) other;
	        result = (this.id == that.id);
	    }
	    return result;
	}
}

