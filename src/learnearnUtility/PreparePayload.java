package learnearnUtility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PreparePayload {
	
	public static void main(String []args){
		
		boolean isHeader = false ;
		
		payloadCreation payloadCreation = new payloadCreation();
		payloadCreation.init();
		
		 BufferedReader reader = null;
	        try {

	                reader = new BufferedReader(
	                        new FileReader("C:\\Users\\iningosu\\Desktop\\LearnEarn\\pre_built_questions.txt"));

	            // do reading, usually loop until end of file reading
	            String mLine; 
	            while ((mLine = reader.readLine()) != null) {
	            	if(isHeader){
	            	payloadCreation.PrepareQuestionForJson(mLine);
	            	}else{
	            		isHeader = true ;
	            	}
	              
	            }
	        } catch (IOException e) {
	            System.err.println(e.toString());
	        }catch (Exception e) {
	        	System.err.println(e.toString());
			} finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e) {
	                    //log the exception
	                }
	            }
	        }

		
		
		
		
		
	}
	
	
	
	
	
	

}
