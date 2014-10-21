/* 
 * @author John Tran
 * CS356-01 Assignment 1
 * Due: 10/20/2014
 */

import java.util.Hashtable;

public class IClickerService {

	private Question theQuestion;
	// Hashtable using student's uniqueID as key and their answers as a value.
	// values are a boolean array to handle multiple choice selection.
	private Hashtable<String, boolean[]> answerTable = new Hashtable<String, boolean[]>();
	private int[] answerCount = { 0, 0, 0, 0 }; // counter for answers

	public IClickerService(Question question) { // constructor
		this.theQuestion = question;
	}

	public void addAnswer(String student, boolean[] submittedAnswers) {

		for (int i = 0; i < 4; i++) { // increment counter with newly submitted
										// answers
			if (submittedAnswers[i])
				answerCount[i]++;
		}

		if (answerTable.containsKey(student)) { // if the student already has
												// answers for this question in
												// the system, remove
												// them from the counter
			boolean[] prevAnswer = answerTable.get(student);

			for (int i = 0; i < 4; i++) {
				if (prevAnswer[i])
					answerCount[i]--;
			}

			answerTable.put(student, submittedAnswers); // submit the new
														// answers

			System.out.println("UniqueID:"
					+ student // display notification that answer has been
								// updated
					+ " updated their answer submission to "
					+ ansString(submittedAnswers, theQuestion.getAType()));
		} else {

			answerTable.put(student, submittedAnswers); // submit answers for
														// the first time

			System.out.println("UniqueID:" + student + " selected " // notification
					+ ansString(submittedAnswers, theQuestion.getAType()));
		}
	}

	private String ansString(boolean[] submittedAnswers, int aType) {
		// print letters or True/False depending on answerType

		String temp = "";

		if (aType == 2) {
			if (submittedAnswers[0]) {
				temp += "A";
			}
			if (submittedAnswers[1]) {
				temp += "B";
			}
			if (submittedAnswers[2]) {
				temp += "C";
			}
			if (submittedAnswers[3]) {
				temp += "D";
			}
		} else {
			if (submittedAnswers[0]) {
				temp += "True";
			}
			if (submittedAnswers[1]) {
				temp += "False";
			}
		}

		if (temp == "") {
			return "[blank]"; // student did not submit any answer or did not
								// complete the problem
		}
		return temp;
	}

	public void printAnswerTable() { // print answer results visually
		System.out.println();
		if (theQuestion.getAType() == 1) {
			System.out.print("True:  ");
			for (int i = 0; i < answerCount[0]; i++) {
				System.out.print("[]");
			}
			System.out.println(" " + answerCount[0]);

			System.out.print("False: ");
			for (int i = 0; i < answerCount[1]; i++) {
				System.out.print("[]");
			}
			System.out.println(" " + answerCount[1]);

		} else {
			System.out.print("A: ");
			for (int i = 0; i < answerCount[0]; i++) {
				System.out.print("[]");
			}
			System.out.println(" " + answerCount[0]);
			System.out.print("B: ");
			for (int i = 0; i < answerCount[1]; i++) {
				System.out.print("[]");
			}
			System.out.println(" " + answerCount[1]);
			System.out.print("C: ");
			for (int i = 0; i < answerCount[2]; i++) {
				System.out.print("[]");
			}
			System.out.println(" " + answerCount[2]);
			System.out.print("D: ");
			for (int i = 0; i < answerCount[3]; i++) {
				System.out.print("[]");
			}
			System.out.println(" " + answerCount[3]);
		}

	}
}
