package singleton;

public class MySingleton {
	
	
	static MySingleton sSingleton;
	
	private MySingleton(){
		
	}
	
	public static MySingleton getinstance(){
		
		if(null == sSingleton){
			sSingleton = new MySingleton();
		}
		
		return sSingleton;
	}
	
	

}
