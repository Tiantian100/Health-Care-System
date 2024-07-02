package myHealthCareSystem;


/*
 * 	W24	CST8284
 * 	Assignment 1: My Health System
 * 
 *		This is the start of a system which would maintain Electronic Medical Records for patients.
 *		This class assumes all values passed to the set methods are correct and valid.
 *		REVIEW THIS FILE, ASSIGNMENT INSTRUCTIONS, UML Class Diagram CAREFULLY BEFORE YOU START CODING!
 *
 * 	Remove unneeded comments/code when you are done. (Clean code is better code).
 * 
 * 	Field values and constraints can be found in the Standards guide
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024)
 * 
 */

/**
 * TODO:	Document me
 * @author Jawaa Chen
 * @version 1.0
 * @see 
 * @since 21.0.1
 * This class represents the EMRecord of a person.
 */
public class EMRecord extends EMHRecord		{
	/*	TODO:	Implement the class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 */

	
	/*	Attributes			************************************/
	int height;
	int weight;
	Name name;
	Address address;
	
	/*	Constructors		************************************/
	
	/**
	 * This constructor sets the reportingFacilityProvince as passed, institutionNumber as passed, 
	 * chartNumber as passed, and healthCareNumber as passed.
	 * @param reportingFacilityProvince  The reportingFacilityProvince of this Record.
	 * @param institutionNumber  The institutionNumber of this Record.
	 * @param chartNumber    The chartNumber of this Record.
	 * @param healthCareNumber The healthCareNumber of this Record.
	 */
	public EMRecord (String reportingFacilityProvince, String institutionNumber, String chartNumber, String healthCareNumber) {
		super(reportingFacilityProvince, institutionNumber, chartNumber, healthCareNumber);
		
	}


	
	
	/*	Accessors			************************************/


	/**
	 * Sets the height for this Record.
	 * @param height this is the height to set for Record.
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * Sets the weight for this Record.
	 * @param weight this is the weight to set for Record.
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/**
	 * Returns the height for this Record.
	 * @return the height for this Record.
	 */	
	public int getHeight() {
		return height;
	}
	/**
	 * Returns the weight for this Record.
	 * @return the weight for this Record.
	 */	
	public int getWeight() {
		return weight;
	}
	/**
	 * Returns the name for this Record.
	 * @return the name for this Record.
	 */	
	public Name getName() {
		return name;
	}
	
	/**
	 * Sets the name for this Record.
	 * @param name this is the name to set for Record.
	 */
	public void setName(Name name) {
		this.name = name;
	}
	/**
	 * Returns the address for this Record.
	 * @return the address for this Record.
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * Sets the address for this Record.
	 * @param address this is the address to set for Record.
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


	/* Modifiers			************************************/

	
	
	
	/*	Normal Behavior	************************************/
	/**
	 * @return a formatted String representation of the Name for this Record.
	 */
	public String formattedName() {
		return name.formattedName();
	}
	/**
	 * @return a formatted String representation of the Address for this Record.
	 */
	public String formattedAddress() {
		return address.formattedAddress();
		
	}
	
	/**
	 * Convert this class into a meaningful string.
	 * @return	This object as a string showing the class and each instance variable name formatted like an address
	 */
	public String toString() {
		String s = String.format("<%s>:\n Height = %s\n Weight = %s\n Name = %s\n Address = %s\n\n %s", 
				this.getClass().getName(), height, weight, name, address, super.toString() );
		return s;
	}
	
	/**
	 * Calculates and returns the BMI for this Record based on the weight and height
	 * @return	the BMI for this Record
	 */
	public int bmi() {
		return (int) MedicalCalculator.calculateBMI(weight,height);
	}
	
	/*	Helper Methods		************************************/
	

    
}