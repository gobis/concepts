package String;

import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.lang.*;
import java.nio.charset.Charset;

public class StringConcepts {

	
	
	public static void main(String []args){
		
			
		String s1 = "Hi";
		String s2 = "Hello";
		s1 = s1 +s2;
		
		
//		System.out.println(s1);
		
		String str = "49E1009BB3D13F90033433E548FF2D40";
		
		byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
		
		decryptData(bytes);
	}
	
	
	
	
	  private static byte[] decryptData(byte[] decrypted_responseBytes) {
	        byte[] responseBytes = null;
	        final byte[] keyBytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	        try {
	          /*  ArrayList<String> parsedData = new ArrayList<String>();
	            parsedData = Helper.getInstance().deserializeMessage(decrypted_responseBytes);*/
	            SecretKey ks = new SecretKeySpec(keyBytes, "AES");
	            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
	            cipher.init(Cipher.DECRYPT_MODE, ks);
	            cipher.update(decrypted_responseBytes);
	            responseBytes = cipher.doFinal(decrypted_responseBytes /*Base64.decode(decrypted_responseBytes, Base64.DEFAULT)*/);
	        } catch (Exception ex) {
	        	System.out.println(responseBytes);
	        }finally {
	        	System.out.println(responseBytes);
			}
	        return responseBytes;
	    }
	  
	  public static String byteArrayToHex(byte[] a) {
	        StringBuilder sb = new StringBuilder();
	        for (byte b : a)
	            sb.append(String.format("%02x ", b & 0xff));

	        return sb.toString();
	    }
	
	
}
