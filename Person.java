package edu.saintjoe.cmullis;

/** A Person has an age and a weight, and can report their info
*
* Collin Mullis
* 
* January 22, 2016
*
*/
public class Person {
	private int studID; 		// Student ID
	private String name;	// Student Name

	public Person(int newID, String newName) {
	   studID = newID;
	   name = newName;
	} // Person(newID, newName)

	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/** Returns a string containing instance properties */
	public String toString() {
		return( "My student ID is: " + studID +
				"\nMy name is: " + name );
	} // toString()

} // end of Person class

