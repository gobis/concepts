package general;


//  You want to make any class as Immutable , then do following

    /*
    1. Declare class as final , so that it cant be inherited
    2. declare all fields are final & private , So that it can only be initialized in constructor not anywhere else
    3. Dont provide the setter method --> this is optional as we have declared all the fields as final & private 	
    */

final public class Immutable {

	final private int id ;
	final private String name;
	
	public Immutable(int ID,String NAME){
		id = ID;
		name = NAME;
	}

	
   /*	private void setter(int _id,String _name){
		id = _id;
		name = _name;

	}*/
	
	
	public int getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	
	
    public static void main(String []args){
    	String name = new String("Gobi");
    	Immutable  imm1 = new Immutable(5, name);
    	name = new String("Arun");
    	System.out.println(imm1.getName());
		
	}
	
	
}



