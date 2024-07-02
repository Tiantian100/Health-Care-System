package myHealthCareSystem;

/**
 * TODO:	Document me
 * @author Jawaa Chen
 * @version 1.0
 * @see 
 * @since 21.0.1
 * This class represents the Address for a person.
 */
public class Address {
	/*	TODO:	Implement the class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 * 
	 * 
	 */

	
	/*	Attributes			************************************/
	
	String street;
	String number; 
	String city;
	String country;
	String postalCode;
	
	
	/*	Constructors		************************************/
	
	/**
	 * This constructor sets the street as passed, number as passed, city as passed,
	 * and postalCode as passed.
	 * @param street  The street of this Address.
	 * @param number  The number of this Address.
	 * @param city    The city of this Address.
	 * @param postalCode The postalCode of this Address.
	 */
	public Address(String street, String number, String city, String postalCode) {
		this.street = street;
		this.number = number;
		this.city = city;
		this.postalCode = postalCode;
	}

	/**
	 * Sets the street for this Address.
	 * @param street this is the street to set for Address.
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Sets the number for this Address.
	 * @param number this is the number to set for Address.
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * Sets the city for this Address.
	 * @param city this is the city to set for Address.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets the country for this Address.
	 * @param country this is the country to set for Address.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Sets the postal code for this Address.
	 * @param postalCode this is the postal code to set for Address.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * Returns the country for this Address.
	 * @return the country for this Address.
	 */
	public String getCountry() {
		return this.country;
	}
	/**
	 * Returns the street for this Address.
	 * @return the street for this Address.
	 */
	public String getStreet() {
		return this.street;
	}

	/**
	 * Returns the number for this Address.
	 * @return the number for this Address.
	 */
	public String getNumber() {
		return this.number;
	}

	/**
	 * Returns the city for this Address.
	 * @return the city for this Address.
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * Returns the postalCode for this Address.
	 * @return the postalCode for this Address.
	 */
	public String getPostalCode() {
		return this.postalCode;
	}

	/*	Accessors			************************************/

	
	
	
	/* Modifiers			************************************/

	
	
	
	/*	Normal Behavior	************************************/
	/**
	 * @return A formatted String representation of this Address, each field is
	 *         separated by a space in the format of an address
	 */
	public String formattedAddress() {
		
		String s = String.format("%s %s %s %s %s", number, street, postalCode, city, country);
		return s;
	}
	
	/**
	 * Convert this class into a meaningful string.
	 * @return	This object as a string showing the class and each instance variable name and value pair
	 */
	public String toString() {
		String s = String.format("<%s>: [Number = %s, Street = %s, Postal Code = %s, City = %s, Country = %s]",
				this.getClass().getSimpleName(), number, street, postalCode, city, country);
		return s;
	}
	
	
	
	
	
	/*	Helper Methods		************************************/
	


}