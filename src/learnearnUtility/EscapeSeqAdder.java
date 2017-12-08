package learnearnUtility;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscapeSeqAdder {
	
	
	public void replaceAllEscapeSeq(String data){
		
		String input = data/*.replaceAll("\"", "\"\"");*/ ;
		
		// replacing left and side single quote 
		input = input.replaceAll("&lsquo;", "\"");
		input = input.replaceAll("&rsquo;", "\"");
		
		//replacing left and side double quote 
		input = input.replaceAll("&ldquo;", "\"");
		input = input.replaceAll("&rdquo;", "\"");
		
		persistIntoFile(input);
		
	}
	
	
	
    private void persistIntoFile(String data){
 	   try{
 		    // Create file 
 		    FileWriter fstream = new FileWriter("C:\\Users\\iningosu\\Desktop\\LearnEarn\\payload_article.txt",true);
 		    
 		    BufferedWriter out = new BufferedWriter(fstream);
 		    out.write(data+"\n");
 		    //Close the output stream
 		    out.close();
 		    }catch (Exception e){//Catch exception if any
 		      System.err.println("Error: " + e.getMessage());
 		    }
 }

}
