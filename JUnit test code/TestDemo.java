package testMyHealthCareSystem;

import myHealthCareSystem.*;

/**
 * This is a simple test demo class for the health care system.
 * @author Jawaa Chen
 * @version 1.0
 * @see 
 * @since 21.0.1
 */
public class TestDemo {

	/**
	 * Main entry point for testing the health care assignment.
	 * @param args	Array of command line arguments input thru the VM
	 */
	public static void main(String[] args) {

		/*
		 * TODO: You must use the System.out.printf, formatted prints to show all health
		 * data as found in the EMRecord class (includes the parent class EMHRecord). Do not miss any item (includes any
		 * attributes which are complex objects, name, address etc.
		 *
		 *		Use the following standards guide to discover what field entries might look like for demo purposes.
		 *
		 * 	Field values and constraints can be found in the Standards guide
		 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428
		 *
		 */

//			sample test of BirthDate class
//			BirthDate bd = new BirthDate(1970,12,01);
//			System.out.println("BirtDate is:" + bd);
		
		EMRecord TestEMRecord = new EMRecord("Ontario", "53945", "0758459565", "014290123605");
		Name TestName = new Name("First", "Last");
		Address TestAddress = new Address("Street", "1", "Ottawa", "K2G 1V8");
		BirthDate TestBirthDate = new BirthDate(1999,01,01);
		
		TestEMRecord.setHeight(72);
		TestEMRecord.setWeight(180);
		TestEMRecord.setName(TestName);
		TestEMRecord.setAddress(TestAddress);
		TestEMRecord.setBirthDate(TestBirthDate);
		TestEMRecord.setFunctionalCentreAccount("123456789");
		TestEMRecord.setEncounterSequence(222);
		TestEMRecord.setIssuingProvince("Ontario");
		TestEMRecord.setResidenceCode("234");
		TestEMRecord.setGender("M");
		TestEMRecord.setSubmissionYear(1999);
		TestEMRecord.setAdminViaAmbulance("A");
		TestEMRecord.setRegistrationDate(19990214);
		TestEMRecord.setRegistrationTime(0000);
		
		
		System.out.println(TestEMRecord.toString());
		
		System.out.printf("BMI is: %d",TestEMRecord.bmi());
		
		
		/*	TODO: Calculate the BMI for your patient record here.
		 * 		use the static method in the MedicalCalculator class along with instance variables from the
		 * 		EMHRecord class.
		 */

		/*	You do not need to modify this piece of code, it is fine as it is.			*/
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}

}
