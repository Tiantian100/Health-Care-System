package myHealthCareSystem;

/**
 * This class represents the birth date for a patient.  A birth date, once created
 * cannot be changed.
 * 
 * TODO:	Document me
 * @author Jawaa Chen
 * @version 1.0
 * @see 
 * @since 21.0.1
 */
 
public class BirthDate {
	/*	Attributes			************************************/
	/** Birth day															*/
	private	final	int	day;
	/** Birth month.														*/
	private	final	int	month;
	/** Birth year.														*/
	private	final	int	year;	
	
	/*	Constructors		************************************/
	/**
	 * Create the birth date for this patient.
	 * @param year		Year of birth (4 numeric characters)
	 * @param month	Month of birth (01 thru 12) (2 digit month)
	 * @param day	Day of birth. (2 digit day, 01 thru 30... depending upon the month and year)
	 */
	public	BirthDate(int year, int month, int day)	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	/*	Accessors			************************************/
	/**
	 * Returns the day for this BirthDate
	 * @return the day for this BirthDate
	 */
	public int	getDay()		{	return day;			}
	/**
	 * Returns the month for this BirthDate
	 * @return the month for this BirthDate
	 */
	public int	getMonth()	{	return month;		}
	/**
	 * Returns the year for this BirthDate
	 * @return the year for this BirthDate
	 */
	public int	getYear()	{	return year;		}
	
	/* Modifiers			************************************/

	
	/*	Normal Behavior	************************************/
	/**
	 * @return A formatted String representation of this BirhDate, each field is
	 *         separated by a forward slash in the order of 2 digit year, month and day
	 */
	public String formattedBirthDate()	{
		/*	TODO:	write the code to return a formatted string for the birth date in the format
		 * 		yyyy/mm/dd
		 */
		
		String s = String.format("%04d/%02d/%02d", year, month, day);
		return s;
	}


	/**
	 * Convert this object into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString()	{
		return getClass().getName() + "[year=" + year + ", month=" + month + ", day=" + day + "]"; 
	}
	
	/*	Helper Methods		************************************/

}