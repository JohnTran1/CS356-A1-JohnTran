/* 
 * @author John Tran
 * CS356-01 Assignment 1
 * Due: 10/20/2014
*/

public class Question {

	private int aType; // answerType, 1 = true/false, 2 = multiple choice.
	private String qText; // the text of the question

	public Question(int aType, String qText) { //constructor
		this.aType = aType;
		this.qText = qText;
	}

	// accessor methods
	
	public String getQText() {
		return qText;
	}

	public void setQText(String qText) {
		this.qText = qText;
	}

	public int getAType() {
		return aType;
	}

	public void setAType(int aType) {
		this.aType = aType;
	}

}
