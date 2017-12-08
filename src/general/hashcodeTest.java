package general;

import java.util.HashMap;

public class hashcodeTest {
	
	
	
	public static void main(String []args){
	
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	
		
	for(int i = 0 ; i <1000/* Integer.MAX_VALUE*/ ; i++){
		hmap.put(java.util.UUID.randomUUID().toString(), i);
	}
		
	
	for(int i = 0 ; i< 3 ; i++){
		hmap.put(java.util.UUID.randomUUID().toString(), i);
	}
	
	
	}

	
	
}
