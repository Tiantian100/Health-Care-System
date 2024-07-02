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
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024).
 * 
 */


/**
 * TODO:	Document me
 * @author Jawaa Chen
 * @version 1.0
 * @see 
 * @since 21.0.1
 * This class represents the EMHRecord of a person.
 */
public class EMHRecord {
	/*	TODO:	Implement the class based on the provided UML CLass diagram
	 * 		The class, methods, attributes must be documented using the javadoc comment format including appropriate @ tags
	 * 		e.g. @return, @param
	 * 
	 * 		Provide get and set methods for all attributes that are not accounted for as constructor parameters.
	 */

	private String reportingFacilityProvince;
	private String institutionNumber;
	private String functionalCentreAccount;
	private int encounterSequence;
	private String healthCareNumber;
	private String chartNumber;
	private String issuingProvince;
	private String residenceCode;
	private String gender;
	private int submissionYear;
	private String adminViaAmbulance;
	private int registrationDate;
	private int registrationTime;
	private BirthDate birthDate;
	
	/**
	 * This constructor sets the reportingFacilityProvince as passed, institutionNumber as passed, 
	 * chartNumber as passed, and healthCareNumber as passed.
	 * @param reportingFacilityProvince  The reportingFacilityProvince of this Record.
	 * @param institutionNumber  The institutionNumber of this Record.
	 * @param chartNumber    The chartNumber of this Record.
	 * @param healthCareNumber The healthCareNumber of this Record.
	 */
	public EMHRecord(String reportingFacilityProvince, String institutionNumber, String chartNumber, String healthCareNumber) {
		this.reportingFacilityProvince = reportingFacilityProvince;
		this.institutionNumber = institutionNumber;
		this.chartNumber = chartNumber;
		this.healthCareNumber = healthCareNumber;
		
	}
	/**
	 * Returns the functionalCentreAccount for this Record.
	 * @return the functionalCentreAccount for this Record.
	 */	
	public String getFunctionalCentreAccount() {
		return functionalCentreAccount;
	}
	
	/**
	 * Sets the functionalCentreAccount for this Record.
	 * @param functionalCentreAccount this is the functionalCentreAccount to set for Record.
	 */
	public void setFunctionalCentreAccount(String functionalCentreAccount) {
		this.functionalCentreAccount = functionalCentreAccount;
	}
	/**
	 * Returns the encounterSequence for this Record.
	 * @return the encounterSequence for this Record.
	 */	
	public int getEncounterSequence() {
		return encounterSequence;
	}

	/**
	 * Sets the encounterSequence for this Record.
	 * @param encounterSequence this is the encounterSequence to set for Record.
	 */
	public void setEncounterSequence(int encounterSequence) {
		this.encounterSequence = encounterSequence;
	}
	/**
	 * Returns the issuingProvince for this Record.
	 * @return the issuingProvince for this Record.
	 */	
	public String getIssuingProvince() {
		return issuingProvince;
	}
	
	/**
	 * Sets the issuingProvince for this Record.
	 * @param issuingProvince this is the issuingProvince to set for Record.
	 */
	public void setIssuingProvince(String issuingProvince) {
		this.issuingProvince = issuingProvince;
	}

	/**
	 * Returns the residenceCode for this Record.
	 * @return the residenceCode for this Record.
	 */	
	public String getResidenceCode() {
		return residenceCode;
	}

	/**
	 * Sets the residenceCode for this Record.
	 * @param residenceCode this is the residenceCode to set for Record.
	 */
	public void setResidenceCode(String residenceCode) {
		this.residenceCode = residenceCode;
	}
	/**
	 * Returns the gender for this Record.
	 * @return the gender for this Record.
	 */	
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender for this Record.
	 * @param gender this is the gender to set for Record.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns the submissionYear for this Record.
	 * @return the submissionYear for this Record.
	 */
	public int getSubmissionYear() {
		return submissionYear;
	}
	
	/**
	 * Sets the submissionYear for this Record.
	 * @param submissionYear this is the submissionYear to set for Record.
	 */
	public void setSubmissionYear(int submissionYear) {
		this.submissionYear = submissionYear;
	}

