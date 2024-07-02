package myHealthCareSystem;

/**
 * TODO:	Document me
 * @author Jawaa Chen
 * @version 1.0
 * @see 
 * @since 21.0.1
 * This class represents the Name of a person.
 */
public class Name {
	/*	TODO:	Implement this class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 */
	
	
	/*	Attributes			************************************/
	
	String first;
	String last;
	String middle;
	String salutation;
	
	
	/*	Constructors		************************************/
	/**
	 * The default no parameter constructor
	 */
	public Name() {
		
	}
	/**
	 * This constructor sets the first name as passed and last name as passed.
	 * @param first  The first name of this Name.
	 * @param last  The last name of this Name.
	 */
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	/**
	 * This constructor sets the first and last name based on the format of the name passed.
	 * @param name The name of this Name.
	 * 
	 */
	public Name(String name) {
		//TODO:
	}
	
	/**
	 * This constructor sets the first name as passed, middle name as passed
	 *  and last name as passed.
	 * @param first  The first name of this Name.
	 * @param last  The last name of this Name.
	 * @param middle  The middle name of this Name.
	 */
	public Name(String first, String last, String middle) {
		this.first = first;
		this.last = last;
		this.middle = middle;
	}
	/**
	 * Sets the first name for this Name.
	 * @param first this is the first name to set for Name.
	 */
	public void setFirst(String first) {
		this.first = first;
	}
	/**
	 * Sets the last name for this Name.
	 * @param last this is the last name to set for Name.
	 */
	public void setLast(String last) {
		this.last = last;
	}
	/**
	 * Sets the middle name for this Name.
	 * @param middle this is the middle name to set for Name.
	 */
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	/**
	 * Sets the salutation name for this Name.
	 * @param salutation this is the salutation name to set for Name.
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	/**
	 * Returns the first name for this Name.
	 * @return the first name for this Name.
	 */
	public String getFirst() {
		return first;
	}
	/**
	 * Returns the last name for this Name.
	 * @return the last name for this Name.
	 */
	public String getLast() {
		return last;
	}
	/**
	 * Returns the middle name for this Name.
	 * @return the middle name for this Name.
	 */
	public String getMiddle() {
		return middle;
	}
	/**
	 * Returns the salutation for this Name.
	 * @return the salutation for this Name.
	 */
	public String getSalutation() {
		return salutation;
	}
	
	
	/*	Accessors			************************************/

	
	
	
	/* Modifiers			************************************/

	
	
	
	/*	Normal Behavior	************************************/
	/**
	 * @return A formatted String representation of this Name, each field is
	 *         separated by a space in the format of a Name
	 */
	public String formattedName() {
		String s = String.format("%s %s %s %s", salutation, first, middle, last);
		return s;
	}
	
	/**
	 * Convert this class into a meaningful string.
	 * @return	This object as a string showing the class and each instance variable name and value pair
	 */
	public String toString() {
		String s = String.format("<%s>: [Salutation = %s, First = %s, Middle = %s, Last = %s]",
				this.getClass().getSimpleName(),salutation, first, middle, last);
		return s;
	}
	
	
	
	/*	Helper Methods		************************************/
	


}
