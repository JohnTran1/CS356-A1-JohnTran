/* 
 * @author John Tran
 * CS356-01 Assignment 1
 * Due: 10/20/2014
*/

public class Student {

	private String uniqueID; //to distinguish between students
	private String name; // students name (not used in this project)

	public Student(String ID, String name) { // constructor
		this.setUniqueID(ID);
		this.setName(name);
	}

	public Student(String ID) { // constructor
		this.setUniqueID(ID);
	}

	// accessor methods

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
