package learnearnUtility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrepareArticle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		EscapeSeqAdder espAdder = new EscapeSeqAdder();
		
		
	
		 BufferedReader reader = null;
	        try {

	                reader = new BufferedReader(
	                        new FileReader("C:\\Users\\iningosu\\Desktop\\LearnEarn\\pre_built_article.txt"));

	            // do reading, usually loop until end of file reading
	            String mLine; 
	            while ((mLine = reader.readLine()) != null) {
	            	espAdder.replaceAllEscapeSeq(mLine);
	              
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
