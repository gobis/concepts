package learnearnUtility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.google.gson.Gson;

public class payloadCreation {
	
	
	
	  /**
     * preparing the question
     * @param line contains question and related info in comma separated format
     */
    public void PrepareQuestionForJson(String line){
    	
    	quizModel quizModel = new quizModel();

        StringTokenizer tokenizer = new StringTokenizer(line,"|");

        // line should not be empty

        if(tokenizer.hasMoreElements()){

            int q_id = -1 ;

            try {
                q_id = Integer.parseInt(tokenizer.nextToken());
            }catch (NumberFormatException nfe){

            }

            if(q_id != -1) {

              
                 int cat_ID = Integer.parseInt(tokenizer.nextToken());
                 int subCat_ID = Integer.parseInt(tokenizer.nextToken());
                 
                 quizModel.setCategoryID(cat_ID);
                 quizModel.setSubCategoryID(subCat_ID);
                 
                 
                 String question = tokenizer.nextToken() ; 
                 quizModel.setQues_text(question);
                 
                 int numberOfOptions = Integer.parseInt(tokenizer.nextToken());
                 
                 
                 ArrayList<String> optionsList = new ArrayList<String>();
                 
                 
                 for (int i = 0; i < numberOfOptions; i++) {
                	 optionsList.add(tokenizer.nextToken().trim());
                 }
                 
                 quizModel.setOptions(optionsList);
                 
                
                
                 
                 int numberOfCorrectOptions = Integer.parseInt(tokenizer.nextToken());
                 
                 ArrayList<String> answerList = new ArrayList<String>();
                 
                 for (int i = 0; i < numberOfCorrectOptions; i++) {
                	 answerList.add(tokenizer.nextToken().trim());
                 }
                 quizModel.setCorrectGivenAnswer(answerList);

            }

        }
        
        // convert object to json 
        String jsonData = gson.toJson(quizModel);
        System.out.println(" Json data is " + jsonData);
        
        persistIntoFile(jsonData);
        

    }

    
    Gson gson ;
    public void init(){
    	gson = new Gson();
    }
    
    
    private void persistIntoFile(String data){
    	   try{
    		    // Create file 
    		    FileWriter fstream = new FileWriter("C:\\Users\\iningosu\\Desktop\\LearnEarn\\payload.txt",true);
    		    
    		    BufferedWriter out = new BufferedWriter(fstream);
    		    out.write(data+"\n");
    		    //Close the output stream
    		    out.close();
    		    }catch (Exception e){//Catch exception if any
    		      System.err.println("Error: " + e.getMessage());
    		    }
    }
    


}
