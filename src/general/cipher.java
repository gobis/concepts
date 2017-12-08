package general;

import java.nio.charset.StandardCharsets;

public class cipher {

	
	
	public static void main(String []args){
		
		
		 final byte[] keyBytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		 
		 String str = new String(keyBytes, StandardCharsets.UTF_8);
		 
		 System.out.println(str);
	}
}
