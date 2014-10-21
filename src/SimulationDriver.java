/* 
 * @author John Tran
 * CS356-01 Assignment 1
 * Due: 10/20/2014
 */

import java.util.Random;

public class SimulationDriver {

	public static void main(String[] args) {

		// create questions for testing
		createSimulation(1, "Java is an Object-oriented programming language.");
		createSimulation(2, "Which are NOT features of OOP?");
		createSimulation(1, "OCP stands for the Open-Closed principle");
	}

	public static void createSimulation(int aType, String qText) {

		// method for simulating a question and its answers

		Random rand = new Random();
		int randomStudentCount = rand.nextInt(50) + 10; // between 10 and 60
														// students to generate
		System.out.println("*****************************************");
		System.out.println("[QUESTION]**" + qText + "**\n");

		boolean[] answerSubmit = { false, false, false, false }; // initialize
																	// to blank

		Question temp = new Question(aType, qText);
		IClickerService ics = new IClickerService(temp);

		for (int i = 0; i < randomStudentCount; i++) {
			Student generatedStudent = new Student(rand.nextInt(150) + ""); // random
																			// uniqueID

			if (temp.getAType() == 1) {
				answerSubmit[rand.nextInt(2)] = true; // simulate a random
														// answer
			} else
				for (int j = 0; j < 4; j++) {
					answerSubmit[j] = (rand.nextInt(2) != 0); // simulate random
																// answer(s) for
																// multiple
																// choice
				}

			ics.addAnswer(generatedStudent.getUniqueID(), answerSubmit); // add the answer
			for (int k = 0; k < 4; k++) { // reset answers for next student
				answerSubmit[k] = false;
			}
		}
		ics.printAnswerTable();
		System.out.println("Total answer submissions: " + randomStudentCount);
		System.out.println();

	}
}
