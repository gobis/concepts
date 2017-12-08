package learnearnUtility;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class quizModel {

	@SerializedName("question")
	private String ques_text;

	@SerializedName("options")
	private ArrayList<String> options;

	@SerializedName("answers")
	private ArrayList<String> correctGivenAnswer;

	@SerializedName("quiz_Id")
	private long question_id;

	@SerializedName("category_id")
	private int categoryID;

	@SerializedName("subcategory_id")
	private int subCategoryID;

	public String getQues_text() {
		return ques_text;
	}

	public void setQues_text(String ques_text) {
		this.ques_text = ques_text;
	}

	public ArrayList<String> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}

	public ArrayList<String> getCorrectGivenAnswer() {
		return correctGivenAnswer;
	}

	public void setCorrectGivenAnswer(ArrayList<String> correctGivenAnswer) {
		this.correctGivenAnswer = correctGivenAnswer;
	}

	public long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(long question_id) {
		this.question_id = question_id;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public int getSubCategoryID() {
		return subCategoryID;
	}

	public void setSubCategoryID(int subCategoryID) {
		this.subCategoryID = subCategoryID;
	}
	
	
	
	

}