	/**
	 * Returns the adminViaAmbulance for this Record.
	 * @return the adminViaAmbulance for this Record.
	 */
	public String getAdminViaAmbulance() {
		return adminViaAmbulance;
	}
	/**
	 * Sets the adminViaAmbulance for this Record.
	 * @param adminViaAmbulance this is the adminViaAmbulance to set for Record.
	 */
	public void setAdminViaAmbulance(String adminViaAmbulance) {
		this.adminViaAmbulance = adminViaAmbulance;
	}
	/**
	 * Returns the registrationDate for this Record.
	 * @return the registrationDate for this Record.
	 */
	public int getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * Sets the registrationDate for this Record.
	 * @param registrationDate this is the registrationDate to set for Record.
	 */
	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}
	/**
	 * Returns the registrationTime for this Record.
	 * @return the registrationTime for this Record.
	 */
	public int getRegistrationTime() {
		return registrationTime;
	}
	
	/**
	 * Sets the registrationTime for this Record.
	 * @param registrationTime this is the registrationTime to set for Record.
	 */
	public void setRegistrationTime(int registrationTime) {
		this.registrationTime = registrationTime;
	}
	/**
	 * Returns the birthDate for this Record.
	 * @return the birthDate for this Record.
	 */
	public BirthDate getBirthDate() {
		return birthDate;
	}

	/**
	 * Sets the birthDate for this Record.
	 * @param birthDate this is the birthDate to set for Record.
	 */
	public void setBirthDate(BirthDate birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * Returns the reportingFacilityProvince for this Record.
	 * @return the reportingFacilityProvince for this Record.
	 */
	public String getReportingFacilityProvince() {
		return reportingFacilityProvince;
	}
	/**
	 * Sets the reportingFacilityProvince for this Record.
	 * @param reportingFacilityProvince this is the reportingFacilityProvince to set for Record.
	 */
	public void setReportingFacilityProvince(String reportingFacilityProvince) {
		this.reportingFacilityProvince = reportingFacilityProvince;
	}
	/**
	 * Returns the institutionNumber for this Record.
	 * @return the institutionNumber for this Record.
	 */
	public String getInstitutionNumber() {
		return institutionNumber;
	}
	/**
	 * Sets the institutionNumber for this Record.
	 * @param institutionNumber this is the institutionNumber to set for Record.
	 */
	public void setInstitutionNumber(String institutionNumber) {
		this.institutionNumber = institutionNumber;
	}
	/**
	 * Returns the healthCareNumber for this Record.
	 * @return the healthCareNumber for this Record.
	 */
	public String getHealthCareNumber() {
		return healthCareNumber;
	}
	/**
	 * Sets the healthCareNumber for this Record.
	 * @param healthCareNumber this is the healthCareNumber to set for Record.
	 */
	public void setHealthCareNumber(String healthCareNumber) {
		this.healthCareNumber = healthCareNumber;
	}
	/**
	 * Returns the chartNumber for this Record.
	 * @return the chartNumber for this Record.
	 */
	public String getChartNumber() {
		return chartNumber;
	}
	
	/**
	 * Sets the chartNumber for this Record.
	 * @param chartNumber this is the chartNumber to set for Record.
	 */
	public void setChartNumber(String chartNumber) {
		this.chartNumber = chartNumber;
	}

	/**
	 * Convert this class into a meaningful string.
	 * @return	This object as a string showing the class and each instance variable name and value pair
	 */
	public String toString() {
		String s = String.format("<%s>:\n Reporting Facility Province = %s\n Institution Number = %s\n Functional Centre Account = %s\n "
				+ "Encounter Sequence = %d\n HealthCareNumber = %s\n ChartNumber = %s\n issuingProvince = %s\n residenceCode = %s\n gender = %s\n "
				+ "submissionYear = %d\n adminViaAmbulance = %s\n registrationDate = %d\n registrationTime = %d\n birthDate = %s",
				this.getClass().getSimpleName(), reportingFacilityProvince, institutionNumber, functionalCentreAccount,
				encounterSequence, healthCareNumber, chartNumber, issuingProvince, residenceCode, 
				gender, submissionYear, adminViaAmbulance, registrationDate, registrationTime, birthDate.formattedBirthDate());
		return s;
	}

}
