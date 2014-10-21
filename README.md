CS356-A1-JohnTran
=================

IClicker-Simulator
CS356 Object­Oriented Design and Programming
Programming Assignment 1 ­ iClicker Simulator
Due Date
Wednesday, October 22, 2014
Score
60
Problem Description
In this programming assignment, you will build a Java­based simulation tool based the iClicker
idea we demonstrated during the class. This is going to be a pure desktop based console
program, without web interactions or graphical UIs.
The basic functions of the system include:
1) Configure the question types and candidate answers. It should support two types ­ both
multiple choices and single choice. For each type, you can configure the candidate
answers, such as “A”,“B”,“C”,“D”, or “1.Right”,“2.Wrong”, etc.
2) Allow students to submit answers. Every student has a unique ID(String), and can
submit an answer to the iClicker service.
3) The iClicker Service can be first configured with a given question type and candidate
answers. Then, it can start accepting submissions from students. The important thing to
keep in mind about accepting submissions is that each student can only submit one
answer. If multiple submissions are received from the same student, only the last
submission will be counted.
4) The iClicker Service can also output the statistics of the submission results. You don’t
have to use the graphical interface. Simply use the standard output (System.out) to print
out the count for each answer. For example, “A:5,B:12”, or “1.Right:15,
2.Wrong:20”. Feel free to choose the customized format for your output.
5) You need a SimulationDriverto automatically simulate the whole process. Basically,
the driver will 1) create a question type and configure the answers; 2) configure the
question for iClicker Service; 3) randomly generate a number students and the answers;
4) submit all the students’ answers to iClicker Service; 5) call the iClicker Service output
function to display the result.
You should write the program in Java, and follow the important Java OOP principles we have
learned so far. The core concepts (classes) you probably need to have are:1) Student
2) Question
3) IClickerService
4) SimulationDriver
Of course, other classes, subclasses or interfaces maybe needed depending on how you
design and implement the system.
SimulationDrivershould contain a main()method that triggers the whole process. You can
randomly generate the IDs and answers for a group of students to simulate the submission
process and checking the results.
This programming assignment is very open. For the details that are not clearly specified above,
feel free to make your own design decisions, but you should always clarify your decisions in your
code with comments. Also, you can email me to for any clarification about the requirements.
Submission Directions
Everyone should submit your assignment (checkin your code) through GitHub. You should use
your own GitHub account, and create a project repository for your own assignment. To submit
your assignment, simply send me an email with your project repository link, and I will go to your
repository to check your changes and commits.
Getting Help
Please let me know if you need to meet to discuss any problems that you may have.
